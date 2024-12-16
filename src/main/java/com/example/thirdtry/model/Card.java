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
}
