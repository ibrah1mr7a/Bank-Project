package com.example.thirdtry.service;

import com.example.thirdtry.dto.SignUpDTO;
import com.example.thirdtry.model.User;
import com.example.thirdtry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Service
public class UserSignupService {
    @Autowired
    private UserRepo repo;

    public ResponseEntity<String> signUp(@RequestBody SignUpDTO signUpDTO) {
        if (repo.findByFIN(signUpDTO.getFIN()) != null) {
            return ResponseEntity.badRequest().body("FIN already in use");
        }

        User user = new User();
        user.setFIN(signUpDTO.getFIN());
        user.setPass(signUpDTO.getPass());
        user.setName(signUpDTO.getName());
        user.setSurname(signUpDTO.getSurname());
        user.setBirthday(signUpDTO.getBirthday());

        repo.save(user);

        return ResponseEntity.ok("User registered successfully");
    }
}
