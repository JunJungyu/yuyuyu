package java1.ch_2연산자.copy2������;

public class EX_1������ {//class s

	public static void main(String[] args) {//main s
		
		// 1. ���
		int ����1 = 10; int ����2 = 20;
		System.out.print("���ϱ� : " + ����1 + ����2);
		System.out.println("���ϱ� : "+ (����1+����2));
		System.out.println("���� : "+(����1-����2));
		System.out.println("���ϱ� : "+(����1*����2));
		System.out.println("������ : "+(����1/����2));
		System.out.println("������ : "+(����1%����2));
		
		// 2. ��
		System.out.println("�̻� : "+(����1>=����2));
		System.out.println("���� :"+(����1<=����2));
		System.out.println("�ʰ� :"+(����1<����2));
		System.out.println("�̸� :"+(����1>����2));
		System.out.println("���� :"+(����1==����2));
		System.out.println("�����ʴ� :"+(����1!=����2));
		
		// 3. ��
		int ����3 = 30; int ����4 = 40;
		System.out.println("13. &&[AND] " + (����1>=����2 && ����3>=����4));
		System.out.println("14. ||[OR]" + (����1>=����2 || ����4>=����3));
		
		// 4. ����
		int ����5 = 10;	
		System.out.println("�������� : " + (����5++));        		//��� �Ŀ� 1 ����
		System.out.println("Ȯ�� :"+(����5)  );
		System.out.println("�������� :"+(++����5));					//��� ���� 1 ����
		System.out.println("�������� : "+(����5--));				//��� �Ŀ� 1 ����
		System.out.println("Ȯ�� : "+����5);				
		System.out.println("�������� : "+(--����5));				//��� ���� 1 ����
		
		// 5. ���Կ�����
		int ����6 = 10 ;	// = : ����
		����6 += 3 ; 		// += : ������ �����͸� ���ʿ� ���� �Ŀ� ����
			// 1. ����6 + 3	-> 13	2. ����6 = 13
		System.out.println("���� ��� : "+����6);
		
		����6 -= 5;		// 1. ����6-5 -> 8	2. ����6 = 8
		System.out.println(" ���԰�� : "+����6);
		
		// 6. ���׿�����
		int ���� = 85;
		char ��� = ���� > 90 ? 'A' : 'B';			//	���ǽ� ? �� : ����
					//���࿡ ������ 90�� �ʰ��̸� 'A' ���� �ƴϸ� 'B' ����
		System.out.println("��ް�� : "+���);
		char ���2 = ���� > 90 ? 'A' : ���� > 80 ? 'B' : 'C' ;
		System.out.println("��� ��� : "+ ���2);
		
	}//main e
	
}//class e


/*
 
 	������ : ���� ���Ǵ� Ư������
 		1. ���������
 			+���ϱ� -���� *���ϱ� /������ %������
 			+ ���Ῥ����
 		
 		2. �񱳿����� -> ture Ȥ��  flase
 			>= �̻� <=���� >�ʰ� <�̸� ==���� != �����ʴ�
 		
 		3. �������� �񱳿����ڰ� 2�� �̻��� �� ���
 			&& : and[ and �̸鼭 �鼭 �̰� �׸��� ��� ]
 			|| : or[ �̰ų� �ų� �Ǵ� �ϳ��� ] 
 			 ! : not[ ����(�ݴ�) : ture -> flase / flase -> ture ]
 			 
 		4. ���Կ�����
 			= : ������ �����͸� ���ʿ� ����(����)
 			+= : ������ �����͸� ���� �����Ϳ� ���� �� ���ʿ� ����
 			*= /= %= -=
 			
 		5. ����������
 			++���� [ �������� ]
 			����++ [ �������� ]
 			--���� [ �������� ]
 			����-- [ �������� ]
 	
 		6. ���׿�����
 			���ǽ� ? �� : ����
 			���ǽ�1 ? ���ǽ�2? ��2 : ����2 : ����1 --> ���ǽ��� ������ �������� �������� if �����
 
 */