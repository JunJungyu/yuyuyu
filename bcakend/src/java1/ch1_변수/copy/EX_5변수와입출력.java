package java1.ch1_변수.copy����;

import java.util.Scanner;

public class EX_5����������� {//class s

	public static void main(String[] args) {//main s
		
		// p. 90 : print format : ��� ����[ ����=���=�� ]
		int ���� = 123;
		System.out.println( ���� + "��" );
		System.out.printf( "%d��" , ���� );		//���� ��������
		
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n" , value);
		System.out.printf("��ǰ�� ����:%6d��\n" , value);
		System.out.printf("��ǰ�� ����:%-6d��\n" , value);
		System.out.printf("��ǰ�� ����:%06d��\n" , value);
		
		double area = 3.141592 * 10 * 10 ;	//�Ǽ�
		System.out.println("�������� %d�� ���� ���� : %10.2f\n ,10 , area");
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.println("");
		
		//�Է� ��ü ����
		Scanner �Է°�ü = new Scanner( System.in );
		// [��ü����] Ŭ������ ��ü�� = new �ļ���();	
						//new ��ü ���� �� �޸� �Ҵ� Ű����
		int �Է����� = �Է°�ü.nextInt();
		System.out.println("�Է¹��� ���� :" + �Է�����);
		
		String �Է¹��ڿ� = �Է°�ü.next();
		System.out.println( "�Է°�ü : " + �Է¹��ڿ� );
		
		/*---------------------------------------*/
		//�Է¿���
		// 1. �Է¹ޱ� [ �غ� : Scanner Ŭ������ ��ü �ʿ� ]
		// Ű����(System.in) --�Է�--> ��ü ���� --next()-->
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸� : "); String �̸� = scanner.next();
		System.out.println("���� : "); int ���� = scanner.nextInt();
		System.out.println("Ű : "); double  Ű = scanner.nextDouble();
		
		// 3. ���� ���
		System.out.println("--------��������--------");
		System.out.printf("�̸�\t����\tŰ");
		System.out.printf("%5s	\t %5s	\t %5s\n", "�̸�" , "����" , "Ű");
		System.out.printf("%5s	\t %5d	\t %5.1f", �̸� , ���� , Ű);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main e
	
}//class e
/*

	1. %d : ����
		%����d : ���ڸ�ŭ �ڸ� ���� [ ���࿡ ���ڰ� ���� ��� ���� ä�� ]
		%0����d : ���ڸ�ŭ �ڸ� ���� [ ���࿡ ���ڰ� ���� ��� 0 ä�� ]
		%-����d : ���ʺ���~~	
	
	2. %f : �Ǽ�
		%�ڸ���,�Ҽ��ڸ�f
			%10.2f : 10�ڸ��� �ڸ� ���� , �Ҽ��� 2�ڸ� ǥ��
	
	3. %s : ���ڿ�
		
	
*/