package io.django.accounts.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long name;

    private String email;

    private String mobileNumber;
}
