package com.example.jobportalapplication.exception;

public class JobApplicationException extends Exception {
    public JobApplicationException() {
        super();
    }

    public JobApplicationException(String message) {
        super(message);
    }

    public JobApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobApplicationException(Throwable cause) {
        super(cause);
    }

    protected JobApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
