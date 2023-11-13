package com.example.dependency.control;

import com.example.dependency.entity.User;
import com.example.dependency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserControl {

//TODO DEPENDENCY INJECT EXAMPLE (lombok)
    public final UserService userService;


    public User login(User user){
        return userService.login(user);
    }

    }


