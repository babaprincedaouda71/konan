package org.example.be.service;

import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;

import java.util.List;

public interface OrderService {
    public Order createOrder(Order order);
    public List<Order> getOrders();
    public Order findById(Long id);
    public void addPerfumeToOrder(Long perfumeId, Long orderId);
    public void addCustomerToOrder(Long customerId, Long orderId);
}
