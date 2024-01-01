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
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void removeCustomer(@PathVariable Long id){
        customerService.removeCustomer(id);
    }

    @GetMapping("/customers/{id}")
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);
    }
}
