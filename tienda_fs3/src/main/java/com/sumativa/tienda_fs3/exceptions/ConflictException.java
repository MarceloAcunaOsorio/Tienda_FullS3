package com.sumativa.tienda_fs3.exceptions;

public class ConflictException extends RuntimeException{

    private static final long serialVersionUID = 1;

    public ConflictException(String message){
        super(message);
    }
    
}
