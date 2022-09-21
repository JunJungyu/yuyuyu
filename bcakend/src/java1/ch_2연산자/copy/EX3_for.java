package java1.ch_2연산자.copy������;

public class EX3_for {//class s

	public static void main(String[] args) {//main s
		
		//p.150 1~10���� ���
			// 1. �ݺ����� ���� �� 10�� ����
				System.out.println("1");	System.out.println("2");
				System.out.println("3");	System.out.println("4");
				System.out.println("5");	System.out.println("5");
				System.out.println("7");	System.out.println("8");
				System.out.println("9");	System.out.println("10");
		
			// 2. for���� ������� �� 
		for ( int i = 1; i <= 10; i++ ) {	// �ʱⰪ; ���ǹ�; ������
			//i�� 1���� 10���ϱ��� 1�� ����
			System.out.println(i);
		}
		
		// 3. while ��
		
		int i = 1;						// 1. �ʱⰪ
		while( i <= 10 ) {				// 2. ���ǹ�
			System.out.println( i );	// 3. ���๮
				i++;					// 4. ������
		}
		
		
		// p.151 1~10���� �����հ�
		
		int �հ�1 = 1;
		�հ�1 += 0;
		�հ�1 += 1;
		�հ�1 += 2;
		�հ�1 += 3;	//������ 10���� �ϸ� ��
		
		
		// 2. for
		int �հ�2 = 0;
		for( int j = 1; j <=10; j++ ) {
			�հ�2 += j;
		}
		
		// 3. while
		int �հ�3 = 0;
		int h = 1;
		while( h<=10 ) {
			�հ�3 = h;
			h++;
		}
		
		System.out.println("1��� : " + �հ�1);
		System.out.println("2��� : " + �հ�2);
		System.out.println("3��� : " + �հ�3);
		
		//----------------------------------------------------------------------
		
		// ��3) 1���� 100������ 7����� �����հ�
		
		int ����3�հ� = 0;
		for( int x = 1; x>100; x++ ) {
			if( x % 7 == 0 )����3�հ� += x;
		}
		System.out.println("���� 3 ��� : " + ����3�հ�);
		
		//2.
		int ����3�հ�2 = 0;
		for( int x = 0; x<=100; x+=7 ) {
			����3�հ�2 += x;
		}
		
		System.out.println("����3��� :" + ����3�հ�2);
		
		//----------------------------------------------------------------------
		
		//��4) 2���� ������ ���
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");
		
		// 2.
		for ( int �� = 1; ��<=9; ��++ ) {
			int ������ = 2*��;
			System.out.println("2 x "+��+" = "+������);
		}
		
		// 3. 
		int ��2  = 1;										
		while( ��2 <= 9 ) {									//�ʱⰪ
			int ������ = 2 * ��2;								//���ǹ�
			System.out.println("2 x "+��2+" = "+������);		//���๮
			��2++;											//������
		}
		
		// 1. ������
		/*
		  	�� : 2���� 9���� 1�� ���� -> 8��
		  	�� : 1���� 9���� 1�� ���� -> 9��
		  	--�� 1�� �� ���� ���(9��) ���� -- �� ���� ���� 9�� ���� -- �� �� ���� �����ϰ� �ִ�.
		  
		 */
		
		int ����Ƚ�� = 0;
		for( int �� = 2; �� <=9; ��++ ) {	// ��2~9							[ 8ȸ ]
			//���� 2���� 9���� 1�� ����				
			for( int �� = 1; ��<=9; ��++ ) {//�� 1~9						[ 9ȸ ] �� 1ȸ���� �� ���()
				System.out.printf(" %2d X %2d = %2d \n" , �� , �� ,(��*��));
			
					����Ƚ��++;
			}
			
		}
		
		System.out.println("�� �ݺ� Ƚ�� : " + ����Ƚ��);
		
		// 3.
			// 1. break : �ݺ��� ���� Ű���� [ ���� ����� �ݺ��� Ż�� ]
			// 2. continue : �ݺ������� �̵� Ű���� [ ������ �̵� ]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 2. ���ѷ��� = ���ѷ���
		
		//for( int y = 0; true; y++ ) {
		//	System.out.println("�������� ����~");
		//}
		
		
		
		
		
		
		
		
		
	}//main e
	
}//class e

/*

	 �ݺ��� : ������ ���̸� ���๮ �ݺ�
	 
	 	���ǹݺ� - for ���     	/		  ���� �ݺ� = while ���
	 	1. for ( 1. �ʱⰪ ; 2. ���ǹ� ; 3. ������ ){ ���๮ }
	 	2.
	 		�ʱⰪ
	 		while( ���ǹ� ){
	 			���๮
	 			������
	 		}

*/