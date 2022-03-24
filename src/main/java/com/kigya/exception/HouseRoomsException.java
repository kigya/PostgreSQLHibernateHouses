package com.kigya.exception;

public class HouseRoomsException extends Exception {

    public HouseRoomsException() {
        super();
    }

    public HouseRoomsException(String message) {
        super(message);
    }

    public HouseRoomsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HouseRoomsException(Throwable cause) {
        super(cause);
    }

    public HouseRoomsException(String message, Throwable cause,
                               boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
