package java1.ch1_변수.copy����;

public class EX_3���ڿ� {//class s
	public static void main(String[] args) {//main s
		
	// p. 64 String Ÿ�� [ String Ŭ���� ]
		//char ���� = "�ڹ�";	//�����߻� : char ���� �Ѱ��� ������ �� �ִ�.
		String ���ڿ� = "�ڹ�";
		
	// p. 65
		String name = "ȫ�浿"; System.out.println(name);
		String job = "���α׷���"; System.out.println(job);
		
	// p. 66
		System.out.println("�ȳ��ϼ���");	//println ��� �� �ٹٲ�ó��O
		System.out.print("�ڹ��Դϴ�");		//print ��� �� �ٹٲ�ó��X
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("�� ���� ���\n");
		System.out.println("�� ���� ���\n");
		System.out.println("�츮�� \"������\"�Դϴ�.");
		System.out.println("��\\����\\����\\�ܿ�");
		
		System.out.println("\\     /\\    �߿�");
		System.out.println(" )  (  ')   ��");
		System.out.println(" (  /   )  ��");
		System.out.println("  \\(___)|\n");
		
		System.out.println("�۸�     |\\_/|\t�۸�");
		System.out.println(" \t|p q|   /}");
		System.out.println("   �۸�! ( 0 )\"\"\"\"\\  ��  �۸�");
		System.out.println(" \t|\"^\"`    |");
		System.out.println(" \t||__/=\\\\_|\t��\n");
		
		
		//��3
		System.out.println("\t\t[[ �⼮�� ]]\n");
		System.out.println("------------------------------");
		System.out.println("\n�̸�\t1����\t2����\t3����");
		System.out.println("\n���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("\n��ȣ��\t�⼮\t�Ἦ\t�⼮");
		System.out.println("------------------------------");
	
	}//main e
	
}//class e

/*

 	����[�ѱ���]			:	char	: '��'
 	���ڿ�[ �α��� �̻� ]		: String	: "�ڹ� �Դϴ�"
 
	 -consoleȭ�鿡 ����ϴ� ��� �Լ�
	 	print()			: ���
	 	printIn()		: ����ϰ� �ٹٲ� ó��[\n] ����
	 	printf()		: ���Ĺ��� ���
 	
 	-����[�̽�������]����
 		1. \n : �ٹٲ�
 		2. \t : �鿩����(tab 5ĭ)
 		3. \" : ū����ǥ ���
 		4. \Ư������ : Ư������ ���
 			"ȫ�浿" ----> ȫ�浿
 			"\"ȫ�浿\"" ----> "ȫ�浿"
 	
 */