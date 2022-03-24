package com.kigya.exception;

public class HouseAreaException extends Exception {

    public HouseAreaException() {
        super();
    }

    public HouseAreaException(String message) {
        super(message);
    }

    public HouseAreaException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseAreaException(Throwable cause) {
        super(cause);
    }

    public HouseAreaException(String message, Throwable cause,
                              boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
