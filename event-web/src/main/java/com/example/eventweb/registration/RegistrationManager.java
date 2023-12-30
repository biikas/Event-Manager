package com.example.eventweb.registration;

import com.example.eventweb.entity.ApplicationUser;
import com.example.eventweb.exception.ResourceAlreadyExistException;
import com.example.eventweb.repository.ApplicationUserRepository;
import com.example.eventweb.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Bikash Shah
 */
@Component
public class RegistrationManager {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    public void checkIfApplicationUserAlreadyExists(String username) {
        Optional<ApplicationUser> optionalApplicationUser = applicationUserRepository.findByUserName(username);
        if (optionalApplicationUser.isPresent()) {
            throw new ResourceAlreadyExistException(ResponseMsg.failureResponse("Username already exists"));
        }
    }

    public String generatePassword(String username){
        return passwordEncoder.encode(username);
    }

    public String generateFullName(String firstName, String lastName) {
        // Concatenate the first name and last name with a space in between
        return firstName + " " + lastName;
    }

    public ApplicationUser saveApplicationUser(ApplicationUser applicationUser){
        return applicationUserRepository.save(applicationUser);
    }
}
