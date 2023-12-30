package com.example.eventweb.registration;

import com.example.eventweb.config.ResponseMsg;
import com.example.eventweb.dto.ServerResponse;
import com.example.eventweb.entity.ApplicationUser;
import com.example.eventweb.registration.dto.ApplicationUserDTO;
import com.example.eventweb.registration.dto.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bikash Shah
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationManager registrationManager;
    @Autowired
    private RegistrationMapper registrationMapper;


    @Override
    public ServerResponse registerUser(RegistrationRequest registrationRequest) {
        registrationManager.checkIfApplicationUserAlreadyExists(registrationRequest.getUsername());

        ApplicationUser applicationUser = registrationMapper.convertToApplicationUser(registrationRequest);

        ApplicationUserDTO applicationUserDTO = registrationMapper.convertToApplicationUserDTO(registrationManager.saveApplicationUser(applicationUser));

        return ResponseMsg.successResponse("User Registered Successfully", applicationUserDTO);
    }
}
