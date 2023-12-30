package org.example.be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PerfumeResponseDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
}
