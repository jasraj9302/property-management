package com.mycompany.property_management.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDTO {

    private Long id;
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;

    /*public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public Double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/
}
