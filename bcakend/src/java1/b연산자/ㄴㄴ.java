package java1.b연산자;

import java.util.Scanner;

public class ㄴㄴ {

	public static void main(String[] args) {
		
		int 문제3 = Scanner.nextInt();	//똑같이 썼는데 왜 오류?
		String 결과3 = 문제3 % 7 == - ? "7배수 맞습니다" : "7배수 아니다";
		
		System.err.println("결과 3 : "+결과3);
	}
	
}


