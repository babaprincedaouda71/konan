package org.example.be.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "commands")
@Data @NoArgsConstructor
@JsonIgnoreProperties("customer")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @JsonBackReference
    @ManyToOne
    //@JoinColumn(name = "id_customer")
    private Customer customer;

//    @Override
//    public String toString() {
//        return "Order{id=" + id + ", customer=" + (customer != null ? customer.getFirstName() : null) + "}";
//    }
}
