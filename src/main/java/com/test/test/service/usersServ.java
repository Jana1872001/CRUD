package com.test.test.service;

import com.test.test.model.Users;

import java.util.List;
import java.util.Optional;


public interface usersServ {
   List<Users> findAllUsers();
   Optional<Users> findByID(long id);
   Users save(Users users);
   Users update(Users users);
   void deleteUserID(long id);
}
