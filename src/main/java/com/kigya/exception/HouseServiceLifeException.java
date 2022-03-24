package com.kigya.exception;

public class HouseServiceLifeException extends Exception {

    public HouseServiceLifeException() {
        super();
    }

    public HouseServiceLifeException(String message) {
        super(message);
    }

    public HouseServiceLifeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseServiceLifeException(Throwable cause) {
        super(cause);
    }

    public HouseServiceLifeException(String message, Throwable cause,
                                     boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
