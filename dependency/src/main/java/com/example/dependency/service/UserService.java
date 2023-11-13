package com.example.dependency.service;

import com.example.dependency.entity.User;
import com.example.dependency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //TODO DEPENDENCY INJECT EXAMPLE
    @Autowired
    UserRepository userRepository;

    public User login(User user) {
        User userr=userRepository.findUserByMailAndPassword(user.mail,user.password);
        return user;
    }
}
