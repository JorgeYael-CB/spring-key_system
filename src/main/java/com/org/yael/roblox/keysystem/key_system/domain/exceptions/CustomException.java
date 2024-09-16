package com.org.yael.roblox.keysystem.key_system.domain.exceptions;



public class CustomException extends RuntimeException {

    private final String error;
    private final int status;

    private CustomException( String error, int status ){
        super(error);
        this.error = error;
        this.status = status;
    }


    public static CustomException BadRequestException( String error ){
        return new CustomException(error, 404);
    }

    public static CustomException UnexpectedException( String error ){
        return new CustomException(error, 415);
    }

    public static CustomException InternalServerError( String error ){
        System.out.println(error);
        return new CustomException("Unexpected error, please try again later", 500);
    }


    public String getError() {
        return error;
    }

    public int getStatus() {
        return status;
    }
}
