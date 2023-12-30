package com.event.eventweb.exception;


import com.event.eventweb.dto.ServerResponse;

public class DataNotFoundException extends ServerException {

    public DataNotFoundException(final String message) {
        super(message);
    }

    public DataNotFoundException(final ServerResponse serverResponse) {
        super(serverResponse);
    }
}
