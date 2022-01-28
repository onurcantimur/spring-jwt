package com.example.springjwt.repository;

import com.example.springjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String username);

    User findByEmail(String email);

}