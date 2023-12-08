package com.example.Users.helper;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@Data
public class Address {
    private String addressLine;
    private String city;
    @Embedded
    private Coordinates coordinates;
    private String postalCode;
    private String state;



}