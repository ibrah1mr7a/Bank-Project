package com.example.thirdtry.controller;

import com.example.thirdtry.model.Card;
import com.example.thirdtry.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class CardCont {

    @PostMapping("/{userId}/cards")
    public void createCard(@PathVariable("userId") int userId, @ModelAttribute Card card) {

    }

}
