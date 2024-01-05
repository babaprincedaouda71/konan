package org.example.be.dto;

import lombok.Data;

@Data
public class OrderResponseDTO {
    private Long id;
    private CustomerResponseDTO customerResponseDTO;
}
