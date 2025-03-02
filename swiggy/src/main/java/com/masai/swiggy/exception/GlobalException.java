package com.masai.swiggy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(SwiggyException.class)
    public ResponseEntity<String> swiggyExceptionHandler(SwiggyException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> noHandlerException(NoHandlerFoundException e){
        return new ResponseEntity<>("there is no handler for this endpoint", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> notValidExceptionHandler(MethodArgumentNotValidException se){
        return new ResponseEntity<>(se.getMessage(),HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> GeneralExceptionHandler(Exception se){
        return new ResponseEntity<>(se.getMessage(),HttpStatus.BAD_REQUEST);
    }


}
