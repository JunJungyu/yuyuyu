package java1.ch6Ŭ����.EX6;

public class Member {

	// 1. �ʵ�
	String id;
	String password;
	String name;
	int point;
	
	// 2. ������
		// 1. �������
	public Member() {}
		// ȸ�����Խ� ���Ǵ� ������
	Member( String id , String password , String name , int point ){
		this.id = id;
		this.password = password;
		this.name = name;
		this.point = point;
	}
	
		// 3. ȸ���������� ��й�ȣ�� �̸� ���� �� ���Ǵ� ������
	Member( String password ){
		this.password = password;

		
		// 4. �α��� [ ���̵�, ��й�ȣ ] �� ���Ǵ� ������
	Member( String id , String password ){
		this.id = id;
		this.password = password;
	}
		
	}
	
	
}
