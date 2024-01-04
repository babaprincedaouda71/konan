package org.example.be.dto;

import lombok.Data;

@Data
public class CustomerRequestDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String addressMail;
    private String phoneNumber;
}
