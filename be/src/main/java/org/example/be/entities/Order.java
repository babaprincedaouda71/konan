package org.example.be.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.be.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "Orders")
@Data @NoArgsConstructor
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Customer customer;

    @ManyToMany(mappedBy = "orders", fetch = FetchType.EAGER)
    private List<Perfume> perfumes = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
