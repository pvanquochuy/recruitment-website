package com.example.recruitmentweb.jobportal.domain.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RecruiterRequest {
    @NotBlank
    private String gender;
    @Size(max = 11)
    private String phone;

    @NotBlank
    private String companyName;
    @NotBlank
    private String workplace;
    @NotBlank
    private String address;
    private String skypeAccount;
}
