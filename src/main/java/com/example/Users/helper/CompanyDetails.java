package com.example.Users.helper;

import com.example.Users.helper.Address;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// CompanyDetails class
@Embeddable
@Getter
@Setter
@Data
public class CompanyDetails {
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "addressLine", column = @Column(name = "companyAddressLine")),
            @AttributeOverride(name = "city", column = @Column(name = "companyCity")),
            @AttributeOverride(name = "coordinates.latitude", column = @Column(name = "companyLatitude")),
            @AttributeOverride(name = "coordinates.longitude", column = @Column(name = "companyLongitude")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "companyPostalCode")),
            @AttributeOverride(name = "state", column = @Column(name = "companyState"))
    })
    private Address address;
    @Column(name = "companyDepartment")
    private String department;
    @Column(name = "companyName")
    private String name;
    @Column(name = "companyTitle")
    private String title;


}