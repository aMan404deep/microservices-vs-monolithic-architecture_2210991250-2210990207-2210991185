package com.aditya.orderservice;

import lombok.*;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private double price;
}