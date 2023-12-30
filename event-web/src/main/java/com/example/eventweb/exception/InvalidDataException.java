package com.example.eventweb.exception;

import com.example.eventweb.dto.ServerResponse;

public class InvalidDataException extends ServerException {

    public InvalidDataException(final String message) {
        super(message);
    }

    public InvalidDataException(final ServerResponse serverResponse) {
        super(serverResponse);
    }
}
