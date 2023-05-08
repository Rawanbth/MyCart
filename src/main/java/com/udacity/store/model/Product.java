package com.udacity.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
// TODO: Add the details of the product class
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(updatable = false, nullable = false)
private Long id;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private String url;
    @Column
    private String description;

    public Product(String name, double price, String url, String description) {
        this.name = name;
        this.price = price;
        this.url = url;
        this.description = description;
    }
}
