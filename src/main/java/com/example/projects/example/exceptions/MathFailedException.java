package com.example.projects.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Mike on 9/4/2016.
 */
@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR, reason="There was an unexpected error while performing your calculation")
public class MathFailedException extends RuntimeException {

    public MathFailedException(String message, Exception ex) {
        super(message, ex);
    }

    public MathFailedException(Exception ex) {
        super(ex);
    }

    public MathFailedException(String message) {
        super(message);
    }

}
