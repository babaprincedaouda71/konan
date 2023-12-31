package org.example.be.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String addressMail;
    private String phoneNumber;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Order> orders;

//    @Override
//    public String toString() {
//        return "Customer{id=" + id + "}";
//    }
}
