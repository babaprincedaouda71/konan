package org.example.be.dto;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private Long id;
    private CustomerRequestDTO customerRequestDTO;
}
