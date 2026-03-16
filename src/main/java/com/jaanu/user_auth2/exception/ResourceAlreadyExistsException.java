package com.jaanu.user_auth2.exception;

public class ResourceAlreadyExistsException extends RuntimeException {

    public ResourceAlreadyExistsException(String message){
        super(message);
    }
}
