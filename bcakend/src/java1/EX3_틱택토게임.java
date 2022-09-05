package java1;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임 {//class s

	public static void main(String[] args) {//main s
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[ ] 게임판 = { "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" };
		int 컴퓨터;
		
		// 2. 사용자에게 위치 입력받기
		while(true) {
			// 1. 게임판 출력 = 배열 내 모든 데이터 출력
			for( int i = 0; i<게임판.length ; i++ ) {//i는 0부터 마지막인덱스 ( 배열의 길이-1 ) 까지 1씩 증가
				System.out.print(게임판[i]);
				// 1-2 3줄마다 줄바꿈 처리
				if( i % 3 == 2 ) {
					System.out.println();
				}
			}
			while(true) {
			System.out.println("안내) 위치선택 : "); int 위치 = scanner.nextInt();
			if( 위치<0 || 위치>8 ) {System.out.println("안내) 선택할 수 없는 번호입니다.");}
			// 헤당 위치에 알이 없으면 알 두기
			if( 게임판[위치] .equals("[ ]") ) { 게임판[위치] = "[●]"; break; }
			else { System.out.println("안내) 이미 알이 존재하는 위치입니다."); }
			continue;	
					}//while e
			Random random = new Random();
			컴퓨터 = random.nextInt( 9 );
			if( 게임판[컴퓨터] .equals("[ ]") ) { 게임판[컴퓨터] = "[○]"; break;}
			}
			
			while(true) {
				if( 게임판[0] .equals("[●]") && 게임판[1] .equals("[●]") && 게임판[2] .equals("[●]") ) {
					System.out.println("안내) 흑돌 가로 승리");
			
				}
			}
		}//main e
	
	}//class e


		/*
		 * System.out.println("플레이어(흑돌) 위치를 입력해주세요"); int 흑돌 = scanner.nextInt(); if(
		 * 흑돌>=0 && 흑돌<=8 ){ System.out.println("안내) 플레이어(흑돌) 입력 완료");
		 * 
		 * for( int i = 0; i<게임판.length ; i++ ) {//i는 0부터 마지막인덱스 ( 배열의 길이-1 ) 까지 1씩 증가
		 * if( 게임판[흑돌] .equals("[ ]") ) { 게임판[흑돌] += "[●]"}
		 * 
		 *  Random random = new Random(9);
		 * 
		 * }
		 * 
		 * 
		 * System.out.print(게임판[i]);
		 * 
		 * // 1-2 3줄마다 줄바꿈 처리 if( i % 3 == 2 ) { System.out.println(); } }
		 * 
		 * 
		 * 
		 * }else {System.out.println("안내) 0~8사이로 입력해주세요");}
		 */
				


/*

	틱택토 게임
		[ 조건 ]
		1. 게임판 9칸 사용 -> 배열
			1.  string 배열	클래스는 비교 연산자 불가능 ==[X] --> 그래서 문자열.equals(문자열) 사용
			== : 문자열1.equals(문자열2)
			!= : !문자열1.equals(문자열2)
			
			
		2. 사용자가 알을 두고자하는 위치를 [ 인덱스 ]로 입력
			1. 선택된 위치가 이미 다른 알이 존재하면 재입력 [ 중복제거 ]
		3. 컴퓨터가 난수 생성 [ 0~8 ]
			1. 난수의 위치가 이미 다른 알이 존재하면 재생성 [ 중복제거 ]
		4. 승리자 판단 [ 1. 가로로 이기는 수 2. 세로로 이기는 수 3. 대각선으로 이기는 수 4. 무승부 ]
		
		[ 출력 ]
			1. 게임판 출력 예시
			[ ] [ ] [ ]
			[ ] [ ] [ ]
			[ ] [ ] [ ] 

*/