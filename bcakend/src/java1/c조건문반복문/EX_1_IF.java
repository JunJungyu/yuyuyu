package java1.c조건문반복문;//패키지명

//1. 클래스 선언
public class EX_1_IF {//class s

	//2. main 클래스 읽어주는 메소드
	public static void main(String[] args) {//main s
		
		// 예1) 참 실행문이 1개일때는 중괄호 생략 가능
		if( 3 > 1 ) System.out.println("예) 3이 1보다 크다.");
		
		// 예2) : 조건이 true이면 실행 아니면 실행X
		if( 3 > 5 ) System.out.println("예) 3이 5보다 크다. ");			//노란색이면 아직 실행되지 않았다는 뜻
		
		// 예3) p.136	[ 예상 : 점수가 93점이기때문에 첫번째 if만 실행 ]
		int score = 93;
		if( score >= 90 ) {//실행문(;) 2개 이상이면 중괄호로 묶음/안묶으면 if에 포함되지도 않고 그냥..별개의 출력임
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		if( score < 90 ) {
			System.out.println("점수가 90점보다 작습니다.");
			System.out.println("등급은 B등급입니다.");
		}//if e 만약 중괄호를 묶지 않으면 if와 상관없는걸로 보기 때문에 출력됨
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		//에제4
		int score2 = 85;
			//변수 선언 시 중복 이름 불가능 - 아까 score했으니까 이번엔 2
		
		if( score2 >= 90 ) {//85>-90 -> false면 중괄호 안으로 못들어옴 -> 실행X
			System.out.println("에제4) 점수가 90보다 큽니다.");
			System.out.println("에제4) 등급은 A등급입니다.");
		}else{
			System.out.println("에제4) 점수가 90보다 작습니다.");
			System.out.println("에제4) 등급은 B등급입니다.");
		}
		
		// 예제5 ) p.138		조건이 다수일때 if ~ else if	( 하나의 true )	2.  ( 다수의 true ) if 다중
		int score3 = 75;
		
		if ( score3 >= 90 ) { System.out.println("점수가 100~90입니다.");		 System.out.println("등급은 A등급입니다.");}
		else if ( score3 >= 80 ) { System.out.println("점수가 80~89입니다."); 	 System.out.println("등급은 B등급입니다.");}
		else if ( score3 >= 70 ) { System.out.println("점수가 70~79입니다.");	 System.out.println("등급은 C등급입니다.");}			
		else { System.out.println("점수가 70점 미만입니다."); System.out.println("등급은 D등급입니다.");}		
		//vs
		if ( score3 >= 90 ) { System.out.println("점수가 100~90입니다."); 		System.out.println("등급은 A등급입니다.");}
		if ( score3 >= 80 ) { System.out.println("점수가 80~89입니다."); 		System.out.println("등급은 B등급입니다.");}
		if ( score3 >= 70 ) { System.out.println("점수가 70~79입니다."); 		System.out.println("등급은 C등급입니다.");}
		if ( score3 < 70 ){ System.out.println("점수가 70점 미만입니다."); 		System.out.println("등급은 D등급입니다.");}
	
		// 예제6 if 중첩
		int score4 = 95;	char 성별 = 'M';
		if( score4 == 100 ) {
			if( 성별 == 'M' ) { System.out.println("100점이면서 남자이다."); }
			else { System.out.println("100점이면서 여자이다."); }
		}else {
			if( 성별 == 'F' ) {
				System.out.println("100점이 아니면서 여자이다.");
			}else { System.out.println("100점이 아니면서 남자이다."); }
		}//if e
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main e
	
	
	
}//class e

/*

	IF문 : 조건식의 결과에 따라 블록 실행 여부 결정
		if( 조건식 )
				{ 조건이 true }
	- 조건식 : true · false / 를 만들 수 있는 비교연산자/논리연산자/변수/함수가 들어옴~ 뭐가 됐던 결과가 t or f  이면 됨.

		if 형태
			1.
				if ( 조건 ) 참								:참[true] 위치에 
			
			2.
				if ( 조건 ) { 참 } 
			
			3. 
				if ( 조건 ) { 참 }
					else{ 거짓 }

			4. 
				if ( 조건 ) { 참 }
				else if ( 조건2 ) { 참2 }
				else if ( 조건3 ) { 참3 }
				else { 거짓 }

			5. 
			   if ( 조건 ){
			   		if( 조건 ){
			   			참
			   		}else{
			   			거짓
			   		}
			   }
			    

*/