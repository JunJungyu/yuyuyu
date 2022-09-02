package java1.c조건문반복문;

import java.util.Scanner;

public class EX_2_IF연습문제 {//class s

	
	public static void main(String[] args) {//main s
	
		
	//입력객체
	Scanner scanner = new Scanner(System.in);		//입력받으려면 이 문구가 꼭 필요함
	
	//문제1 : 두개의 정수를 입력받아서 더 큰수를 출력
	
	System.out.println("문제1) 정수1 입력"); int 정수1 = scanner.nextInt();
	System.out.println("문제1) 정수2 입력"); int 정수2 = scanner.nextInt();
	if( 정수1>정수2 ) {
		System.out.println("문제1) : "+(정수1));
	}else{
		System.out.println("문제1) :"+(정수2));
	}

	/* 강사님꺼 다 못씀
	if(정수1>정수2) { System.out.println("문제1 결과 : ") + ; }
	else if
	else if(정수1 == 정수2) {System.out.println("결과: 두 수는 같다.");}
	
	*/
	//문제2 : 3개의 정수를 입력받아서 가장 큰 수를 출력	
	
	
	System.out.println("문제2) 숫자1 입력"); int 숫자1 = scanner.nextInt();	
	System.out.println("문제2) 숫자2 입력"); int 숫자2 = scanner.nextInt();
	System.out.println("문제2) 숫자3 입력"); int 숫자3 = scanner.nextInt();
	int max = 숫자1;	// 첫번째 데이터를 가장 큰 수로 지정	
	if ( max < 숫자2 ) { max = 숫자2; }		//두번째 데이터가 max보다 크면 max에 두번째 데이터 넣기
	if ( max < 숫자3 ) { max = 숫자3; }		//세번째 데이터가 max보다 크면 max에 세번째 데이터 넣기
	System.out.println("결과) 가장 큰 수 :" + max);
	
	// 문제3 : 3개의 정수를 입력받아서 오름차순 / 내림차순
	System.out.println("문제3) 값1 입력");	int 값1 = scanner.nextInt();
	System.out.println("문제3) 값2 입력");	int 값2 = scanner.nextInt();
	System.out.println("문제3) 값3 입력");	int 값3 = scanner.nextInt();
	
	if ( 값1>값2 ) { int temp = 값1; 값1 = 값2; 값2 = temp; }
	if ( 값1>값3 ) { int temp = 값1; 값1=값3; 값3=temp; }
	if ( 값2>값3 ) { int temp = 값2; 값2=값3; 값3=temp; }
	System.out.println("문제3) 정답: " + 값1 + " " + 값2 + " " + 값3 );
	System.out.printf( "%d %d %d \n" , 값1 , 값2 , 값3 );
	
	//문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 [ 경우의 수 : 2개 ]
	System.out.println("문제3) 점수 출력 : "); int 문제4 = scanner.nextInt();
	if( 문제4 >= 90 ) { System.out.println("합격"); }
	else {System.out.println("불합격");}
	
	//문제5
		//점수를 입력받아 점수가 90점 이상이면 A등급
		//				80점 이상이면 B등급
		//				70점 이상이면 C등급
		//				그외 재시험
	
	System.out.println("문제5) 점수를 입력해주세요:"); int 점수 = scanner.nextInt();
	if( 점수>=90 ) {
		System.out.println("문제5) A등급입니다.");
	}else if( 점수>=80 ) {										//조건은 다수이지만 원하는 실행결과가 하나일땐 else if 사용
		System.out.println("문제5) B등급입니다.");
	}else if( 점수>=70 ) {
		System.out.println("문제5) C등급입니다.");
	}else {
		System.out.println("문제5) 재시험 대상자입니다.");
	}
	

	
	/*
	문제6	//겅우의 수 3개 , 첫번째 경우의 수 3개 , 두번째 경우의 수3개 총 9개
	[ 입력 ] : 국어,영어,수학 입력받기
	[ 조건 ]
		평균이 90점 이상이면서
			국어점수 100점이면 '국어성적 우수' 출력
			영어점수 100점이면 '영어성적 우수' 출력
			수학점수 100점이면 '수학성적 우수' 출력
		평균이 80점 이상이면서
			국어점수 90점이면 '국어장려' 출력
			영어점수 90점이면 '영어장려' 출력
			수학점수 90점이면 '수학장려' 출력
		그외 재시험
	*/
	System.out.println("문제6) 국어점수 : "); int 국어 = scanner.nextInt();
	System.out.println("문제6) 영어점수 : "); int 영어 = scanner.nextInt();
	System.out.println("문제6) 수학점수 : "); int 수학 = scanner.nextInt();
	double 평균 = ( 국어+영어+수학 )/3;
	
	//1. 가장 바깥의 경우의 수 3개
	if( 평균>=90 ) {  }
	else if( 평균>=80 ) {  }
	else {  }
	
	if( 평균>=90 ) {
		if( 국어 == 100 ) {  }
		if( 영어 == 100 ) {  }
		if( 수학 == 100 ) {  }
	}
	else if( 평균 >= 80 ) {
		if( 국어 >= 90 ) {  }
		if( 영어 >= 90 ) {  }
		if( 수학 >= 90 ) {  }
		
	}else {
		System.out.println("재시험");
	}
	
	//3. 실행문 작성
	/*
	if( 평균>=90 ) {
		if( 국어 == 100 )
		
	}
	*/
	//문제7 로그인페이지
	// [ 입력 ] : 아이디와 비밀번호를 입력받기
	// [ 조건 ] : 회원아이디가 admin 이고 
	//           비밀번호가 1234 일 경우에는 
	//          로그인 성공 아니면 로그인 실패 출력
	
	System.out.println("---------------------로그인페이지-------------------");
	System.out.print("아이디 입력:"); String 아이디 = scanner.next();
	System.out.print("비밀번호 입력"); String 비밀번호 = scanner.next();
	
	//if( 아이디 == "admin" ) {//if 1 //아이디가 맞으면
		//기본자료형( Int,char,double 등 ) 비교연산자 가능
		//클래스 ( 객체 = 기본자료형 외 ) 는 비교연산자 불가능 -->  객체비교 메소드(함수) : .equals( )
		// 기본자료형 변수 == vs 객체명.equals( 객체명 )
		//비교 연산자는 기본자료형 에서만 사용 가능 // 클래스(객체)는 비교연산자X
		// . : 접근연산자 ( 내부 )
	
	if( 아이디.equals("admin") ) {
		if( 비밀번호.equals("1234") ) {
			System.out.println("안내) 로그인 성공");
		}else {
			System.out.println("안내) 비밀번호가 다릅니다.");
		}
	}else {
		System.out.println("안내) 아이디가 다릅니다.");
	}
	
	
	
	}//main e
}//class e
