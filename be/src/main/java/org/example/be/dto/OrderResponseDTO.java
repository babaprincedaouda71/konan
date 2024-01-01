package org.example.be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.be.entities.Customer;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class OrderResponseDTO {
    private Long id;
}
