package com.sda.OnlineShop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class CustomerOrder {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn
    // Join C   se adauga pt generate foreign key
    private User user;

    @OneToMany(mappedBy = "customerOrder")
    private List<SelectedProduct> selectedProducts;

}
