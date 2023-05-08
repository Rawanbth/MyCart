package com.udacity.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
//TODO: Add the details of the order class
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(updatable = false, nullable = false)
private long id;
    @Column
    private String name;
    @Column
    private double total;

}
