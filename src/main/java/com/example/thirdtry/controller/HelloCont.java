package com.example.thirdtry.controller;

import com.example.thirdtry.repository.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCont {
@Autowired
private CardRepo cardRepo;

    @GetMapping("/Greet")
    public String Greeting() {
        return "Hello World";
    }
}
