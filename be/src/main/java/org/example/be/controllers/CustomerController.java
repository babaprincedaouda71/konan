package org.example.be.controllers;

import lombok.AllArgsConstructor;
import org.example.be.dto.CustomerRequestDTO;
import org.example.be.dto.CustomerResponseDTO;
import org.example.be.dto.PerfumeRequestDTO;
import org.example.be.dto.PerfumeResponseDTO;
import org.example.be.entities.Customer;
import org.example.be.entities.Perfume;
import org.example.be.service.CustomerService;
import org.example.be.service.PerfumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerResponseDTO> getCustomers(){
        List<CustomerResponseDTO> customers = customerService.getCustomers();
        return customers;
    }

    @PostMapping("/customers")
    public CustomerResponseDTO addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO){
        return customerService.addCustomer(customerRequestDTO);
    }

    @DeleteMapping("/customers/{id}")
    public void removeCustomer(@PathVariable Long id){
        customerService.removeCustomer(id);
    }

    @GetMapping("/customers/{id}")
    public CustomerResponseDTO findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PutMapping("/customers/{id}")
    public CustomerResponseDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerRequestDTO customerRequestDTO){
        return customerService.updateCustomer(id, customerRequestDTO);
    }
}
