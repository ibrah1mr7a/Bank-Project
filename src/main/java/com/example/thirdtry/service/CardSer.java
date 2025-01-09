package com.example.thirdtry.service;

import com.example.thirdtry.model.Card;
import com.example.thirdtry.model.User;
import com.example.thirdtry.repository.CardRepo;
import com.example.thirdtry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CardSer {

    @Autowired
    CardRepo cardRepo;
    @Autowired
    UserRepo userRepo;
    public Card addCard(String cardType, int cardpassword, User user) {
        // Yeni kart obyektini yarat
        Card card = new Card();

        // Random olaraq cardNumber və cvv yarat
        card.setCardNumber(generateRandomCardNumber());
        card.setCvv(generateRandomCVV());


        // Kartın digər sahələrini təyin et
        card.setCardType(cardType); // Məsələn: Debit, Credit və s.
        card.setBalance(0.0); // Yeni kartın balansı 0-dır
        card.setCardPassword(cardpassword);

        // Kartı bazaya əlavə et
        return cardRepo.save(card);
    }

    // Random olaraq kart nömrəsi yaratma metodu
    private String generateRandomCardNumber() {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();
        String fixedPart="33558844";
        while (!cardRepo.equals(fixedPart+cardNumber))
        for (int i = 0; i < 8; i++) {
            int digit= random.nextInt(10); // Hər bölmə 4 rəqəmli olur
            cardNumber.append(digit);
        }
        cardNumber= new StringBuilder(fixedPart + cardNumber.toString());
        return cardNumber.toString();
    }

    // Random olaraq CVV yaratma metodu
    private int generateRandomCVV() {
        return new Random().nextInt(900) + 100; // 3 rəqəmli (100-999) CVV
    }

//    public void createCard(Long userId, Card card) {
//        User user = userRepo.findById(userId)
//                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
//
//        card.setUser(user);
//        cardRepo.save(card);
//
//    }
}
