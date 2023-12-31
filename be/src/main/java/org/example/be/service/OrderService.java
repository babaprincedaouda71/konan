package org.example.be.service;

import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;

import java.util.List;

public interface OrderService {
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO);
    public List<OrderResponseDTO> getOrders();

    public OrderResponseDTO setCustomer(Customer customer);
}
