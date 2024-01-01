package org.example.be.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.example.be.entities.Perfume;
import org.example.be.repositories.CustomerRepository;
import org.example.be.repositories.OrderRepository;
import org.example.be.repositories.PerfumeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class OrderServiceImpl01 implements OrderService {
    private OrderRepository orderRepository;
    private PerfumeRepository perfumeRepository;
    private CustomerRepository customerRepository;
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
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

    @Override
    public void addCustomerToOrder(Long customerId, Long orderId) {
        Order order = findById(orderId);
        Customer customer = customerRepository.findById(customerId).get();
        order.setCustomer(customer);
    }
}
