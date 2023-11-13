package com.example.dependency.repository;

import com.example.dependency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByMailAndPassword(String mail, String password);
}
