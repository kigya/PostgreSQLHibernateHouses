package com.kigya.exception;

public class HouseTypeException extends Exception {

    public HouseTypeException() {
        super();
    }

    public HouseTypeException(String message) {
        super(message);
    }

    public HouseTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseTypeException(Throwable cause) {
        super(cause);
    }

    public HouseTypeException(String message, Throwable cause,
                              boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
