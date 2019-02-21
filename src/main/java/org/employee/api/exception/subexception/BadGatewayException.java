package org.employee.api.exception.subexception;

public class BadGatewayException extends RuntimeException {

    public BadGatewayException(String message) {
        super(message);
    }

    public BadGatewayException(String message, String statusCode) {
        super(message);

    }
}
