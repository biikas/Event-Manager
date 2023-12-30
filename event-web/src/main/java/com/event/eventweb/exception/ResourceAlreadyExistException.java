package com.event.eventweb.exception;

import com.event.eventweb.dto.ServerResponse;

public class ResourceAlreadyExistException extends ServerException {

    public ResourceAlreadyExistException(final String message) {
        super(message);
    }

    public ResourceAlreadyExistException(final ServerResponse serverResponse) {
        super(serverResponse);
    }
}
