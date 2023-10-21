package com.test.test.repo;

import com.test.test.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface users_repo extends JpaRepository<Users,Long> {
    ArrayList<Users> findUsersById(Long id);
}
