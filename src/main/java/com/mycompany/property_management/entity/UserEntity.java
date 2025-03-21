package com.mycompany.property_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity                                                 //tell hibernate to make a table of following class
@Table(name = "USER_TABLE")                         //create table with given name
@Getter
@Setter
@NoArgsConstructor

public class UserEntity {

    @Id                                                  //Use to denote a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)      //generate a id automatically
    private long id;
    private String ownerName;
    @Column(name = "EMAIL",nullable = false)
    private String ownerEmail;
    private String phone;
    private String password;

}
