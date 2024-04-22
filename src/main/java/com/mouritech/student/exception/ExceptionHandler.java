package com.mouritech.student.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandler {
	
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {InvalidFormatException.class})
	
	public ResponseEntity<String> handler(InvalidFormatException invalidFormatException)
	{
		return new ResponseEntity("Please follow correct format",HttpStatus.BAD_REQUEST);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {StudentIdNotFound.class})
	public ResponseEntity<Object> handling(StudentIdNotFound studentIdNotFound)
	{
		Exception exception =new Exception(
				studentIdNotFound.getMessage()
				);
		return new ResponseEntity(exception,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Map<String, String>> handlingConstraintViolationException(ConstraintViolationException r)
	{
		Map<String, String> maping =new HashMap<String, String>();
		Set<ConstraintViolation<?>> set =r.getConstraintViolations();
		for(ConstraintViolation e:set)
		{
			String s=e.getMessage().toString();
			String s1=e.getMessage();
			maping.put(s, s1);
		}
		return new ResponseEntity<Map<String,String>>(maping,HttpStatus.OK);
	}

	

}
