package com.kigya.exception;

public class HouseNumberException extends Exception {

    public HouseNumberException() {
        super();
    }

    public HouseNumberException(String message) {
        super(message);
    }

    public HouseNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseNumberException(Throwable cause) {
        super(cause);
    }

    public HouseNumberException(String message, Throwable cause,
                                boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

