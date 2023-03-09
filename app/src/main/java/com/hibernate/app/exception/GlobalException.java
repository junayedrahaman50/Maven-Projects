package com.hibernate.app.exception;

public class GlobalException extends RuntimeException {
	public GlobalException(String message) {
		//calling parent class constructor
		super(message);
	}

}
