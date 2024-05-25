package com.example.cruddemo.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")

public class Product {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

}
