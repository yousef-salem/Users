package com.example.Users.helper;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Hair class
@Embeddable
@Getter
@Setter
@Data
public class Hair {
    @Column(name = "hairColor")
    private String color;
    @Column(name = "hairType")
    private String type;


}