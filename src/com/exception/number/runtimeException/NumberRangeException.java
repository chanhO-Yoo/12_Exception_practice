package com.exception.number.runtimeException;

public class NumberRangeException extends RuntimeException{
	//constructor
	public NumberRangeException() {
		
	}
	public NumberRangeException(String message) {
		super(message);
	}
	public NumberRangeException(Exception cause) {
		super(cause);
	}
	public NumberRangeException(String message, Exception cause) {
		super(message, cause);
	}
}
