package com.example.eventweb.registration;

import com.example.eventweb.dto.ServerResponse;
import com.example.eventweb.registration.dto.RegistrationRequest;

/**
 * @author Bikash Shah
 */
public interface RegistrationService {

   ServerResponse registerUser(RegistrationRequest registrationRequest);
}
