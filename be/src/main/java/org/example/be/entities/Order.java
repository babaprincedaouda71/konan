package org.example.be.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "commands")
@Data @NoArgsConstructor
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    //@JoinColumn(name = "id_customer")
    private Customer customer;

//    @Override
//    public String toString() {
//        return "Order{id=" + id + ", customer=" + (customer != null ? customer.getFirstName() : null) + "}";
//    }
}
