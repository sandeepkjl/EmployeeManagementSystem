package org.employee.api.exception.subexception;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {

    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, String statusCode) {
        super(message);

    }
}

