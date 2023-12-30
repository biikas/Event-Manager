package com.example.eventweb.exception;

import com.example.eventweb.dto.ServerResponse;

public class ResourceAlreadyExistException extends ServerException {

    public ResourceAlreadyExistException(final String message) {
        super(message);
    }

    public ResourceAlreadyExistException(final ServerResponse serverResponse) {
        super(serverResponse);
    }
}
