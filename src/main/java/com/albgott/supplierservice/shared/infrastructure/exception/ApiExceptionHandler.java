package com.albgott.supplierservice.shared.infrastructure.exception;

import com.albgott.supplierservice.shared.domain.exception.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {
            WrongFormatException.class
    })
    @ResponseBody
    public ErrorMessage badRequest(HttpServletRequest request, DomainException exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(value = {
            ForbiddenException.class
    })
    @ResponseBody
    public ErrorMessage forbidden(HttpServletRequest request, DomainException exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = {
            UnauthorizedException.class
    })
    @ResponseBody
    public ErrorMessage unauthorized(HttpServletRequest request, DomainException exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {
            NotFoundExeption.class
    })
    @ResponseBody
    public ErrorMessage notFound(HttpServletRequest request, DomainException exception) {
        return new ErrorMessage(exception, request.getRequestURI());
    }

}
