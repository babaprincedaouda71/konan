package org.example.be.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Orders")
@Data @NoArgsConstructor
@JsonIgnoreProperties("customer")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    //@JoinColumn(name = "id_customer")
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Customer customer;
    //@ManyToMany
    //private List<Perfume> perfumes;

//    @Override
//    public String toString() {
//        return "Order{id=" + id + ", customer=" + (customer != null ? customer.getFirstName() : null) + "}";
//    }
}
