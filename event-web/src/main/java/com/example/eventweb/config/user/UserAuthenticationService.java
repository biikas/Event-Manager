package com.example.eventweb.config.user;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserAuthenticationService {

    Optional<UserDetails> findByToken(String token);

}
