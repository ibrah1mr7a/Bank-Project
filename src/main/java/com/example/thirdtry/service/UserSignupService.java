package com.example.thirdtry.service;

import com.example.thirdtry.dto.SignUpDTO;
import com.example.thirdtry.model.User;
import com.example.thirdtry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSignupService {

    private final UserRepo repo;

    @Autowired
    public UserSignupService(UserRepo repo) {
        this.repo = repo;
    }

    public void signUp(SignUpDTO signUpDTO) {
        if (repo.findByFIN(signUpDTO.getFIN()).isPresent()) {
            throw new IllegalArgumentException("Bu FIN artıq istifadə olunur");
        }

        User user = new User();
        user.setFIN(signUpDTO.getFIN());
        user.setName(signUpDTO.getName());
        user.setSurname(signUpDTO.getSurname());
        user.setBirthday(signUpDTO.getBirthday());

        repo.save(user);
    }
}
