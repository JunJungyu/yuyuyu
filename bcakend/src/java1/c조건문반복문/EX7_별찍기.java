package java1.c���ǹ��ݺ���;

import java.util.Iterator;
import java.util.Scanner; // �ܺ� Ŭ���� ȣ�� [ �������� ] // �ڵ��ϼ� �ƴ� ��� ���� �Է�!

public class EX7_����� {//class s

	public static void main(String[] args) {//main s
		
		// 0. �Է°�ü [ 1�� ���� ] 
		Scanner scanner = new Scanner(System.in);
		
		// 1. �Է¹��� �� ��ŭ * ���
		System.out.println("����1) �� ���� : "); int s1 = scanner.nextInt();
		for( int i = 1; i <= s1 ; i++ ) { // i�� 1���� �Է¹��� ������ 1�� �����ݺ� / for s
				System.out.print("*");
		}//for e
		System.out.println("\n------------------------------------------------------------------------");
		// 2. �Է¹��� �� ��ŭ * ��� [ 3�ٸ��� �ٹٲ� ó�� ]
		System.out.println("����2) ������ : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i <= s2 ; i++ ) {//for s
			System.out.println("*"); if( i % 3 == 0 ) { System.out.println(); }
		}//for e
		System.out.println("\n------------------------------------------------------------------------");
		
		//����3
		System.out.println("����3) �� �� : "); int line3 = scanner.nextInt();
		for( int i = 1; i<=line3; i++ ) {
			
			//��
			for( int s = 1; s<=i; s++ ) {
				System.out.print("*");
			}
			
			//�ٹٲ�
			System.out.println();  //println �ٹٲ޵�
		}
		
		// ����4
		System.out.println("����4) �� �� : "); int line4 = scanner.nextInt();
			
		for( int i = 1; i <=line4; i++ ) {
				// �����
				for( int s = 1; s <= line4-i+1; s++ ) {
					System.out.print("*");}
				//�ٹٲ�
				System.out.println();
			}
		
		
		// ����5
		System.out.println("����5) �� �� : "); int line5 = scanner.nextInt();
		
		for( int i=1; i<=line5; i++ ) {
			
			// 2. �������
			for( int b = 1; b<=line5-1; b++ ) {
				System.out.print(" ");
			}
			
			// 3. �����
			for( int s = 1; s<=i; s++ ) {
				System.out.print("*");
			}
			
			//1. �ٹٲ�
			System.out.println();
		}
		
		// 4. ���� 6
		System.out.println("����6) �� �� �Է�: "); int ����6 = scanner.nextInt();
		for( int i=1; i<=����6; i++ ) {
			
			// 2. ����
			for( int b=1; b<=i-1; b++ ) {
				System.out.print(" ");
			
				// 3. ��
				for( int s=1; s<=����6-i+1; s++ ) {
					System.out.print("*");
				}
			}
			// 1. �ٹٲ�
			System.out.println();
		}
		
		//����6
		System.out.println("����7) �ټ� : ");
		int line6 = scanner.nextInt();
		for( int i = 1; i<=line6 ; i++ ) { 
			// 2. ����
			for( int b = 1; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
		 	// 3. �� 
			for( int s = 1 ; s<=i+1 ; s++ ) {
				System.out.print("i");
			}
			// 1. �ٹٲ�
			System.out.println();
		}
			
		
			
		
		
		//����8
		System.out.println("����8) �� �� �Է� : "); int line8 = scanner.nextInt();
		for( int i=1; i<=line8; i++ ) {}
		
		
		// ����7
		/*
		 * System.out.println("����7) �� �� �Է� : "); int ����7 = scanner.nextInt(); for( int
		 * i=1; 1<=����7; i++ ) { // 2. ���� for( int b=1; b<=����7-i; b++ ) {
		 * System.out.println(" "); //3. �� for( int s=1; s<=i*2-1; s++ ) {
		 * System.out.print("*"); }
		 * 
		 * } System.out.println(); }
		 */
		
		
		// ����8
		
		
		
		/*
		 
		 ������3 : �Է¹��� �� ��ŭ ���
			
	*				i = �����ټ�	s = ��
	**				i �� 1���� �Է¹��� �ٱ��� 1�� �����Ѵ�.
	***				s �� 1���� i���� 1�� �����Ѵ�.
	****			i���� s�� ���
	***** 			i�� s�� �����ϰ� �־�� ��
			
������4 : �Է¹��� �� ��ŭ ���
			
	*****	�Է¹����� - �����ټ� + 1 ���� 1�� �����Ѵ�.
	****	
	***			
	**					
	* 				
		
������5 : �Է¹��� �� ��ŭ ���
				i	s   b
        *		1	1   4
       **		2	2   3
      ***		3	3   2
     ****		4	2	1
    *****		������ 5-i
    
    * i ���� b , s ���
    * b :  b�� 1���� i-1����
	* i : i�� 1���� �Է¹����ٱ��� 1�� ����
	* s: 1���� �Է¹�����-������+1 ���� 1�� ���� [ 4�� ���� ]
������6 : �Է¹��� �� ��ŭ ���
				i	b	s
	*****	 	1	0	5
	 ****		2	1	4
	  ***		3	2	3
	   **		4	3	2
	    *		5	4	1
	   
	* i ���� b , s ���
	* b : i
	* s : �Է¹��� ��
	    
������7 : �Է¹��� �� ��ŭ ���
					i	s	b
        *			1	1	5
       ***			2	3	4
      *****			3	5	3
     *******		4	7	2
	*********		5	9	1
	
	* i�� 1���� �Է¹��� ������ 1�� ����
	* b�� 1���� �Է¹��� �� - �����ټ����� 1�� ���� [ 5�� ���� ]
	* s�� 1���� i*2-1���� 2�� ���� [ 5�� ���� ]
	
	
������8 : �Է¹��� �ٸ�ŭ ��� 
				i	n	b
	    1		1	1	4	
       222		2	3	3
      33333		3	5	2
     4444444	4	7	1
	555555555	5	9	0
	
	* i�� 1���� �Է¹��� ������ 1�� ����
	* n�� 1���� i*2-1 ���� 1�� ����
	* b�� �Է¹��� �� - ������ ��
	
������9 : �Է¹��� �ٸ�ŭ ���

	*********		
	 *******				
	  *****				
	   ***			
	    *		
	    
������10 : �Է¹��� �ٸ�ŭ ���
        *
       ***
      *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
������11 : �Է¹��� �ٸ�ŭ ��� [ �Է¹��� ��/�� ���� ] 
	*     *		
	 *   *	
	  * *		
	   *		
      * *		
     *   *		
    *     *		
									
������12 : �Է¹��� �ٸ�ŭ ���
	*        *
	**      **
	***    ***
	****  ****
	**********
	****  ****
	***    ***
	**      **
	*        *

������13 : �Է¹��� �ٸ�ŭ ���
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
