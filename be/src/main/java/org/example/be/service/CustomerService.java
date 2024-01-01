package org.example.be.service;

import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Perfume;

import java.util.List;

public interface CustomerService {
    public void removeCustomer(Long id);
    public Customer findById(Long id);
    public List<Customer> getCustomers();
    public Customer addCustomer(Customer customer);
    public Customer updateCustomer(Long id, Customer customer);
}
