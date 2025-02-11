package com.example.thirdtry.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardDTO {
    @NotBlank
    String cardNumber;
    @NotBlank
    String cardType;
}