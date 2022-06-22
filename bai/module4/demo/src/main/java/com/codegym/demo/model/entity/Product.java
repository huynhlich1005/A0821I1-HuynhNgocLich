package com.codegym.demo.repository.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name not empty")
    @Size(max = 45,min = 2, message = "Length from 2 to 45")
    private String name;

    @Min(value = 1000,message = "Price should be greater than 1000")
    private int price;
    private String expDate;

    @NotBlank(message = "name cannot be empty")
    private String manufacture;

    private Integer CategoryID;

    public Product() {
    }

    public Product(Long id, String name, int price, String expDate, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.manufacture = manufacture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
