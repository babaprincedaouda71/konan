package org.example.be.mappers;

import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Perfume;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CustomerResponseDTO fromCustomer(Customer customer){
        return modelMapper.map(customer, CustomerResponseDTO.class);
    }

    public Customer fromCustomerDTO(CustomerRequestDTO customerRequestDTO){
        return modelMapper.map(customerRequestDTO, Customer.class);
    }
}
