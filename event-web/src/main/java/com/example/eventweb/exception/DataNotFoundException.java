package com.example.eventweb.exception;


import com.example.eventweb.dto.ServerResponse;

public class DataNotFoundException extends ServerException {

    public DataNotFoundException(final String message) {
        super(message);
    }

    public DataNotFoundException(final ServerResponse serverResponse) {
        super(serverResponse);
    }
}
