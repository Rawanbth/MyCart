package com.udacity.store.controller;

import com.udacity.store.model.Order;
import com.udacity.store.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders/")
@CrossOrigin(origins = "http://localhost:4200")


public class OrderController {
// TODO: Use the mapping submit to add an API endpoint to fetch the products from the OrderRepository

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("order/{Id}")
    public Order getOrder(@PathVariable long id){
        return orderRepository.findById(id).get();
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("saveOrder")
    public Order saveOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }
}
