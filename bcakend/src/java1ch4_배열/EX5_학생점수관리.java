package java1ch4_�迭;

import java.util.Scanner;

public class EX5_�л��������� {//class s

	public static void main(String[] args) {//main s
		
		boolean run = true;		//���ѷ��� ���� ����
		int studentNum = 0; 	//�л� �� ������ ����
		int[] scores = null;	//������ ������ ������ �迭 [ �޸� �Ҵ� �� ]
 		Scanner scanner = new Scanner(System.in);
 		
		while(run) {//while s
			System.out.println("------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5. ����");
			System.out.println("���� : "); int selecNo = scanner.nextInt();
			
			if( selecNo == 1 )	// 1 �Է����� ��
				{System.out.print("�л� �� : "); studentNum = scanner.nextInt();
				 scores = new int[studentNum];	//�Է¹��� �л��� ��ŭ �迭�� �޸�(����) �Ҵ�
				 System.out.println("�迭�� "+ studentNum +"���� ���� �Է� ����");
				}
			
			else if( selecNo == 2 )	// 2 �Է����� ��
				{
					for( int i = 0; i<scores.length ; i++ ) {//for s i�� 0���� �迭�� ���̱��� 1�� ���� �ݺ� / null�϶� lenth �ȵ�
						System.out.println("scores["+i+"] : ");
						scores[i] = scanner.nextInt();		//i��° �ε����� �Է°��� ����
					}//for e
				}
			
			else if( selecNo == 3 )	// 3 �Է����� ��
				{
					for( int i = 0; i<scores.length; i++ ) {
						//System.out.println("scores["+i+"]> + "scores[i]); / �ڡ����ؾȰ�.. �� �̷� ����ϱ�ڡ�
						System.out.printf("scores[%d]> %d \n" , i , scores[i]); // %d = ������ ��� \n = �ٹٲ�
					}//for e
				
				
					/*�̰͵� ��
					int i = 0;
					for( int value : scores ) {//for s
						System.out.println( value );
						i++;
					}//for e
					*/
				}
			else if( selecNo == 4 )	// 4 �Է����� ��
				{
					int max = 0;
					int sum = 0;
					
					/*
					 for( Ÿ�� ������ : �迭 ){
				 				������			//* ������ Ÿ���� �迭�� Ÿ�԰� ����
						}
					 */
					
					for ( int value : scores ) {
						if( value > max ) { max = value; }//���࿡ �ش� ���� max���� ũ�� max ����
						sum += value;	//�ش� ���� sum ������ ���� ���ϱ�
					}
					System.out.println("�ְ� ���� : " + max );
					double avg = (double)sum/scores.length; 	//(double) ���� ����ȯ
					System.out.println("��� ���� : " + avg);
					
					
					
					//* ������ [ �������� ] ���
					
					for( int i = 0; i<scores.length; i++ ) {
						for( int j = i+1; j<scores.length; j++ ) { // > : �������� < : ��������
							// �� ���� ��ȯ
							if( scores[i] > scores[j] ) {
								int temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							}//if e
						}//for e
					}//for e
					
					// Ȯ��
					int rank = 0;
					for( int value : scores ) {
						System.out.println( (rank+1)+"�������� : "+ value );
						rank++;			//�� �ö���?
					}
					
	
					/*
					 * int temp;
					 * for( int i=0; i<scores.length; i++ ) { if(scores[i]>scores[i+1]) {
					 * scores[temp] += scores[i]; scores[i+1] += scores[temp]; scores[i] +=
					 * scores[i+1]; } }
					 */

				}
			else if( selecNo == 5 )
				{ run=false; }	// 5 �Է����� ��
			else
				{System.out.println("�ȳ�) �� �� ���� ��ȣ�Դϴ�.");}	// �׿� �Է����� ��
		
		}//while e
 		
 		
	}//main e
	
}//class e
