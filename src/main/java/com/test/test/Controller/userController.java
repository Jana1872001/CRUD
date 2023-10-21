package com.test.test.Controller;

import com.test.test.model.Users;
import com.test.test.repo.users_repo;
import com.test.test.service.usersServ;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
public class userController {

    @Autowired
    users_repo usersRepo ;
    private final usersServ userserv;

    public userController(usersServ userserv) {
        this.userserv = userserv;
    }
    @GetMapping("Users/{id}")
    public ResponseEntity<List<Users>> findAllUsers(@PathVariable("id") long id){
        return new ResponseEntity<>(usersRepo.findUsersById(id), HttpStatus.OK);
    }
    @GetMapping("./id")
    public Optional<Users> findUserByID(@PathVariable("id") long id){
        return userserv.findByID(id);
    }

    @PostMapping("addUsers")
    public  Users  addUser(@RequestBody Users users){
        return userserv.save(users);
    }

    @PutMapping("updateUsers/{id}")
    public Users update(@RequestBody Users users){
        return userserv.update(users);
    }
    @DeleteMapping("deleteUsers/{id}")
    public void delete(@PathVariable ("id") Long id){
        userserv.deleteUserID(id);
    }

}
