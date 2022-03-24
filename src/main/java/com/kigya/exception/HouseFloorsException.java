package com.kigya.exception;

public class HouseFloorsException extends Exception {

    public HouseFloorsException() {
        super();
    }

    public HouseFloorsException(String message) {
        super(message);
    }

    public HouseFloorsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseFloorsException(Throwable cause) {
        super(cause);
    }

    public HouseFloorsException(String message, Throwable cause,
                                boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
