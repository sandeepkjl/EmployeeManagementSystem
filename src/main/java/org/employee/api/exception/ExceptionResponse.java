package org.employee.api.exception;


import java.util.Date;

public class ExceptionResponse
{
    private Date date;
    private String msg;
    private String error;
    private String statusCode;
    private String details;

    public ExceptionResponse() {
    }

    public ExceptionResponse(Date date, String msg, String error, String statusCode, String details) {
        this.date = date;
        this.msg = msg;
        this.error=error;
        this.statusCode=statusCode;
        this.details = details;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "date=" + date +
                ", msg='" + msg + '\'' +
                ", error='" + error + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
