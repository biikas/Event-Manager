package com.example.eventweb.registration.dto;

import com.example.eventweb.dto.ModelBase;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bikash Shah
 */
@Getter
@Setter
public class RegistrationRequest extends ModelBase {

    private String username;
    private String password;
    private String emailAddress;
    private String firstName;
    private String lastName;
}
