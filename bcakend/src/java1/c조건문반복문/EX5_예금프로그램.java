package java1.c���ǹ��ݺ���;

import java.util.Scanner;

// 1. Ŭ���� ���� [ �ڹٴ� 100% ��ü���� <-- Ŭ���� ]
public class EX5_�������α׷� {//class s
	
		// 2. main( ���� ������ ���� ) �Լ� [ �ڵ� ���� ]
		public static void main(String[] args) {//main s
			
			// p.161 Ȯ�ι���
			boolean run = true; // boolean�� ���� ���� �����ϴ� ����ġ( on,off/true,false �� ) ����
			int balance = 0;    // int�� ���� ���� �ݾ��� �����ϴ� ����
			Scanner scanner = new Scanner(System.in); // �Է°�ü ���� �̰� �� �Է��� �� �ʿ���
			// ��ü ���� : Ŭ������ ������( �ƹ��ų� ) = new �����ڸ� ( �Ű����� )
				// ��ü���� ������ �޼ҵ�( �Լ� ) ���� = �ɹ�
				// ��ü�� �ɹ�ȣ��( . )���ٿ�����
			
			while( run ) {// while ( t/f ) : true�̸� �ݺ��� ����
				System.out.println("------------------------------");
				System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����"); // �Է� ����� �� 4��
				System.out.println("------------------------------");
				System.out.println("����> "); int ch = scanner.nextInt();
				if( ch == 1 ) //1 �Է����� ���
					{System.out.println("�ȳ�) ���ݾ�> "); balance += scanner.nextInt(); }
				else if( ch == 2 ) //2 �Է����� ���
					{
						System.out.println("�ȳ�) ��ݾ�> "); balance -= scanner.nextInt(); 
						// �ܾ׺��� [ ����� �� 2�� : 1. ���ݾ׺��� ��ݾ� �� ũ�ų� ������ /2. �� ������ ]
						int money = scanner.nextInt();
						if ( balance < money ) { System.out.println("�ȳ�) �ܾ��� �����մϴ�.");
						}else { balance -= money; }
						
					
					} 
				else if( ch == 3 )
					{ System.out.println("�ȳ�) �ܰ�> " + balance ); } //3 �Է����� ���
				else if( ch == 4 ) //4 �Է����� ���
					{ break; }
				else{ System.out.println("�ȳ�) �˼����� ��ȣ�Դϴ�."); }
			}//while end
			System.out.println("���α׷� ����");
			
		}//main e
	
		
}//class e
