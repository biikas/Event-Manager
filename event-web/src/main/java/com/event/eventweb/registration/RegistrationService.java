package com.event.eventweb.registration;

import com.event.eventweb.registration.dto.RegistrationRequest;
import com.event.eventweb.dto.ServerResponse;

/**
 * @author Bikash Shah
 */
public interface RegistrationService {

   ServerResponse registerUser(RegistrationRequest registrationRequest);
}
