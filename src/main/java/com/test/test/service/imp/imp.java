package com.test.test.service.imp;

import com.test.test.model.Users;
import com.test.test.repo.users_repo;
import com.test.test.service.usersServ;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class imp implements usersServ {
    private final users_repo usersRepo;

    public imp(users_repo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public List<Users> findAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public Optional<Users> findByID(long id) {
        return usersRepo.findById(id);
    }

    @Override
    public Users save(Users users) {

        return usersRepo.save(users);
    }

    @Override
    public Users update(Users users) {
        return usersRepo.save(users);
    }

    @Override
    public void deleteUserID(long id) {
        usersRepo.deleteById(id);
    }
}
