package java1.ch_2연산자.copy������;

import java.awt.print.Printable;
import java.util.Scanner;

public class EX_2�����ڹ��� {//class s

	public static void main(String[] args) {//main s 
		
		/*
		 
		 Scanner.nextInt() 		: �Էµ� �����͸� int������ �������� - ���� -   
		 Scanner.nexDouble()	: �Էµ� �����͸� Double������ ��������
		 
		 
		 
		 
		����1 : �޿� ��� 
			[����] �Է¹ޱ� : �⺻�� , ���� 
			[���] �Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻��10%]
	 */
									//���� �ڷ���??? 1. �� 2. ���� 3. �Ǽ� 4. ���ڿ�
									/*
									  System.out.Printable("����2) �ݾ�"); int �ݾ�; �ݾ� = scanner.nextInt(); // 1. �ʸ��� ���
									  System.out.printIn("���� : " + (�ݾ�/10000) + "��");
									 */
		
	/*
	 	����2 : ���� ���� ���� 
	 		[����] �ʸ��� ������ �ݾ��� �Է¹ޱ� 
	 		[���] �Է¹��� �ݾ��� ����� ��� 
	 		[����]  356789
	 			�ʸ��� : 3�� 
				���� : 5�� 
				õ�� : 6��
	*/			
		Scanner scanner = new Scanner(System.in);	//�̰� �� �־�ߵ� � ������ ��������? Ű���忡�� �Է¹޴´� ��..
	
		/*
	
	 	//����3 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸� '�´�' �ƴϸ� '�ƴϴ�' [ if x ]
		int ����3 = scanner.nextInt();	//�Ȱ��� ��µ� �� ����? �� �ڵ��ϼ��� nextInt�� �ȶߴ°�
		String ���3 = ����3 % 7 == 0 ? "7��� �½��ϴ�" : "7��� �ƴϴ�"; // [ ��� : ��%�� == 0 , ���� �� ���� ��� ]
		
		System.out.println("��� 3 : "+���3); 	
	 	
	 	
	 //	����4 : �ϳ��� ������ �Է¹޾� Ȧ���̸� �̸� 'Ȧ��' �ƴϸ� '¦��' [ if x ]
		System.out.println("���� 4) ���� �Է� : "); int ����4 = scanner.nextInt();
		String ����4�� = ����4 % 2 == 1 ? "Ȧ��" : "¦��";

		System.out.println("���4 ) + ���4"+����4��);
		
	 //	����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� �̸� '��' �ƴϸ� '����' 
		System.out.println("����6) ���� �Է�:"); int ����5 = scanner.nextInt();
		String ���5 = ����5 % 7 == 0 && ����5 % 2 == 0 ? "��" : "����";
			System.out.println("���5) :" + ���5);
		
	 	//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ��� 
		System.out.println("����6_1 ���� �Է� : "); int ����6_1 = scanner.nextInt();
		System.out.println("����6_2 ���� �Է� : "); int ����6_2 = scanner.nextInt();
		System.out.println("���6) :" + ( ����6_1 > ����6_2 ? ����6_1 : ����6_2 )  );
		
		
	 	//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
	 		// �� ���� ���� = ������ * ������ * ������[3.14]
		System.out.println(" ����7 : ");			 double ������ = scanner.nextDouble();
		System.out.println(" ���7 ������ : " + ( ������ * ������ * 3.14 ) );
		
	 //	//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� �� %���� ����ϱ� 
	 		// ��) 54.5     84.3  �Է�������    64.285714% ��� 
		System.out.println("����8) �Ǽ�1 : "); 	double ����8_1 = scanner.nextDouble();
		System.out.println("����8) �Ǽ�2 : ");		double ����8_2 = scanner.nextDouble();
		System.out.printf("��� : %.2f %% " , ( ����8_1/����8_2 )*100 );	//�Ҽ��� �ڸ����� ��¼�� ������ 	printf	%.2f %% ���⼭ 2�� �Ҽ��� �ڸ����̰� %�� �ϳ��� ���� �������ϱ�!
		
	 	//����9 : ��ٸ��� ���� ���ϱ� [ ������ �غ� ���̸� �Է¹޾� ����ϱ� ] 
	 		// ��ٸ��� ���� -> ( ���� * �غ� ) * ���� / 2 
		System.out.println("����9) ��ٸ��� ����:");		double ���� = scanner.nextDouble();
		System.out.println("����9) ��ٸ��� �غ�:");		double �غ� = scanner.nextDouble();
		System.out.println("����9) ��ٸ��� ����:");		double ���� = scanner.nextDouble();
		System.out.println("����9) ��� : " + ( ( ���� * �غ� ) * ���� / 2) );
		
		
	 	//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
			//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		System.out.println("����10) Ű :"); 	double Ű = scanner.nextDouble();
		System.out.println("����10) ǥ��ü�� :" + ( Ű -100 )*0.9 );
		//����11 : Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
			//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		System.out.println("����11) Ű :");	double �����_Ű = scanner.nextDouble();
		System.out.println("����11) ����� ������ :");	double �����_������ = scanner.nextDouble();
		System.out.println("����11) ��� : " + ( (Ű / 100) * (Ű / 100) ) );
		
		
	 	//����12 : inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		System.out.println(" ���� 12 inch : "); int ��ġ = scanner.nextInt();
		System.out.println("��� :" + ( ��ġ*2.54 ) + "cm");
		
		*/
		
	 	//����13 :  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		System.out.println(" �߰���� ���� : "); 	double �߰� = scanner.nextDouble() * 0.3;
		System.out.println(" �⸻��� ���� : "); 	double �⸻ = scanner.nextDouble() * 0.3;
		System.out.println(" ������ ���� : "); 	double ���� = scanner.nextDouble() * 0.4;
		System.out.printf("��� : %.2f" , (�߰�+�⸻+����) );			//	%f = �Ǽ� (���� ����) %[�� ��� �Ҽ��� ����]f
		
		
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
 				//int x = 10;
				//int y = x-- + 5 + --x;
				//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		int x = 10;
		int y = x-- + 5 + --x;
				
		System.out.printf("\n x�� �� : %d , y�� �� : %d " ,  x , y );
	
	/*
	1. x������ 10 �����Ѵ�.
	2. y������ ����
		1. x-- : 10 [ ���� ���� = ���� ���߿� �� ���� ]
		2. --x : 9  [ ���� ���� ]
		3. 10 + 5 + 9 : 24
        4. = 		[ ������ ������ ]	
        5. 
	3. ���
		x = 8
		y = 23
	*/
		
	}//main e
	
}//clas e
