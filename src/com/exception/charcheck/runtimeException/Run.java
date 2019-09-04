package com.exception.charcheck.runtimeException;

import java.util.Scanner;

import com.exception.number.runtimeException.NumberProcess;

public class Run {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Run r = new Run();
		r.test1();
	}
	
	public void test1() {
		CharacterProcess cp = new CharacterProcess();
		
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		try {
			System.out.println(cp.countAlpha(inputStr));
		} catch(CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
	}
	
	public void test2() {
		NumberProcess np = new NumberProcess();
		System.out.print("1번째 정수를 입력하세요 : ");
		int input1st = sc.nextInt();
		System.out.print("2번째 정수를 입력하세요 : ");
		int input2nd = sc.nextInt();
		
		if(np.checkDouble(input1st, input2nd)==true) {
			System.out.println(input1st+"는 "+input2nd+"의 배수입니다,");
		}
		else {
			System.out.println(input1st+"는 "+input2nd+"의 배수가 아닙니다,");
		}
	}
}
