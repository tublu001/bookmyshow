package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.SignUpUserRequestDto;
import com.scaler.bookmyshow.dtos.SignUpUserResponseDto;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpUserResponseDto signUpUser(SignUpUserRequestDto request) {
        User user = userService.signUpUser(
                request.getEmail(), request.getPassword()
        );

        SignUpUserResponseDto response = new SignUpUserResponseDto();
        response.setUserId(user.getId());

        return response;
    }
}
