package java1.ch6Ŭ����.EX6;

import java.util.Scanner;

public class EX6���� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] Memberarray = new 
		
		while ( true ) {
			System.out.println("1. ȸ������ 2. �α���");
			int ch = scanner.nextInt();
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("���̵� : ");  	String id = scanner.next();
				System.out.println("��й�ȣ : ");	String password = scanner.next();
				System.out.println("�̸� : ");	    String name = scanner.next();
				// ��ü ����
				Member signupinfo = new Member ( id , password , name , 1000 );
				int index = 0;
				for( Member temp : MemberObject ) {
					index++;		// 1�� ����
					if( temp == null ) {	// ���࿡ �ش� ��ü�� ��� ������
						// temp = signupinfo; // �ӽú��� ����
						MemberObect[ index ] = signupinfo; // ������ ���� [ �ּҰ� ���� ]
						break;
					}
				}
				
			}else if( ch == 2 ) {
				System.out.println("���̵� : ");  	String id = scanner.next();
				System.out.println("��й�ȣ : ");	String password = scanner.next();
				// ��ü ����
				Member loginInfo = new Member( id , password );
				
				for( Member temp : MemberObject ) {
					if( temp != null && temp ) {
						
					}
				}
			}
		}
			
		
		
	}
	
}
