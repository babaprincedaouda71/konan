package org.example.be.controllers;

import lombok.AllArgsConstructor;
import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @GetMapping("/orders")
    public OrderResponseDTO createOder(@RequestBody OrderRequestDTO orderRequestDTO){
        return orderService.createOrder(orderRequestDTO);
    }
}
