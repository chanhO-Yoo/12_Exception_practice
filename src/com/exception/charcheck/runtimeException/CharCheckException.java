package com.exception.charcheck.runtimeException;

//예외 클래스 작성
public class CharCheckException extends RuntimeException{
	//constructor
	public CharCheckException() {
		
	}
	public CharCheckException(String message) {
		super(message);
	}
	public CharCheckException(Exception cause) {
		super(cause);
	}
	public CharCheckException(String message, Exception cause) {
		super(message, cause);
	}
	
	
}
