package com.example.recruitmentweb.jobportal.domain.payload.request;

import com.example.recruitmentweb.jobportal.domain.enums.RoleName;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
    private RoleName role;

    @JsonProperty("recruiter_info")
    private RecruiterRequest recruiterRequest;
}
