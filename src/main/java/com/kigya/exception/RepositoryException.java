package com.kigya.exception;

public class RepositoryException extends Exception {
    public RepositoryException(Exception e, String log) {
        super(log, e);
    }
}
