package java1.c조건문반복문;

import java.util.Iterator;
import java.util.Scanner; // 외부 클래스 호출 [ 가져오기 ] // 자동완성 아닐 경우 직접 입력!

public class EX7_별찍기 {//class s

	public static void main(String[] args) {//main s
		
		// 0. 입력객체 [ 1번 선언 ] 
		Scanner scanner = new Scanner(System.in);
		
		// 1. 입력받은 수 만큼 * 출력
		System.out.println("문제1) 별 개수 : "); int s1 = scanner.nextInt();
		for( int i = 1; i <= s1 ; i++ ) { // i는 1부터 입력받은 수까지 1씩 증가반복 / for s
				System.out.print("*");
		}//for e
		System.out.println("\n------------------------------------------------------------------------");
		// 2. 입력받은 수 만큼 * 출력 [ 3줄마다 줄바꿈 처리 ]
		System.out.println("문제2) 별개수 : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i <= s2 ; i++ ) {//for s
			System.out.println("*"); if( i % 3 == 0 ) { System.out.println(); }
		}//for e
		System.out.println("\n------------------------------------------------------------------------");
		
		//문제3
		System.out.println("문제3) 줄 수 : "); int line3 = scanner.nextInt();
		for( int i = 1; i<=line3; i++ ) {
			
			//별
			for( int s = 1; s<=i; s++ ) {
				System.out.print("*");
			}
			
			//줄바꿈
			System.out.println();  //println 줄바꿈됨
		}
		
		// 문제4
		System.out.println("문제4) 줄 수 : "); int line4 = scanner.nextInt();
			
		for( int i = 1; i <=line4; i++ ) {
				// 별찍기
				for( int s = 1; s <= line4-i+1; s++ ) {
					System.out.print("*");}
				//줄바꿈
				System.out.println();
			}
		
		
		// 문제5
		System.out.println("문제5) 줄 수 : "); int line5 = scanner.nextInt();
		
		for( int i=1; i<=line5; i++ ) {
			
			// 2. 공백찍기
			for( int b = 1; b<=line5-1; b++ ) {
				System.out.print(" ");
			}
			
			// 3. 별찍기
			for( int s = 1; s<=i; s++ ) {
				System.out.print("*");
			}
			
			//1. 줄바꿈
			System.out.println();
		}
		
		// 4. 문제 6
		System.out.println("문제6) 줄 수 입력: "); int 문제6 = scanner.nextInt();
		for( int i=1; i<=문제6; i++ ) {
			
			// 2. 공백
			for( int b=1; b<=i-1; b++ ) {
				System.out.print(" ");
			
				// 3. 별
				for( int s=1; s<=문제6-i+1; s++ ) {
					System.out.print("*");
				}
			}
			// 1. 줄바꿈
			System.out.println();
		}
		
		//문제6
		System.out.println("문제7) 줄수 : ");
		int line6 = scanner.nextInt();
		for( int i = 1; i<=line6 ; i++ ) { 
			// 2. 공백
			for( int b = 1; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
		 	// 3. 별 
			for( int s = 1 ; s<=i+1 ; s++ ) {
				System.out.print("i");
			}
			// 1. 줄바꿈
			System.out.println();
		}
			
		
			
		
		
		//문제8
		System.out.println("문제8) 줄 수 입력 : "); int line8 = scanner.nextInt();
		for( int i=1; i<=line8; i++ ) {}
		
		
		// 문제7
		/*
		 * System.out.println("문제7) 줄 수 입력 : "); int 문제7 = scanner.nextInt(); for( int
		 * i=1; 1<=문제7; i++ ) { // 2. 공백 for( int b=1; b<=문제7-i; b++ ) {
		 * System.out.println(" "); //3. 별 for( int s=1; s<=i*2-1; s++ ) {
		 * System.out.print("*"); }
		 * 
		 * } System.out.println(); }
		 */
		
		
		// 문제8
		
		
		
		/*
		 
		 별문제3 : 입력받은 줄 만큼 출력
			
	*				i = 현재줄수	s = 별
	**				i 는 1부터 입력받은 줄까지 1씩 증가한다.
	***				s 는 1부터 i까지 1씩 증가한다.
	****			i마다 s를 출력
	***** 			i는 s를 포함하고 있어야 됨
			
별문제4 : 입력받은 줄 만큼 출력
			
	*****	입력받은줄 - 현재줄수 + 1 까지 1씩 증가한다.
	****	
	***			
	**					
	* 				
		
별문제5 : 입력받은 줄 만큼 출력
				i	s   b
        *		1	1   4
       **		2	2   3
      ***		3	3   2
     ****		4	2	1
    *****		공백은 5-i
    
    * i 마다 b , s 출력
    * b :  b는 1부터 i-1까지
	* i : i는 1부터 입력받은줄까지 1씩 증가
	* s: 1부터 입력받은줄-현재줄+1 까지 1씩 증가 [ 4번 유사 ]
별문제6 : 입력받은 줄 만큼 출력
				i	b	s
	*****	 	1	0	5
	 ****		2	1	4
	  ***		3	2	3
	   **		4	3	2
	    *		5	4	1
	   
	* i 마다 b , s 출력
	* b : i
	* s : 입력받은 줄
	    
별문제7 : 입력받은 줄 만큼 출력
					i	s	b
        *			1	1	5
       ***			2	3	4
      *****			3	5	3
     *******		4	7	2
	*********		5	9	1
	
	* i는 1부터 입력받은 수까지 1씩 증가
	* b는 1부터 입력받은 수 - 현재줄수까지 1씩 증가 [ 5번 유사 ]
	* s는 1부터 i*2-1까지 2씩 증가 [ 5번 유사 ]
	
	
별문제8 : 입력받은 줄만큼 출력 
				i	n	b
	    1		1	1	4	
       222		2	3	3
      33333		3	5	2
     4444444	4	7	1
	555555555	5	9	0
	
	* i는 1부터 입력받은 수까지 1씩 증가
	* n은 1부터 i*2-1 까지 1씩 증가
	* b는 입력받은 수 - 현재줄 수
	
별문제9 : 입력받은 줄만큼 출력

	*********		
	 *******				
	  *****				
	   ***			
	    *		
	    
별문제10 : 입력받은 줄만큼 출력
        *
       ***
      *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
별문제11 : 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ] 
	*     *		
	 *   *	
	  * *		
	   *		
      * *		
     *   *		
    *     *		
									
별문제12 : 입력받은 줄만큼 출력
	*        *
	**      **
	***    ***
	****  ****
	**********
	****  ****
	***    ***
	**      **
	*        *

별문제13 : 입력받은 줄만큼 출력
	                   *                        
                      * *                       
                     *****                      
                    *     *                     
                   * *   * *                    
                  ***** *****                   
                 *           *                  
                * *         * *                 
               *****       *****                
              *     *     *     *               
             * *   * *   * *   * *              
            ***** ***** ***** *****             
           *                       *            
          * *                     * *           
         *****                   *****          
        *     *                 *     *         
       * *   * *               * *   * *        
      ***** *****             ***** *****       
     *           *           *           *      
    * *         * *         * *         * *     
   *****       *****       *****       *****    
  *     *     *     *     *     *     *     *   
 * *   * *   * *   * *   * *   * *   * *   * *  
		 
		 */
		
		
	}//main e
	
}//class e
