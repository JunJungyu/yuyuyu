package java1.ch10예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;
import javax.script.ScriptContext;

public class EX4_실행 {

	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		try {
			
			System.out.println("1. 회원가입 2. 로그인");
			int ch = scanner.nextInt();
			scanner = new Scanner(System.in);
			
			
			
			
		} catch ( InputMismatchException e) {System.out.println("숫자를 입력해주세요.");}
		} ctach( Exception e ){ System.out.println("예상치 못한 오류 발생 : 초기화면 갑니다."); }
	}
}


	