package EX7��ȸ�����Խ���;

public class Board {

	// Ŭ���� �ɹ�
	// 1. �ʵ� 
	String title ; // ����ũ��[�ڷ���] �����̸�[������]
	String content; 
	String writer;
	String password;
	int view;
	
	// 2. ������
		// 1. �� ������ [ �⺻ ������ ]
	Board() {}
	
		// 2. �� ������
	Board( 	String title , String content , 
			String writer , String password , 
			int view ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
		
	}
	
	// 3. �޼ҵ�
	
}
