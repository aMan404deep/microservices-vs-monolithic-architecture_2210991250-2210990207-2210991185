package com.aditya.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderRepo repo;

    public String placeOrder(Order order) {

        String url = "http://localhost:8081/products/" + order.getProductId();

        Product product = restTemplate.getForObject(url, Product.class);

        if (product == null) {
            return "Product not found!";
        }

        repo.save(order);
        return "Order placed successfully!";
    }
}