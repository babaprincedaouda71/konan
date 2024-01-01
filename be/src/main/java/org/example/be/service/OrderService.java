package org.example.be.service;

import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;

import java.util.List;

public interface OrderService {
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO);
    public List<OrderResponseDTO> getOrders();
    public Order findById(Long id);
    public void addPerfumeToOrder(Long perfumeId, Long orderId);
}
