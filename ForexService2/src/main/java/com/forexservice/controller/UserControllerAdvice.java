package com.forexservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.forexservice.exception.UserNotFoundException;


@RestControllerAdvice
public class UserControllerAdvice {

	   @ResponseStatus(code = HttpStatus.BAD_REQUEST)
		@ExceptionHandler(UserNotFoundException.class)
		public String exceptionHandler(Exception e) {
			return e.getMessage();
			

	   }
}
