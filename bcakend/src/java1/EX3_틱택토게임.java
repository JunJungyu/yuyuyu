package java1;

import java.util.Random;
import java.util.Scanner;

public class EX3_ƽ������� {//class s

	public static void main(String[] args) {//main s
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[ ] ������ = { "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" , "[ ]" };
		int ��ǻ��;
		
		// 2. ����ڿ��� ��ġ �Է¹ޱ�
		while(true) {
			// 1. ������ ��� = �迭 �� ��� ������ ���
			for( int i = 0; i<������.length ; i++ ) {//i�� 0���� �������ε��� ( �迭�� ����-1 ) ���� 1�� ����
				System.out.print(������[i]);
				// 1-2 3�ٸ��� �ٹٲ� ó��
				if( i % 3 == 2 ) {
					System.out.println();
				}
			}
			while(true) {
			System.out.println("�ȳ�) ��ġ���� : "); int ��ġ = scanner.nextInt();
			if( ��ġ<0 || ��ġ>8 ) {System.out.println("�ȳ�) ������ �� ���� ��ȣ�Դϴ�.");}
			// ��� ��ġ�� ���� ������ �� �α�
			if( ������[��ġ] .equals("[ ]") ) { ������[��ġ] = "[��]"; break; }
			else { System.out.println("�ȳ�) �̹� ���� �����ϴ� ��ġ�Դϴ�."); }
			continue;	
					}//while e
			Random random = new Random();
			��ǻ�� = random.nextInt( 9 );
			if( ������[��ǻ��] .equals("[ ]") ) { ������[��ǻ��] = "[��]"; break;}
			}
			
			while(true) {
				if( ������[0] .equals("[��]") && ������[1] .equals("[��]") && ������[2] .equals("[��]") ) {
					System.out.println("�ȳ�) �浹 ���� �¸�");
			
				}
			}
		}//main e
	
	}//class e


		/*
		 * System.out.println("�÷��̾�(�浹) ��ġ�� �Է����ּ���"); int �浹 = scanner.nextInt(); if(
		 * �浹>=0 && �浹<=8 ){ System.out.println("�ȳ�) �÷��̾�(�浹) �Է� �Ϸ�");
		 * 
		 * for( int i = 0; i<������.length ; i++ ) {//i�� 0���� �������ε��� ( �迭�� ����-1 ) ���� 1�� ����
		 * if( ������[�浹] .equals("[ ]") ) { ������[�浹] += "[��]"}
		 * 
		 *  Random random = new Random(9);
		 * 
		 * }
		 * 
		 * 
		 * System.out.print(������[i]);
		 * 
		 * // 1-2 3�ٸ��� �ٹٲ� ó�� if( i % 3 == 2 ) { System.out.println(); } }
		 * 
		 * 
		 * 
		 * }else {System.out.println("�ȳ�) 0~8���̷� �Է����ּ���");}
		 */
				


/*

	ƽ���� ����
		[ ���� ]
		1. ������ 9ĭ ��� -> �迭
			1.  string �迭	Ŭ������ �� ������ �Ұ��� ==[X] --> �׷��� ���ڿ�.equals(���ڿ�) ���
			== : ���ڿ�1.equals(���ڿ�2)
			!= : !���ڿ�1.equals(���ڿ�2)
			
			
		2. ����ڰ� ���� �ΰ����ϴ� ��ġ�� [ �ε��� ]�� �Է�
			1. ���õ� ��ġ�� �̹� �ٸ� ���� �����ϸ� ���Է� [ �ߺ����� ]
		3. ��ǻ�Ͱ� ���� ���� [ 0~8 ]
			1. ������ ��ġ�� �̹� �ٸ� ���� �����ϸ� ����� [ �ߺ����� ]
		4. �¸��� �Ǵ� [ 1. ���η� �̱�� �� 2. ���η� �̱�� �� 3. �밢������ �̱�� �� 4. ���º� ]
		
		[ ��� ]
			1. ������ ��� ����
			[ ] [ ] [ ]
			[ ] [ ] [ ]
			[ ] [ ] [ ] 

*/