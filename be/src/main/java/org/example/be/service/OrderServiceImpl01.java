package org.example.be.service;

import lombok.AllArgsConstructor;
import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.example.be.mappers.OrderMapper;
import org.example.be.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl01 implements OrderService {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;
    @Override
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO) {
        Order order = orderMapper.fromOrderDTO(orderRequestDTO);
        orderRepository.save(order);
        return orderMapper.fromOrder(order);
    }
}
