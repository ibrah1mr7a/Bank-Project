package com.example.thirdtry.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long cardId;
     String cardnName;
     String cardNumber;
     LocalDate cardCreatingDate;
     LocalDate cardEndDate;
     Double balance;
     int cvv;
     int cardpassword;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @PrePersist
    public void prePersist() {
        if (cardCreatingDate == null) {
            cardCreatingDate = LocalDate.now();
        }
        cardEndDate = cardCreatingDate.plusYears(5);
    }

}
