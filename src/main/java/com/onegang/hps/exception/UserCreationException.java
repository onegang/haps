package com.onegang.hps.exception;

public class UserCreationException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserCreationException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserCreationException(String message) {
		super(message);
	}

}
