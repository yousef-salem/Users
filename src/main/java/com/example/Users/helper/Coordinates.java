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
public class Coordinates {
//@Column(name = "latitude")
    private double latitude;
//@Column(name = "longitude")
    private double longitude;



}