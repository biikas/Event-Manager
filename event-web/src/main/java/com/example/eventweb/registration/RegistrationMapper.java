package com.example.eventweb.registration;

import com.example.eventweb.entity.ApplicationUser;
import com.example.eventweb.registration.dto.ApplicationUserDTO;
import com.example.eventweb.registration.dto.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Bikash Shah
 */
@Component
public class RegistrationMapper {

    @Autowired
    private RegistrationManager registrationManager;

    public ApplicationUser convertToApplicationUser(RegistrationRequest registrationRequest) {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setUsername(registrationRequest.getUsername());
        applicationUser.setPassword(registrationManager.generatePassword(registrationRequest.getPassword()));
        applicationUser.setName(registrationManager.generateFullName(registrationRequest.getFirstName(), registrationRequest.getLastName()));
        applicationUser.setEmailAddress(registrationRequest.getEmailAddress());
        applicationUser.setActive('Y');
        applicationUser.setCreatedDate(new Date());
        applicationUser.setFirstName(registrationRequest.getFirstName());
        applicationUser.setLastName(registrationRequest.getLastName());
        return applicationUser;
    }

    public ApplicationUserDTO convertToApplicationUserDTO(ApplicationUser applicationUser){
        ApplicationUserDTO applicationUserDTO = new ApplicationUserDTO();
        applicationUserDTO.setUsername(applicationUser.getUsername());
        applicationUserDTO.setEmailAddress(applicationUser.getEmailAddress());
        return applicationUserDTO;
    }
}
