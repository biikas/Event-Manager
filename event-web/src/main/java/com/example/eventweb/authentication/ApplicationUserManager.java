package com.example.eventweb.authentication;

import com.example.eventweb.config.ResponseMsg;
import com.example.eventweb.entity.ApplicationUser;
import com.example.eventweb.exception.UnauthorizedException;
import com.example.eventweb.repository.ApplicationUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Bikash Shah
 */
@Slf4j
@Component
public class ApplicationUserManager {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @Transactional(readOnly = true)
    public ApplicationUser loadUserByUsername(String userName) {
        Optional<ApplicationUser> user = applicationUserRepository.findByUserName(userName);
        if (user.isPresent()) {
            //valid username
            log.debug("Logged in application user : {}", user.get().getId());
            return user.get();
        }
        throw new UnauthorizedException(ResponseMsg.failureResponse("Invalid Username"));
    }
}
