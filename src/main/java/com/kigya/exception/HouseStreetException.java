package com.kigya.exception;

public class HouseStreetException extends Exception {

    public HouseStreetException() {
        super();
    }

    public HouseStreetException(String message) {
        super(message);
    }

    public HouseStreetException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseStreetException(Throwable cause) {
        super(cause);
    }

    public HouseStreetException(String message, Throwable cause,
                                boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
