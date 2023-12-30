package com.example.eventweb.authentication;

import com.example.eventweb.dto.ServerResponse;

public interface AuthService {

    ServerResponse login(LoginRequest loginRequest);

}
