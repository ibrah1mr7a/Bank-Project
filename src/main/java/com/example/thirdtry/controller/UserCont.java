package com.example.thirdtry.controller;

import com.example.thirdtry.dto.SignUpDTO;
import com.example.thirdtry.service.UserSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCont {

    private final UserSignupService signupService;

    @Autowired
    public UserCont(UserSignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpDTO signUpDTO) {
        try {
            signupService.signUp(signUpDTO);
            return ResponseEntity.ok("İstifadəçi uğurla qeydiyyatdan keçdi");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}