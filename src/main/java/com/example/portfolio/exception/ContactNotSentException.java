package com.example.portfolio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ContactNotSentException extends RuntimeException{
    public ContactNotSentException(String message) {
        super (message);
    }
}
