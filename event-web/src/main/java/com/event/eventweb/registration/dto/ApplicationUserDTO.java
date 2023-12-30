package com.event.eventweb.registration.dto;

import com.event.eventweb.dto.ModelBase;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bikash Shah
 */
@Getter
@Setter
public class ApplicationUserDTO extends ModelBase {
    private String username;
    private String emailAddress;
}
