package com.example.thirdtry.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     String id;
     String email;
     String accountpassword;
     String name;
     String surname;
    @OneToMany(mappedBy = "userFields", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Card> cards = new ArrayList<>();

}