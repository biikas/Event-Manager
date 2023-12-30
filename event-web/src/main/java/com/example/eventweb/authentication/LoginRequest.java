package com.example.eventweb.authentication;

import com.example.eventweb.dto.ModelBase;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Bikash Shah
 */
@Data
public class LoginRequest extends ModelBase {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
