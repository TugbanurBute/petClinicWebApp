package com.javadersleri.petclinic.exception;

public class VetNotFoundException extends RuntimeException{

    public VetNotFoundException(String message) {
        super(message);
    }
}
