package com.example.thirdtry.controller;

import com.example.thirdtry.model.Card;
import com.example.thirdtry.model.User;
import com.example.thirdtry.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cards")
public class CardCont {

    @Autowired
    private CardService cardService;

    @PostMapping("/create")
    public Card createCard(@RequestParam String cardType,
                           @RequestParam String cardnumber,
                           @RequestParam String cardcreatingdate,
                           @RequestParam String cardenddate,
                           @RequestParam Double balance,
                           @RequestParam int cvv,
                           @RequestParam int cardpassword) {

        return cardService.createCard(cardType, cardnumber, cardcreatingdate, cardenddate, balance, cvv, cardpassword);
    }
}
