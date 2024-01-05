package org.example.be.mappers;

import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.OrderRequestDTO;
import org.example.be.dto.OrderResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class OrderMapper {
//    private final ModelMapper modelMapper = new ModelMapper();
    private CustomerMapper customerMapper;

    public OrderResponseDTO fromOrder(Order order){
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        BeanUtils.copyProperties(order, orderResponseDTO);
        orderResponseDTO.setCustomerResponseDTO(customerMapper.fromCustomer(order.getCustomer()));
//        return modelMapper.map(order, OrderResponseDTO.class);
        return orderResponseDTO;
    }

    public Order fromOrderDTO(OrderRequestDTO orderRequestDTO){
        Order order = new Order();
        BeanUtils.copyProperties(orderRequestDTO, order);
        order.setCustomer(customerMapper.fromCustomerDTO(orderRequestDTO.getCustomerRequestDTO()));
//        return modelMapper.map(orderRequestDTO, Order.class);
        return order;
    }
}
