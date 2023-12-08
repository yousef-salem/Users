package com.example.Users.model;


import com.example.Users.helper.Address;
import com.example.Users.helper.BankDetails;
import com.example.Users.helper.CompanyDetails;
import com.example.Users.helper.Hair;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String maidenName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String username;
    private String password;
    private String birthDate;
    private String image;
    private String bloodGroup;
    private double height;
    private double weight;
    private String eyeColor;
    @Embedded
    private Hair hair;
    private String domain;
    private String ip;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "addressLine", column = @Column(name = "addressLine")),
            @AttributeOverride(name = "city", column = @Column(name = "city")),
            @AttributeOverride(name = "coordinates.latitude", column = @Column(name = "latitude")),
            @AttributeOverride(name = "coordinates.longitude", column = @Column(name = "longitude")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "postalCode")),
            @AttributeOverride(name = "state", column = @Column(name = "state"))
    })
    private Address address;

    private String macAddress;
    private String university;
    @Embedded
    private BankDetails bank;
    @Embedded
    private CompanyDetails company;
    private String ein;
    private String ssn;
    private String userAgent;



}
//@AttributeOverrides({
//        @AttributeOverride(name = "address.addressLine", column = @Column(name = "addressLine")),
//        @AttributeOverride(name = "address.city", column = @Column(name = "city")),
//        @AttributeOverride(name = "address.coordinates.latitude", column = @Column(name = "latitude")),
//        @AttributeOverride(name = "address.coordinates.longitude", column = @Column(name = "longitude")),
//        @AttributeOverride(name = "address.postalCode", column = @Column(name = "postalCode")),
//        @AttributeOverride(name = "address.state", column = @Column(name = "state"))
//})