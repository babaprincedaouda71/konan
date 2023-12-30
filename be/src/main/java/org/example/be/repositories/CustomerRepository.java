package org.example.be.repositories;

import org.example.be.entities.Customer;
import org.example.be.entities.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
