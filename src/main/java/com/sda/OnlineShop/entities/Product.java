package com.sda.OnlineShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue
    private Integer productId;
    private String name;
    private Integer price;
    private String category;
    private Integer quantity;
    private String description;

}
