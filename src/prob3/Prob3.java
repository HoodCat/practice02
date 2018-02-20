package prob3;

import java.util.Arrays;

public class Prob3 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	
	public static void printCharArray(char[] charArray) {
		System.out.println(new String(charArray));
	}
	
	public static void replaceSpace(char[] charArray) {
		for(int i=0 ; i<charArray.length ; i++) {
			if(charArray[i] == ' ') {
				charArray[i] = ',';
			}
		}
	}
	
}
