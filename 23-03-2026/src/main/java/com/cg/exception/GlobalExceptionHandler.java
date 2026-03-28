package com.cg.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.dto.ErrorInfo;

//import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
// This class will handle exceptions globally for all controllers in the application and return appropriate HTTP responses when exceptions occur.
public class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorInfo> handlerForPhoneNotFound(EmployeeNotFoundException ex) {
		ErrorInfo eInfo=new ErrorInfo(ex.getMessage(),HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND,LocalDateTime.now());

		return new ResponseEntity<>(eInfo,HttpStatus.NOT_FOUND);
	}

//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<String> handleValidation(MethodArgumentNotValidException ex) {
//	    return new ResponseEntity<>(
//	        ex.getBindingResult().getFieldError().getDefaultMessage(),
//	        HttpStatus.BAD_REQUEST
//	    );
//	}
	// This method handles validation exceptions that occur when method arguments
	// fail validation. It extracts the default error message from the first field
	// error and returns it in the response body with a 400 Bad Request status.

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex) {

		Map<String, String> errors = new HashMap<>();

//		ex.getBindingResult().getFieldErrors().forEach(error -> {
//			errors.put(error.getField(), error.getDefaultMessage());
//		});
		for(FieldError error : ex.getFieldErrors()) {
			errors.put(error.getField(), error.getDefaultMessage());
		}

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
}