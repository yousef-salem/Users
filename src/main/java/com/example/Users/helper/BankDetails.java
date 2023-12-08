package com.example.Users.helper;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@Data
public class BankDetails {

    private String cardExpire;
    private String cardNumber;
    private String cardType;
    private String currency;
    private String iban;

}
