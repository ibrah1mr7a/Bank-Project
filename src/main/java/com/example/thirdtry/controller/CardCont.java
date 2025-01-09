package com.example.thirdtry.controller;

import com.example.thirdtry.model.Card;
import com.example.thirdtry.model.User;
import com.example.thirdtry.service.CardSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class CardCont {

    @PostMapping("/{userId}/cards")
    public void createCard(@PathVariable("userId") int userId, @ModelAttribute Card card) {
    }

        @Autowired
        private CardSer cardService;

        @PostMapping("/add")
        public Card addCard(@RequestParam String cardType,
                            @RequestParam int cardpassword,
                            @RequestParam Long userId) {
            // İstifadəçini tap (dummy olaraq yaradılır, real tətbiqdə user xidməti vasitəsilə tapılmalıdır)
            User user = new User();
            user.getUserId(userId);
            // Yeni kart əlavə et
            return cardService.addCard(cardType, cardpassword, user);

        }
    }

