package com.aditya.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @Autowired
    private OrderRepo repo;

    @PostMapping
    public String create(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return repo.findAll();
    }
}