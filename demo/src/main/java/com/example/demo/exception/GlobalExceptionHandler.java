package com.example.demo.exception;

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
	public String handleNoResourceFoundException(org.springframework.web.servlet.resource.NoResourceFoundException e) {
		return "Page Not Found";
	}
	
}