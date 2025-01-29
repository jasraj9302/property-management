package com.mycompany.property_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity                                                 //tell hibernate to make a table of following class
@Table(name = "PROPERTY_TABLE")                         //create table with given name
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity {

    @Id                                                  //Use to denote a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)      //generate a id automatically
    private long id;
    @Column(name = "PROPERTY_TITTLE",nullable = false)
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;
}
