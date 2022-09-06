package java1ch4_배열;

import java.util.Scanner;

public class EX5_학생점수관리 {//class s

	public static void main(String[] args) {//main s
		
		boolean run = true;		//무한루프 제어 변수
		int studentNum = 0; 	//학생 수 저장할 변수
		int[] scores = null;	//여러개 점수를 저장할 배열 [ 메모리 할당 전 ]
 		Scanner scanner = new Scanner(System.in);
 		
		while(run) {//while s
			System.out.println("------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5. 종료");
			System.out.println("선택 : "); int selecNo = scanner.nextInt();
			
			if( selecNo == 1 )	// 1 입력했을 때
				{System.out.print("학생 수 : "); studentNum = scanner.nextInt();
				 scores = new int[studentNum];	//입력받은 학생수 만큼 배열에 메모리(길이) 할당
				 System.out.println("배열에 "+ studentNum +"명의 점수 입력 가능");
				}
			
			else if( selecNo == 2 )	// 2 입력했을 때
				{
					for( int i = 0; i<scores.length ; i++ ) {//for s i는 0부터 배열의 길이까지 1씩 증가 반복 / null일땐 lenth 안됨
						System.out.println("scores["+i+"] : ");
						scores[i] = scanner.nextInt();		//i번째 인덱스의 입력값을 대입
					}//for e
				}
			
			else if( selecNo == 3 )	// 3 입력했을 때
				{
					for( int i = 0; i<scores.length; i++ ) {
						//System.out.println("scores["+i+"]> + "scores[i]); / ★★이해안감.. 왜 이런 모양일까★★
						System.out.printf("scores[%d]> %d \n" , i , scores[i]); // %d = 정수형 출력 \n = 줄바꿈
					}//for e
				
				
					/*이것도 됨
					int i = 0;
					for( int value : scores ) {//for s
						System.out.println( value );
						i++;
					}//for e
					*/
				}
			else if( selecNo == 4 )	// 4 입력했을 때
				{
					int max = 0;
					int sum = 0;
					
					/*
					 for( 타입 변수명 : 배열 ){
				 				변수명			//* 변수의 타입은 배열의 타입과 동일
						}
					 */
					
					for ( int value : scores ) {
						if( value > max ) { max = value; }//만약에 해당 값이 max보다 크면 max 대입
						sum += value;	//해당 값을 sum 변수에 누적 더하기
					}
					System.out.println("최고 점수 : " + max );
					double avg = (double)sum/scores.length; 	//(double) 강제 형변환
					System.out.println("평균 점수 : " + avg);
					
					
					
					//* 순위별 [ 내림차순 ] 출력
					
					for( int i = 0; i<scores.length; i++ ) {
						for( int j = i+1; j<scores.length; j++ ) { // > : 오름차순 < : 내림차순
							// 두 변수 교환
							if( scores[i] > scores[j] ) {
								int temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							}//if e
						}//for e
					}//for e
					
					// 확인
					int rank = 0;
					for( int value : scores ) {
						System.out.println( (rank+1)+"순위점수 : "+ value );
						rank++;			//왜 올라가지?
					}
					
	
					/*
					 * int temp;
					 * for( int i=0; i<scores.length; i++ ) { if(scores[i]>scores[i+1]) {
					 * scores[temp] += scores[i]; scores[i+1] += scores[temp]; scores[i] +=
					 * scores[i+1]; } }
					 */

				}
			else if( selecNo == 5 )
				{ run=false; }	// 5 입력했을 때
			else
				{System.out.println("안내) 알 수 없는 번호입니다.");}	// 그외 입력했을 때
		
		}//while e
 		
 		
	}//main e
	
}//class e
