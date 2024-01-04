package org.example.be.controllers;

import lombok.AllArgsConstructor;
import org.example.be.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.example.be.entities.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @PostMapping("/cart")
    public Order createOder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @PutMapping("/orders/{perfumeId}/{orderId}")
    public void addPerfumeToOrder(@PathVariable Long perfumeId, @PathVariable Long orderId){
        orderService.addPerfumeToOrder(perfumeId, orderId);
    }
}
