package java1.c���ǹ��ݺ���;

import java.util.Scanner;

public class EX_2_IF�������� {//class s

	
	public static void main(String[] args) {//main s
	
		
	//�Է°�ü
	Scanner scanner = new Scanner(System.in);		//�Է¹������� �� ������ �� �ʿ���
	
	//����1 : �ΰ��� ������ �Է¹޾Ƽ� �� ū���� ���
	
	System.out.println("����1) ����1 �Է�"); int ����1 = scanner.nextInt();
	System.out.println("����1) ����2 �Է�"); int ����2 = scanner.nextInt();
	if( ����1>����2 ) {
		System.out.println("����1) : "+(����1));
	}else{
		System.out.println("����1) :"+(����2));
	}

	/* ����Բ� �� ����
	if(����1>����2) { System.out.println("����1 ��� : ") + ; }
	else if
	else if(����1 == ����2) {System.out.println("���: �� ���� ����.");}
	
	*/
	//����2 : 3���� ������ �Է¹޾Ƽ� ���� ū ���� ���	
	
	
	System.out.println("����2) ����1 �Է�"); int ����1 = scanner.nextInt();	
	System.out.println("����2) ����2 �Է�"); int ����2 = scanner.nextInt();
	System.out.println("����2) ����3 �Է�"); int ����3 = scanner.nextInt();
	int max = ����1;	// ù��° �����͸� ���� ū ���� ����	
	if ( max < ����2 ) { max = ����2; }		//�ι�° �����Ͱ� max���� ũ�� max�� �ι�° ������ �ֱ�
	if ( max < ����3 ) { max = ����3; }		//����° �����Ͱ� max���� ũ�� max�� ����° ������ �ֱ�
	System.out.println("���) ���� ū �� :" + max);
	
	// ����3 : 3���� ������ �Է¹޾Ƽ� �������� / ��������
	System.out.println("����3) ��1 �Է�");	int ��1 = scanner.nextInt();
	System.out.println("����3) ��2 �Է�");	int ��2 = scanner.nextInt();
	System.out.println("����3) ��3 �Է�");	int ��3 = scanner.nextInt();
	
	if ( ��1>��2 ) { int temp = ��1; ��1 = ��2; ��2 = temp; }
	if ( ��1>��3 ) { int temp = ��1; ��1=��3; ��3=temp; }
	if ( ��2>��3 ) { int temp = ��2; ��2=��3; ��3=temp; }
	System.out.println("����3) ����: " + ��1 + " " + ��2 + " " + ��3 );
	System.out.printf( "%d %d %d \n" , ��1 , ��2 , ��3 );
	
	//����4 : ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� [ ����� �� : 2�� ]
	System.out.println("����3) ���� ��� : "); int ����4 = scanner.nextInt();
	if( ����4 >= 90 ) { System.out.println("�հ�"); }
	else {System.out.println("���հ�");}
	
	//����5
		//������ �Է¹޾� ������ 90�� �̻��̸� A���
		//				80�� �̻��̸� B���
		//				70�� �̻��̸� C���
		//				�׿� �����
	
	System.out.println("����5) ������ �Է����ּ���:"); int ���� = scanner.nextInt();
	if( ����>=90 ) {
		System.out.println("����5) A����Դϴ�.");
	}else if( ����>=80 ) {										//������ �ټ������� ���ϴ� �������� �ϳ��϶� else if ���
		System.out.println("����5) B����Դϴ�.");
	}else if( ����>=70 ) {
		System.out.println("����5) C����Դϴ�.");
	}else {
		System.out.println("����5) ����� ������Դϴ�.");
	}
	

	
	/*
	����6	//�Ͽ��� �� 3�� , ù��° ����� �� 3�� , �ι�° ����� ��3�� �� 9��
	[ �Է� ] : ����,����,���� �Է¹ޱ�
	[ ���� ]
		����� 90�� �̻��̸鼭
			�������� 100���̸� '����� ���' ���
			�������� 100���̸� '����� ���' ���
			�������� 100���̸� '���м��� ���' ���
		����� 80�� �̻��̸鼭
			�������� 90���̸� '�������' ���
			�������� 90���̸� '�������' ���
			�������� 90���̸� '�������' ���
		�׿� �����
	*/
	System.out.println("����6) �������� : "); int ���� = scanner.nextInt();
	System.out.println("����6) �������� : "); int ���� = scanner.nextInt();
	System.out.println("����6) �������� : "); int ���� = scanner.nextInt();
	double ��� = ( ����+����+���� )/3;
	
	//1. ���� �ٱ��� ����� �� 3��
	if( ���>=90 ) {  }
	else if( ���>=80 ) {  }
	else {  }
	
	if( ���>=90 ) {
		if( ���� == 100 ) {  }
		if( ���� == 100 ) {  }
		if( ���� == 100 ) {  }
	}
	else if( ��� >= 80 ) {
		if( ���� >= 90 ) {  }
		if( ���� >= 90 ) {  }
		if( ���� >= 90 ) {  }
		
	}else {
		System.out.println("�����");
	}
	
	//3. ���๮ �ۼ�
	/*
	if( ���>=90 ) {
		if( ���� == 100 )
		
	}
	*/
	//����7 �α���������
	// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
	// [ ���� ] : ȸ�����̵� admin �̰� 
	//           ��й�ȣ�� 1234 �� ��쿡�� 
	//          �α��� ���� �ƴϸ� �α��� ���� ���
	
	System.out.println("---------------------�α���������-------------------");
	System.out.print("���̵� �Է�:"); String ���̵� = scanner.next();
	System.out.print("��й�ȣ �Է�"); String ��й�ȣ = scanner.next();
	
	//if( ���̵� == "admin" ) {//if 1 //���̵� ������
		//�⺻�ڷ���( Int,char,double �� ) �񱳿����� ����
		//Ŭ���� ( ��ü = �⺻�ڷ��� �� ) �� �񱳿����� �Ұ��� -->  ��ü�� �޼ҵ�(�Լ�) : .equals( )
		// �⺻�ڷ��� ���� == vs ��ü��.equals( ��ü�� )
		//�� �����ڴ� �⺻�ڷ��� ������ ��� ���� // Ŭ����(��ü)�� �񱳿�����X
		// . : ���ٿ����� ( ���� )
	
	if( ���̵�.equals("admin") ) {
		if( ��й�ȣ.equals("1234") ) {
			System.out.println("�ȳ�) �α��� ����");
		}else {
			System.out.println("�ȳ�) ��й�ȣ�� �ٸ��ϴ�.");
		}
	}else {
		System.out.println("�ȳ�) ���̵� �ٸ��ϴ�.");
	}
	
	
	
	}//main e
}//class e
