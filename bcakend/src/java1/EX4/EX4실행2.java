package java1.EX4;

public class EX4����2 {

	public static void main(String[] args) {
		
		// 1. �Ű������� �ִ� �����ڷ� ��ü ����
		Korean k1 = new Korean( "���ڹ�","011225-1234567" );
		System.out.println( k1.name );
		System.out.println( k1.ssn );
		System.out.println( k1.nation );
	
		// 2. ������ڷ� ��ü ����
			Korean k2 = new Korean();
			k2.name = "���ڹ�";
			k2.ssn = "011225-1234567";
			
			System.out.println( k2.name );
			System.out.println( k2.ssn );
			System.out.println( k2.nation );
	}
	
}
