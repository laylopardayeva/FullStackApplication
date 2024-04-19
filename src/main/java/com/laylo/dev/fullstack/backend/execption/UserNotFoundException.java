package com.laylo.dev.fullstack.backend.execption;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Could not found the user with id" + id);
    }
}
