package org.example.be.entities;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonProperty;
>>>>>>> 2c89513 (konan-be-01 01/01/2023)
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Perfume {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Order> orders = new ArrayList<>();
}
