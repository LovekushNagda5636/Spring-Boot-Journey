package com.example.demo.exception;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.utility.ResponseStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException ue){
		return new ResponseStatus(200,ue.getMessage());
	}
	@ExceptionHandler(org.springframework.web.servlet.resource.NoResourceFoundException.class)
	public String handleaNoResourceFoundException(org.springframework.web.servlet.resource.NoResourceFoundException e) {
		return "Page Not Found";
	}
	@RestControllerAdvice
	public class GlobalExceptionhandler {

	    @ExceptionHandler(NoSuchElementException.class)
	    public String handleNoSuchElementException(NoSuchElementException ex) {
	        return ex.getMessage();
	    }

	    // other exception handlers...
	}

	
}