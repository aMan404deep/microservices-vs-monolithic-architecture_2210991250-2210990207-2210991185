package com.aditya.monolithic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderRepo.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderRepo.findAll();
    }
}