package com.exception.number.exception;

public class NumberRangeException extends Exception{
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
