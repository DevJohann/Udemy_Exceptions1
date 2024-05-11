package co.demo.app.exceptions.exceptions.controller;

import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import co.demo.app.exceptions.exceptions.model.Error;

@RestControllerAdvice
public class HandlerExceptionController {
    
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divideByZero(Exception e){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("División por cero");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.internalServerError().body(error);
    } 

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundException(NoHandlerFoundException e){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("El recurso no existe");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Error> numberFormatException(NumberFormatException e){
        Error error = new Error();

        error.setDate(new Date());
        error.setError("No se puede parsear");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Error> noSuchUserException(NoSuchElementException e){
        Error error = new Error();

        error.setDate(new Date());
        error.setError("No existe este usuario");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }
    
}

