package com.example.thirdtry.service;

import com.example.thirdtry.model.Card;
import com.example.thirdtry.model.User;
import com.example.thirdtry.repository.CardRepo;
import com.example.thirdtry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardSer {

    @Autowired
    CardRepo cardRepo;
    @Autowired
    UserRepo userRepo;


//    public void createCard(Long userId, Card card) {
//        User user = userRepo.findById(userId)
//                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
//
//        card.setUser(user);
//        cardRepo.save(card);
//
//    }
}
