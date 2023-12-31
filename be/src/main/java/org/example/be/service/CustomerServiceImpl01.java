package org.example.be.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.mappers.CustomerMapper;
import org.example.be.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
@Transactional
public class CustomerServiceImpl01 implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    @Override
    public List<CustomerResponseDTO> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<>();
        customers.forEach(customer -> {
            CustomerResponseDTO customerResponseDTO = customerMapper.fromCustomer(customer);
            customerResponseDTOList.add(customerResponseDTO);
        });
        return customerResponseDTOList;
    }

    @Override
    public CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerMapper.fromCustomerDTO(customerRequestDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return customerMapper.fromCustomer(savedCustomer);
    }

    @Override
    public void removeCustomer(Long id) {
        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
    }

    @Override
    public CustomerResponseDTO findByIdDTO(Long id) {
        Customer customer = customerRepository.findById(id).get();
        return customerMapper.fromCustomer(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerRepository.findById(id).get();
        customer.setFirstName(customerRequestDTO.getFirstName());
        customer.setLastName(customerRequestDTO.getLastName());
        customer.setAddressMail(customerRequestDTO.getAddressMail());
        customer.setPhoneNumber(customerRequestDTO.getPhoneNumber());
        Customer savedCustomer = customerRepository.save(customer);
        return customerMapper.fromCustomer(savedCustomer);
    }
}
