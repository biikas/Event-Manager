package com.example.eventweb.exception;

import com.example.eventweb.dto.ServerResponse;
import org.springframework.http.HttpStatus;


public class UnauthorizedException extends ServerException {

    public UnauthorizedException(final String message) {
        super(message);
    }

    public UnauthorizedException(final ServerResponse serverResponse) {
        super(serverResponse);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.UNAUTHORIZED;
    }

    @Override
    public Integer getCode() {
        return 4001;
    }

}
