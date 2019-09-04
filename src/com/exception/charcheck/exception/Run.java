package com.exception.charcheck.exception;

import java.util.Scanner;

import com.exception.number.exception.NumberProcess;
import com.exception.number.exception.NumberRangeException;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Run r = new Run();
		try {
			r.test1();
			r.test2();
		} catch(CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		} catch(NumberRangeException e) {
			System.out.println("1부터 100사이의 값이 아닙니다.");
		}
	}
	
	public void test1() throws CharCheckException {
		CharacterProcess cp = new CharacterProcess();
		
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		System.out.println(cp.countAlpha(inputStr));
	}
	
	public void test2() throws NumberRangeException {
		NumberProcess np = new NumberProcess();
		
		System.out.print("1번째 정수 입력 : ");
		int input1st = sc.nextInt();
		System.out.print("2번째 정수 입력 : ");
		int input2nd = sc.nextInt();
		
		if(np.checkDouble(input1st, input2nd)==true) {
			System.out.println(input1st+"는 "+input2nd+"의 배수입니다.");
		}
		else {
			System.out.println(input1st+"는 "+input2nd+"의 배수가 아닙니다.");
		}
	}
}
