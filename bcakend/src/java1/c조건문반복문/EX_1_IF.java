package java1.c���ǹ��ݺ���;//��Ű����

//1. Ŭ���� ����
public class EX_1_IF {//class s

	//2. main Ŭ���� �о��ִ� �޼ҵ�
	public static void main(String[] args) {//main s
		
		// ��1) �� ���๮�� 1���϶��� �߰�ȣ ���� ����
		if( 3 > 1 ) System.out.println("��) 3�� 1���� ũ��.");
		
		// ��2) : ������ true�̸� ���� �ƴϸ� ����X
		if( 3 > 5 ) System.out.println("��) 3�� 5���� ũ��. ");			//������̸� ���� ������� �ʾҴٴ� ��
		
		// ��3) p.136	[ ���� : ������ 93���̱⶧���� ù��° if�� ���� ]
		int score = 93;
		if( score >= 90 ) {//���๮(;) 2�� �̻��̸� �߰�ȣ�� ����/�ȹ����� if�� ���Ե����� �ʰ� �׳�..������ �����
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		}
		if( score < 90 ) {
			System.out.println("������ 90������ �۽��ϴ�.");
			System.out.println("����� B����Դϴ�.");
		}//if e ���� �߰�ȣ�� ���� ������ if�� ������°ɷ� ���� ������ ��µ�
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		//����4
		int score2 = 85;
			//���� ���� �� �ߺ� �̸� �Ұ��� - �Ʊ� score�����ϱ� �̹��� 2
		
		if( score2 >= 90 ) {//85>-90 -> false�� �߰�ȣ ������ ������ -> ����X
			System.out.println("����4) ������ 90���� Ů�ϴ�.");
			System.out.println("����4) ����� A����Դϴ�.");
		}else{
			System.out.println("����4) ������ 90���� �۽��ϴ�.");
			System.out.println("����4) ����� B����Դϴ�.");
		}
		
		// ����5 ) p.138		������ �ټ��϶� if ~ else if	( �ϳ��� true )	2.  ( �ټ��� true ) if ����
		int score3 = 75;
		
		if ( score3 >= 90 ) { System.out.println("������ 100~90�Դϴ�.");		 System.out.println("����� A����Դϴ�.");}
		else if ( score3 >= 80 ) { System.out.println("������ 80~89�Դϴ�."); 	 System.out.println("����� B����Դϴ�.");}
		else if ( score3 >= 70 ) { System.out.println("������ 70~79�Դϴ�.");	 System.out.println("����� C����Դϴ�.");}			
		else { System.out.println("������ 70�� �̸��Դϴ�."); System.out.println("����� D����Դϴ�.");}		
		//vs
		if ( score3 >= 90 ) { System.out.println("������ 100~90�Դϴ�."); 		System.out.println("����� A����Դϴ�.");}
		if ( score3 >= 80 ) { System.out.println("������ 80~89�Դϴ�."); 		System.out.println("����� B����Դϴ�.");}
		if ( score3 >= 70 ) { System.out.println("������ 70~79�Դϴ�."); 		System.out.println("����� C����Դϴ�.");}
		if ( score3 < 70 ){ System.out.println("������ 70�� �̸��Դϴ�."); 		System.out.println("����� D����Դϴ�.");}
	
		// ����6 if ��ø
		int score4 = 95;	char ���� = 'M';
		if( score4 == 100 ) {
			if( ���� == 'M' ) { System.out.println("100���̸鼭 �����̴�."); }
			else { System.out.println("100���̸鼭 �����̴�."); }
		}else {
			if( ���� == 'F' ) {
				System.out.println("100���� �ƴϸ鼭 �����̴�.");
			}else { System.out.println("100���� �ƴϸ鼭 �����̴�."); }
		}//if e
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main e
	
	
	
}//class e

/*

	IF�� : ���ǽ��� ����� ���� ��� ���� ���� ����
		if( ���ǽ� )
				{ ������ true }
	- ���ǽ� : true �� false / �� ���� �� �ִ� �񱳿�����/��������/����/�Լ��� ����~ ���� �ƴ� ����� t or f  �̸� ��.

		if ����
			1.
				if ( ���� ) ��								:��[true] ��ġ�� 
			
			2.
				if ( ���� ) { �� } 
			
			3. 
				if ( ���� ) { �� }
					else{ ���� }

			4. 
				if ( ���� ) { �� }
				else if ( ����2 ) { ��2 }
				else if ( ����3 ) { ��3 }
				else { ���� }

			5. 
			   if ( ���� ){
			   		if( ���� ){
			   			��
			   		}else{
			   			����
			   		}
			   }
			    

*/