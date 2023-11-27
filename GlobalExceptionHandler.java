package com.project.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException e){
		String message = e.getMessage();
		ApiResponse response=new ApiResponse(message,true,HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		
	}
	
}
