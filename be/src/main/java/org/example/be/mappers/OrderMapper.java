package org.example.be.mappers;

import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public OrderResponseDTO fromOrder(Order order){
        return modelMapper.map(order, OrderResponseDTO.class);
    }

    public Order fromOrderDTO(OrderRequestDTO orderRequestDTO){
        return modelMapper.map(orderRequestDTO, Order.class);
    }
}
