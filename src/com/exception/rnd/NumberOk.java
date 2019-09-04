package com.exception.rnd;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {
	private static Scanner sc = new Scanner(System.in);
	private static Random rnd = new Random();
	private static int rndNum = rnd.nextInt(100)+1;
	private static int count = 0;
	
	public static void main(String[] args) {
		NumberOk no = new NumberOk();
		outer:
		while(true) {
			int input = no.getNumber();
			
			int check = no.checkNumber(input);
//			System.out.println(check);
			
			switch(check) {
			case 0:
				System.out.println("맞쳤습니다.("+count+"회)");
				System.out.print("계속 하시겠습니까?(y/n) : ");
				char more = sc.next().toLowerCase().charAt(0);
				if(more == 'n') {
					System.out.println("프로그램을 종료합니다.");
					break outer;
				}
				rndNum = rnd.nextInt(100)+1;
				count = 0;
				break;
			case 1:
				System.out.println("입력한 숫자보다 작습니다.");
				break;
			case -1:
				System.out.println("입력한 숫자보다 큽니다.");
				break;
			}
		}
	}
	
	public int getNumber() {
		int num;
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				sc.next();
			}
		}
		return num;
	}
	
	public int checkNumber(int num) {
		if(rndNum == num) {
			count++;
			return 0;
		}
		else if(rndNum > num) {
			count++;
			return -1;
		}
		else {
			count++;
			return 1;
		}
	}
}
