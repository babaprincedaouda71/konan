package org.example.be.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.mappers.CustomerMapper;
import org.example.be.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class CustomerServiceImpl01 implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerResponseDTO> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOS = customers.stream().map(customer -> customerMapper.fromCustomer(customer)).collect(Collectors.toList());
        return customerResponseDTOS;
    }

    @Override
    public void removeCustomer(Long id) {
        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer byId = findById(id);
        byId.setFirstName(customer.getFirstName());
        byId.setLastName(customer.getLastName());
        byId.setAddressMail(customer.getAddressMail());
        byId.setPhoneNumber(customer.getPhoneNumber());
        return customerRepository.save(byId);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }
}
