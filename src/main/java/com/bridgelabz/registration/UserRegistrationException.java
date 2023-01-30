package com.bridgelabz.registration;

public class UserRegistrationException extends Exception {

	enum ExceptionType {
		NULL, EMPTY
	}

	ExceptionType type;
	String message;

	public UserRegistrationException(ExceptionType type, String message) {
		this.type = type;
		this.message = message;
	}
}