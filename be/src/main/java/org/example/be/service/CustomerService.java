package org.example.be.service;

import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Perfume;

import java.util.List;

public interface CustomerService {
    public List<CustomerResponseDTO> getCustomers();

    public CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO);

    public void removeCustomer(Long id);

    public CustomerResponseDTO findById(Long id);

    public CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO customerRequestDTO);
}
