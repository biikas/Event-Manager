package com.event.eventweb.authentication;

import com.event.eventweb.dto.ServerResponse;

public interface AuthService {

    ServerResponse login(LoginRequest loginRequest);

}
