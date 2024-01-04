package org.example.be.dto;

import lombok.Data;

@Data
public class PerfumeResponseDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
}
