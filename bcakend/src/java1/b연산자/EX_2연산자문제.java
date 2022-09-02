package java1.b연산자;

import java.awt.print.Printable;
import java.util.Scanner;

public class EX_2연산자문제 {//class s

	public static void main(String[] args) {//main s 
		
		/*
		 
		 Scanner.nextInt() 		: 입력된 데이터를 int형으로 가져오기 - 숫자 -   
		 Scanner.nexDouble()	: 입력된 데이터를 Double형으로 가져오기
		 
		 
		 
		 
		문제1 : 급여 계산 
			[조건] 입력받기 : 기본급 , 수당 
			[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
	 */
									//변수 자료형??? 1. 논리 2. 정수 3. 실수 4. 문자열
									/*
									  System.out.Printable("문제2) 금액"); int 금액; 금액 = scanner.nextInt(); // 1. 십만원 계산
									  System.out.printIn("만원 : " + (금액/10000) + "장");
									 */
		
	/*
	 	문제2 : 지폐 개수 세기 
	 		[조건] 십만원 단위의 금액을 입력받기 
	 		[출력] 입력받은 금액의 지폐수 출력 
	 		[예시]  356789
	 			십만원 : 3장 
				만원 : 5장 
				천원 : 6장
	*/			
		Scanner scanner = new Scanner(System.in);	//이게 꼭 있어야됨 어떤 값으로 받을건지? 키보드에서 입력받는단 뜻..
	
		/*
	
	 	//문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		int 문제3 = scanner.nextInt();	//똑같이 썼는데 왜 오류? 왜 자동완성에 nextInt가 안뜨는가
		String 결과3 = 문제3 % 7 == 0 ? "7배수 맞습니다" : "7배수 아니다"; // [ 배수 : 값%수 == 0 , 값은 그 수의 배수 ]
		
		System.out.println("결과 3 : "+결과3); 	
	 	
	 	
	 //	문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		System.out.println("문제 4) 정수 입력 : "); int 문제4 = scanner.nextInt();
		String 문제4번 = 문제4 % 2 == 1 ? "홀수" : "짝수";

		System.out.println("결과4 ) + 결과4"+문제4번);
		
	 //	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
		System.out.println("문제6) 정수 입력:"); int 문제5 = scanner.nextInt();
		String 결과5 = 문제5 % 7 == 0 && 문제5 % 2 == 0 ? "참" : "거짓";
			System.out.println("결과5) :" + 결과5);
		
	 	//문제6 : 두개의 정수를 입력받아 더 큰수 출력 
		System.out.println("문제6_1 정수 입력 : "); int 문제6_1 = scanner.nextInt();
		System.out.println("문제6_2 정수 입력 : "); int 문제6_2 = scanner.nextInt();
		System.out.println("결과6) :" + ( 문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2 )  );
		
		
	 	//문제7 : 반지름을 입력받아 원 넓이 출력하기 
	 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]
		System.out.println(" 문제7 : ");			 double 반지름 = scanner.nextDouble();
		System.out.println(" 결과7 원넓이 : " + ( 반지름 * 반지름 * 3.14 ) );
		
	 //	//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
	 		// 예) 54.5     84.3  입력했으면    64.285714% 출력 
		System.out.println("문제8) 실수1 : "); 	double 문제8_1 = scanner.nextDouble();
		System.out.println("문제8) 실수2 : ");		double 문제8_2 = scanner.nextDouble();
		System.out.printf("결과 : %.2f %% " , ( 문제8_1/문제8_2 )*100 );	//소수점 자리수를 어쩌고 싶으면 	printf	%.2f %% 여기서 2는 소수점 자리수이고 %는 하나만 쓰면 오류나니까!
		
	 	//문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ] 
	 		// 사다리꼴 계산식 -> ( 윗변 * 밑변 ) * 높이 / 2 
		System.out.println("문제9) 사다리꼴 윗변:");		double 윗변 = scanner.nextDouble();
		System.out.println("문제9) 사다리꼴 밑변:");		double 밑변 = scanner.nextDouble();
		System.out.println("문제9) 사다리꼴 높이:");		double 높이 = scanner.nextDouble();
		System.out.println("문제9) 결과 : " + ( ( 윗변 * 밑변 ) * 높이 / 2) );
		
		
	 	//문제10: 키를 정수를 입력받아 표준체중 출력하기
			//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.println("믄제10) 키 :"); 	double 키 = scanner.nextDouble();
		System.out.println("문제10) 표준체중 :" + ( 키 -100 )*0.9 );
		//문제11 : 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		System.out.println("문제11) 키 :");	double 당신의_키 = scanner.nextDouble();
		System.out.println("문제11) 당신의 몸무게 :");	double 당신의_몸무게 = scanner.nextDouble();
		System.out.println("문제11) 결과 : " + ( (키 / 100) * (키 / 100) ) );
		
		
	 	//문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		System.out.println(" 문제 12 inch : "); int 인치 = scanner.nextInt();
		System.out.println("결과 :" + ( 인치*2.54 ) + "cm");
		
		*/
		
	 	//문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		System.out.println(" 중간고사 점수 : "); 	double 중간 = scanner.nextDouble() * 0.3;
		System.out.println(" 기말고사 점수 : "); 	double 기말 = scanner.nextDouble() * 0.3;
		System.out.println(" 수행평가 점수 : "); 	double 수행 = scanner.nextDouble() * 0.4;
		System.out.printf("결과 : %.2f" , (중간+기말+수행) );			//	%f = 실수 (형싱 문자) %[점 찍고 소수점 개수]f
		
		
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
 				//int x = 10;
				//int y = x-- + 5 + --x;
				//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		int x = 10;
		int y = x-- + 5 + --x;
				
		System.out.printf("\n x의 값 : %d , y의 값 : %d " ,  x , y );
	
	/*
	1. x변수에 10 대입한다.
	2. y변수에 대입
		1. x-- : 10 [ 후위 감소 = 가장 나중에 할 예정 ]
		2. --x : 9  [ 먼저 감소 ]
		3. 10 + 5 + 9 : 24
        4. = 		[ 대입이 마지막 ]	
        5. 
	3. 출력
		x = 8
		y = 23
	*/
		
	}//main e
	
}//clas e
