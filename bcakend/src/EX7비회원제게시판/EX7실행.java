package EX7��ȸ�����Խ���;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.border.Border;

public class EX7���� {

	public static void main(String[] args) {
		
		//////////////////////////////////////////�ѹ��� �����/////////////////////////////////////////
		// 0. �޸�
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];	//Board ��ü 100���� ������ �� �ִ� �迭 ����
		///////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////����///////////////////////////////////////////
		while ( true ) {
			
			// ��� �Խù�[ �迭 ] ���
			System.out.println("-----��ȸ�� �Խ���-----");
			System.out.println("��ȣ\t\t�ۼ���\t\t����");
				// 1.
			/*
			for( int index = 0 ; index<boardlist.length; index++ ) {
				System.out.printf("%d\t%s\t%s" , boardlist[index].writer , boardlist[index].title);
			}
			*/
				// 2.
			int num = 0;
			for ( Board temp : boardlist ) { // �迭 �� ��� ��ü�� �ϳ��� temp ��ü�� �ݺ� ����
				num++;
				if( temp != null ) {
				System.out.printf("%d \t %s \t %s \n " , num , temp.writer , temp.title);
			
				}
			}
			
			System.out.println("1. �۾��� 2. �ۺ��� 3. ����: ");
			int ch = scanner.nextInt();
			// ��� -> �Է�( int ) -> ���� ( int ) -> ����( if )
			
			//////////////////////////////////////����1�϶�/////////////////////////////////////////////
			if( ch == 1 ) {
				// 1. ���(�ȳ�)						-> �Է� -> ����
				System.out.println("���� : ");		String title = scanner.nextLine();
				scanner.nextLine(); // next Line���� �������ϱ� �׳� �ٹٲٴ� �뵵�� �־���
				
				System.out.println("���� : ");		String content = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("�ۼ��� : ");		String writer = scanner.next();
				System.out.println("��й�ȣ : "); 	String password = scanner.next();
				
				// 2. ����� ���� 4���� �ϳ��� ��ü�� ����� [ 4�� ������ ���� -> ���ϰ� ]
				//Board regist = new Board();	�Ʊ� �̸��� ���Ƽ� �ȵƾ���..
				
			Board regist = new Board( title, content, writer, password, 0 );
			// ��ü���� : Ŭ������ ������ = new ������ ( �Ű����� ������� );
			// 3. �迭�� ��ü ���� [ �� ������ ã�Ƽ� �� ������ ���� ]
			for( int index = 0 ; index<boardlist.length; index++ ) {
				if( boardlist[index] == null ) { // ���� �ش� �ε����� ��ü�� ������
					boardlist[index] = regist;
					System.out.println("�� ����� �Ǿ����ϴ�.");
					break;
				}
			}
			///////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////����2�϶�////////////////////////////////////////
			}else if( ch == 2 ) {
				System.out.print("�ȳ�) ������� �� ��ȣ�� �Է����ּ���. ");
				int select = scanner.nextInt();
				Board board = boardlist[select];	// �Էµ� ��ȣ[�ε���]�� ��ü ȣ��
				
				System.out.println("---------"+select+"�� �Խù� ��������--------");
				System.out.print("�ۼ��� : " + board.writer );
				System.out.println("\t���� : " + board.title );
				System.out.println("\t���� : " + board.content );
				System.out.println("------------------------");
				System.out.print("1. ��Ϻ��� 2. ���� 3. ���� ��å : ");
				int ch2 = scanner.nextInt();
				if( ch2 == 1 ) {}
				else if( ch2 == 2 ) {
					System.out.println("�ȳ�) ��й�ȣ : ");	String pasaword = scanner.next();
					if( board.password.equals(pasaword) ) {
						// ���� ���� �Խù��� ��й�ȣ�� �Է¹��� ��й�ȣ�� ������[ .equals ]
						
							// ��ĭ�� ���� [ ������ �ε��� �ڷ� ]
							for( int index = select ; index<boardlist.length; index++ ) {
								// ���� ���� �ִ� �Խù��� �ε��� ���� ������ �ε������� 1�� ����
								boardlist[index] = boardlist[index+1]; // ��ü�� ��ĭ�� ������ ����
								if( boardlist[index+1] == null ) { break; }	// ���� ��ü�� null�̸�
							}
					}
				}
				else if( ch2 == 3 ) {
					System.out.println("�ȳ�) ��й�ȣ : ");	String pasaword = scanner.next();
					if( board.password.equals(pasaword) ) {
						
						System.out.println("������ ������ �Է����ּ���.");	boardlist[select].title = scanner.nextLine();
						scanner.nextLine();
						System.out.println("������ ������ �Է����ּ���.");	boardlist[select].content = scanner.nextLine();
						scanner.nextLine();
						
						System.out.println("�����Ǿ����ϴ�.");
					}
					else { System.out.println("�ȳ�) �н����尡 �ٸ��ϴ�."); }
				}
				
				else if( ch2 == 4 ){}
			///////////////////////////////////////////////////////////////////////////////////	
				
				///////////////////////////////////////////���ó�����////////////////////////////////////////
			}else {}
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////	
		}//while e
	}//main e
}//class e
/*

	���� [ �޸� ]
		1. ���� 2. ���� 3. �ۼ��� 4. ��й�ȣ
		������ : 1. 2���� �迭 2. Ŭ����->��ü->1�����迭
	Ŭ���� ����
		Ŭ���� �ɹ� : �ʵ� , ������ ,  �޼ҵ�
		1. �ʵ� : �޸� ����
			1. ���ڿ� ����
			2. ���ڿ� ����
			3. ���ڿ� �ۼ���
			4. ������ ��й�ȣ
			5. ������ ��ȸ��
		2. ������
			1.�� [ �Ű������� ���� ] ������
			2. �� [ ��� �Ű������� �ִ� ] ������
	
		
*/
