package org.employee.api.exception;


import javassist.tools.web.BadHttpRequest;
import org.employee.api.exception.subexception.BadGatewayException;
import org.employee.api.exception.subexception.BadRequestException;
import org.employee.api.exception.subexception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class CustomizedExceptionController
{
    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequest(BadRequestException ex, WebRequest request)
    {
        ExceptionResponse exceptionResponse=new ExceptionResponse(
                new Date(), ex.getMessage(),"Bad Request Exception", "400", request.getDescription(false)
        );

        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFound(NotFoundException ex, WebRequest request)
    {
        ExceptionResponse exceptionResponse =new ExceptionResponse(
                new Date(), ex.getMessage(), "Not Found Exception", "404", request.getDescription(false));

                return new ResponseEntity<>(exceptionResponse,HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(BadGatewayException.class)
    public final ResponseEntity<ExceptionResponse> handleBadGateway(BadRequestException ex, WebRequest request)
    {
        ExceptionResponse exceptionResponse =new ExceptionResponse(
                new Date(), ex.getMessage(), "The request was not completed. The server received an invalid response from the upstream server.", "502", request.getDescription(false));

        return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_GATEWAY);
    }

}
