package java1ch4_�迭;

import java.util.Random;
import java.util.Scanner;
/*
 
 	�ζ� �Ǻ���
 		1. ���Ź�ȣ : ����ڿ��� 6�� �� �Է� -> �迭����
 			1. 1~45 ���̸� �Է¹ޱ� �ƴϸ� ���Է�
 			2. �ߺ� X
 			
 		2. ��÷��ȣ : ��ǻ�� ���� 6�� ���� -> �迭����
 			1. 1~45 ���� ����
 		3. ���Ź�ȣ�� ��÷��ȣ�� ������ ���� ����
 			
 */
	
public class EX2_�ζ��Ǻ��� {//class s

	public static void main(String[] args) {//main s
		
	
			// 0. �޸�[����/�迭] ����
		Scanner scanner = new Scanner(System.in);
		int[] ���Ź�ȣ = new int[6];	// int�� ���� 6���� ������ �� �ִ� ����
		int[] ��÷��ȣ = new int[6];	// int�� ���� 6���� ������ �� �ִ� ����
		
		// ------------------ 1. ����ڿ��� �Է¹޴´�. [6��] ------------------ 
		for( int i = 0; i<6; i++ ) { // i = �ε���
			System.out.println("�ȳ�) " + (i+1) + "��° ��ȣ ���� : ");
			���Ź�ȣ[i] = scanner.nextInt(); // �Է¹��� ���� i��° �ε����� �����Ѵ�.
			// [����1] 1~45 ���� �Է¹ޱ�
			if ( ���Ź�ȣ[i] <= 0 || ���Ź�ȣ[i] > 45 ) { // ���࿡ �Է°��� 1���� �۰ų� 45���� ũ�� ���Է�
				System.err.println("�ȳ�) ������ �� ���� ��ȣ�Դϴ�.");
				i--; // ���� i�� ��ȿȭ
				continue; // �ٽ� �ݺ��� ���� --> ������ �̵�
			}// if e
			
			
			
			// [����2] �迭 �� �Էµ� ������ Ȯ�� [ �ߺ�Ȯ�� ]
			boolean �ߺ�üũ = false; // �ߺ����θ� �����ϴ� ����
			// [ ����2 ] �迭 �� �Էµ� ������ Ȯ�� [ �ߺ� Ȯ�� ]
			for( int j = 0; j<i ; j++ ) {
				if( ���Ź�ȣ[j] == ���Ź�ȣ[i] ) { // ���࿡ j��° �ε����� ���� i��° �ε����� ���� ������
					System.out.println("�ȳ�) �̹� ���õ� ��ȣ �Դϴ�.");
					�ߺ�üũ = true;
				}//if e
			}//for2 end
			//for2 �� ������ ��  true�̸� ���Է�
			if( �ߺ�üũ == true ) { i--; continue; }
			
			//[����1/����2] ��� ��� �� �ڵ�
			System.out.println("���� "+���Ź�ȣ[i]+"�� �����ϼ̽��ϴ�.");
			
		} // for end
		// 2. ��ǻ�� ���� �޴´�.
		for( int i = 0; i<6 ; i++ ) {//for 3 s
			
			Random random = new Random();	// ������ ���õ� �޼ҵ� ����
			��÷��ȣ[i] = random.nextInt(45)+1;	// random.nextInt( �� );  // 0 ~ �� ������ ���� �߻� / +1 �ϴ� ������ ������ 0���� ��������ϱ�? ���۹�ȣ~����ȣ ���� ���� �߻� (����ȣ)+���۹�ȣ
			// [ ����1 ] �ߺ�üũ
			for( int j=0; j<i; j++ ) {// for4 s
				if( ��÷��ȣ[j] == ��÷��ȣ[i] ) { i--; }
			}// for4 e
		}//for 3 e
		
		// ���Ź�ȣ , ��÷��ȣ ���
		for ( int value : ���Ź�ȣ ) {
			System.out.print("���� ���Ź�ȣ");
			System.out.printf("%2d\t" , value);
		}
		System.out.println();
		for ( int value : ��÷��ȣ ) {
			System.out.print("�ζ� ��÷��ȣ");
			System.out.printf("%2d\t" , value);
		}
		System.out.println();
		
		int ��÷���� = 0;
		for( int i = 0; i<���Ź�ȣ.length ; i++) {
			for( int j=0; j<��÷��ȣ.length ; j++ ) {
				if( ���Ź�ȣ[i] == ��÷��ȣ[j] ) {��÷����++;}
			}
		}
		System.out.println("�� ��÷���� "+��÷����+"��");
	
	
	}//main e
}//class e
