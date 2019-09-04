package com.exception.charcheck.exception;

public class CharacterProcess {
	//constructor
	public CharacterProcess() {
		
	}

	//method
		//파라미터로 전달받은 문자열에서 영문자가 몇개인지 카운트 해서 리턴
		//단, 공백문자가 있으면, charCheckException발생
		public int countAlpha(String s) throws CharCheckException {
			int count = 0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					throw new CharCheckException();
				}
				else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
					count++;
				}
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
					count++;
				}
			}
			
			return count;
		}
		
}
