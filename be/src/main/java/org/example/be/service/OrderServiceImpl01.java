package org.example.be.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.example.be.entities.Perfume;
import org.example.be.mappers.OrderMapper;
import org.example.be.repositories.OrderRepository;
import org.example.be.repositories.PerfumeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class OrderServiceImpl01 implements OrderService {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;
    private PerfumeRepository perfumeRepository;
    @Override
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO) {
        Order order = orderMapper.fromOrderDTO(orderRequestDTO);
        orderRepository.save(order);
        return orderMapper.fromOrder(order);
    }

    @Override
    public List<OrderResponseDTO> getOrders() {
        List<Order> orderList = orderRepository.findAll();
        List<OrderResponseDTO> orderResponseDTOList = new ArrayList<>();
        orderList.forEach(order -> {
            OrderResponseDTO orderResponseDTO = orderMapper.fromOrder(order);
            orderResponseDTOList.add(orderResponseDTO);
        });
        return orderResponseDTOList;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void addPerfumeToOrder(Long perfumeId, Long orderId) {
        Order order = findById(orderId);
        Perfume perfume = perfumeRepository.findById(perfumeId).get();
        order.getPerfumes().add(perfume);
        perfume.getOrders().add(order);
    }
}
