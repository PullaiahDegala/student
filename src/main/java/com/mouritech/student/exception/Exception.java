package com.mouritech.student.exception;



public class Exception {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception(String message) {
		super();
		this.message = message;
	}

	public Exception() {
		super();
	}
	

}
