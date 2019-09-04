package com.exception.number.runtimeException;

public class NumberProcess {
	//constructor
	public NumberProcess() {
		
	}
	
	//method
	public boolean checkDouble(int a, int b) {
		boolean check = true;
		if((a>=1 && a<=100) && (b>=1 && b<=100)) {
			if(a%b == 0) {
				check = true;
			}
			else {
				check = false;
			}
		}
		else {
			throw new NumberRangeException();
		}
		
		
		return check;
	}
}
