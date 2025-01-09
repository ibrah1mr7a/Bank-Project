package com.example.thirdtry.service;


import com.example.thirdtry.model.Card;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    public Card createCard(String cardType, String cardnumber, String cardcreatingdate, String cardenddate, Double balance, int cvv, int cardpassword) {
        Card card = new Card();
        card.setCardType(cardType);
        card.setCardnumber(cardnumber);
        card.setCardcreatingdate(cardcreatingdate);
        card.setCardenddate(cardenddate);
        card.setBalance(balance);
        card.setCvv(cvv);
        card.setCardpassword(cardpassword);
        return card;
    }
}
