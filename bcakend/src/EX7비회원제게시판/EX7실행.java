package EX7��ȸ�����Խ���;

import java.util.Scanner;

public class EX7���� {

	public static void main(String[] args) {
	/////////////////////////////////// 1���� ����Ǵ� ���� ///////////////////////////////////////
	// 0. �޸� 
	Scanner scanner = new Scanner(System.in); // �Է°�ü
	Board[] boardlist = new Board[100]; // Board ��ü 100���� ���� �� �� �ִ� �迭 ���� 
	//////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////// ���� ����Ǵ� ���� //////////////////////////////////////////
	while( true ) {
	///////////////////////////////////// ��� �Խù� ��ü [�迭] ���  //////////////////////////////////////////
	System.out.println("------------------- ��ȸ�� �Խ��� ----------------------");
	System.out.println("��ȣ\t\t�ۼ���\t\t����");
	int num = 0;
		for( Board temp : boardlist ) { // �迭�� ��� ��ü�� �ϳ��� temp ��ü�� �ݺ� ����
			if( temp != null )System.out.printf("%d\t\t%s\t\t%s\n" , num , temp.writer , temp.title ); // ���� ��ü�� �����ϸ� ��� 
			num++;
		} // for end 
	//////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println("-----------------------------------------------------");
	System.out.print("1.�۾��� 2.�ۺ��� ���� : ");
	int ch = scanner.nextInt(); // ��� -> �Է�( int ) -> ���� ( int ) -> ����( if )
	///////////////////////////// 1���� �Է������� ����Ǵ� ���� ///////////////////////////////////
		if( ch == 1 ) { 
		// 1.���[ �ȳ� ] -> �Է� -> ���� 
		scanner.nextLine();
		System.out.print("���� : ");		String title = scanner.nextLine();
		System.out.print("���� : ");		String content = scanner.nextLine();
		System.out.print("�ۼ��� : ");	String writer = scanner.next();
		System.out.print("��й�ȣ : ");	String password = scanner.next();
		// 2. ����� ���� 4���� �ϳ��� ��ü�� �����[ 4�������� ���� -> ���ϱ� ]
		//Board regist = new Board();
		//regist.title = title; regist.content = content; regist.writer = writer; regist.password = password;
		Board regist = new Board(title, content, writer, password, 0 );
		// ��ü���� : Ŭ������ ������ = new ������( �Ű����� ������� ); 
		// 3. �迭�� ��ü ���� [ �� ������ ã�Ƽ� �� ������ ���� ] 
			for( int index = 0 ; index<boardlist.length ; index++ ) {
				if( boardlist[index] == null ) { // ���� �ش� �ε����� ��ü�� ������ 
				boardlist[index] = regist; 	
				System.out.println("�ȳ�] �� ����� �Ǿ����ϴ�."); 
				break; 
				} // if end 
			} // for end 
		} // if end 
	///////////////////////////////////////////////////////////////////////////////////////
		else if( ch == 2 ) { // �Խù���ȣ --> �ε�����ȣ 
		System.out.print("�ȳ�) �̵��� �Խù� ��ȣ : "); int select = scanner.nextInt();
		Board board = boardlist[select]; // �Էµ� ��ȣ[�ε���]�� ��ü ȣ��
		System.out.println("------------"+ select+"�� �Խù� �� ������ -----------");
		System.out.print("���� : " + board.title );
		System.out.println("\t�ۼ��� : " + board.writer );
		System.out.println("���� : " + board.content );
		System.out.println("-----------------------------------------------------");
		System.out.print(" 1.��Ϻ��� 2.���� 3.����  ���� : ");
		int ch2 = scanner.nextInt();
		if( ch2 == 1 ) {} // ������ while ��ݺ�
		else if( ch2 == 2 ) {
		System.out.print("�ȳ�) ��й�ȣ : ");  	String password = scanner.next();
			if( board.password.equals( password) ) {
			// ���� ����Խù��� ��й�ȣ �� �Է¹��� ��й�ȣ�� ������[ equals ] 
				// ��ĭ�� ���� [ ������ �ε��� �ڷ� ]
					for( int index = select ; index<boardlist.length ; index++ ) {
						// ���� ���� �ִ� �Խù��� �ε��� ���� ������ �ε������� 1������ 
						boardlist[index] = boardlist[index+1]; // ��ü�� ��ĭ�� ������ ����
						if( boardlist[index+1] == null ) {  System.out.println("�ȳ�) ����ó�� �߽��ϴ�."); break; } // ���� ��ü�� null�̸�
					} // for end
			} // if end 
		else { System.out.println("�ȳ�) �н����尡 �ٸ��ϴ�. ");}
		} // else if end 
		else if( ch2 == 3 ) {
		System.out.print("�ȳ�) ��й�ȣ : ");  	String password = scanner.next();
		if( board.password.equals( password) ) {
		scanner.nextLine();
		System.out.print("������ ���� : "); 		boardlist[select].title = scanner.nextLine();
		System.out.print("������ ���� : ");		boardlist[select].content = scanner.nextLine();
		System.out.println("�ȳ�) ����ó�� �߽��ϴ�.");
		} // if end
		else { System.out.println("�ȳ�) �н����尡 �ٸ��ϴ�. "); }
		} // else if end 
		else { System.out.println("�ȳ�) �˼� ���� ��ȣ�Դϴ�. "); }
		} // else if end 
	else {  System.out.println("�ȳ�) �˼� ���� ��ȣ�Դϴ�. "); }
	}  // while end 
	//////////////////////////////////////////////////////////////////////////////////////////////////
	} // main end 
	} // class end 
	
	/*
	
	���� [ �޸� ] 
	1. ���� 2.���� 3.�ۼ��� 4.��й�ȣ
	������ : 1. 2�����迭  	2.Ŭ����->��ü->1�����迭
	Ŭ���� ���� 
	Ŭ���� ��� : �ʵ� , ������ , �޼ҵ� 
	1. �ʵ� : �޸� ����
	1. ���ڿ� ����
	2. ���ڿ� ���� 
	3. ���ڿ� �ۼ���
	4. ������ ��й�ȣ 
	5. ������ ��ȸ��
	2. ������
	1. ��[�Ű������� ���� ] ������
	2. Ǯ[��� �Ű������� �ִ� ] ������		
	*/
