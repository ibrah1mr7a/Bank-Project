package com.example.thirdtry.controller;

import com.example.thirdtry.dto.SignUpDTO;
import com.example.thirdtry.service.UserSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserCont {

    @Autowired
    private UserSignupService userSignupService;

    @PostMapping("/signup") // Specific endpoint for signup requests
    public ResponseEntity<String> signup(@RequestBody SignUpDTO signUpDTO) {
        ResponseEntity<String> response = userSignupService.signUp(signUpDTO);
        return response;
    }

}
