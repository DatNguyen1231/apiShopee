package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;

    private int quantityCart;

    private int status;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;





    // Getters and setters
}
