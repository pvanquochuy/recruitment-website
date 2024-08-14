package com.example.recruitmentweb.jobportal.service;

import com.example.recruitmentweb.jobportal.domain.payload.request.SignUpRequest;

import java.net.URI;

public interface AuthService {
    URI registerAccount(SignUpRequest request);
}
