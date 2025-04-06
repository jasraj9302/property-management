package com.mycompany.property_management.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity                                                 //tell hibernate to make a table of following class
@Table(name = "ADDRESS_TABLE")                         //create table with given name
@Getter
@Setter
@NoArgsConstructor
public class AddressEntity {
    @Id                                                  //Use to denote a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)      //generate a id automatically
    private long id;
    private String houseNo;
    private String street;
    private String city;
    private String postalCode;
    private String country;

    @OneToOne
    @JoinColumn(name = "USER_ID",nullable = false)
    private UserEntity userEntiy;

}
