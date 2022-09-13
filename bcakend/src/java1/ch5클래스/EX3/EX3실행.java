package java1.ch5클래스.EX3;

import java.util.Stack;

public class EX3실행 {

	// 배열 : 동일한 자료형의 데이터를 여러개 저장
		// 문제점 : int , String , double 서로 다른 타입을 하나의 배열 저장 불가능
		// 보안 ---> 클래스 사용하자~~ [ 서로 다른 메모리의 집합 ]
	
	public static void main(String[] args) {
		
		// 1. 배열만 사용했을때 버전
		String[] id = new String [100];
		int[] password = new int[100];
		String[] name = new String[100];
		int[] point = new int[100];
		String[] list = new String[100];
		
		// 2. 객체와 배열을 같이 사용했을때 버전
		Member [] memberlist = new Member[100];
	}
}
