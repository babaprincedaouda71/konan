package org.example.be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String addressMail;
    private String phoneNumber;
}
