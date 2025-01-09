package com.example.thirdtry.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING) // Enum-u String kimi saxlayır
    @Column(nullable = false)
    CardType cardType; // Kart növü


    String cardname;
    String cardnumber;
    String cardcreatingdate;
    String cardenddate;
    Double balance;
    int cvv;
    int cardpassword;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Foreign key column in the Card table
    User user;


    public enum CardType {
        CASHBACK("CashBack"),
        BANKING("Banking"),
        DEBIT("Debit"),
        CREDIT("Credit");

        private final String value;

        CardType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static boolean isValid(String cardType) {
            for (CardType type : CardType.values()) {
                if (type.getValue().equalsIgnoreCase(cardType)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void setCardType(String cardType) {
        if (!CardType.isValid(cardType)) {
            throw new IllegalArgumentException("Kart növü yalnız 'CashBack', 'Banking', 'Debit' və ya 'Credit' ola bilər.");
        }
        this.cardType = CardType.valueOf(cardType.toUpperCase());
    }
}

