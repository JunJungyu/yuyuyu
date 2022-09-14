package DATABASE.java����;
//�ڡ��̰͵� �� �ȸ���..�ڡ�
import java.sql.*;



public class JDBC���� {

	public static void main(String[] args) {
		
		// JDBC : �ڹٿ� DB ����
			// 1. ���̺귯�� �ʿ�! [ mysql-connector-java-8.0.30.jar ]
				// * jar : �̸� ������� Ŭ�������� ����
			// 2. �ش� ������Ʈ ���̺귯�� �߰�
				// 1. �ش� ������Ʈ ������ Ŭ��
				// 2. build path -> configure build path
				// 3. libraries �� ����
				// 4. add External Jar -> �ش� jar ���� ����
					// �ش� jar ������ ��� ����Ǹ� ���̺귯�� ���� �Ұ���
				// 5. apply
			// 3. �̸� ������� JDBC ���õ� Ŭ������ ����� �� �ִ�.
				// 1. Connection : �������̽�
				// 2. DriverManager : Ŭ����

		// MYSQL ���� �� �� �ش� Ŭ�������� ���� ( �����߻� )
		
		
		
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection con = DriverManager.get		// �ڡڿ����� �ȵǰ�ڡ�
		    		  
		            "jdbc:mysql://localhost:3306/shop_db2",
		            "root",
		            "1234");
		      System.out.println("db ����");
		      
		      
		      /*
		      // JDBC���� SQL����
		      // 1. ���̺� ������ �߰�
		      		// 1. sql ������ " " ���ΰ� ���ڿ��� ����
		      	String sql = "insert into mamber values('tess','���ƾ�','��� ��õ�� �ߵ�')";
		      	// 2. sql ���� �������̽�
		      	PreparedStatement ps = con.prepareStatement(sql);
		      	// 3. SQL ����
		      	ps.executeUpdate();
		      	
		      	
		      	// ������
		      	sql = "insert into mamber values('iyou','������','��õ ���� �־ȵ�')";
		      	ps = con.prepareStatement(sql);
		      	
		      	// ������
		      	sql = "insert into mamber values('jyp','������','��� ���� ���׵�')";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      
		      
		      
		      	// ������ �ּ� ����
		      	sql = "update member set member_addr = '��⵵ �Ȼ�� ��ϱ�' where member_id = 'jyp' ";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      	// ������ ���ڵ� ����
		      	sql = "delete from member where member_id='iyou'";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      	
		      		*/
		      	
		      	// ��� �ɹ� ȣ��
		      	String sql = " selsct * from member ";		
		      	PreparedStatement ps = con.prepareStatement(sql);
		      	ResultSet rs = ps.executeQuery();	// ���� [ SQL ���̺� ���۵� ��� ]
		      		// ����� ���ڵ�[��] ������ �����ϱ� ������
		      		// �������ϱ� �ݺ��� �̿��� ���ڵ� �ϳ��� ���
		      		// null -> �˻����ڵ�1 -> �˻����ڵ�2
		      		// .next() : ���� ���ڵ� ȣ�� [ ���� ���ڵ尡 ������ TRUE ���� ���ڵ尡 ������ FALSE �� ��ȯ �ݺ��� ���� ]
		      		// getString ( �ʵ������ȣ ) : �ش� �ʵ��� �����͸� ���ڿ��� ��������
		      		// ��ȣ�� .getint ( �ʵ������ȣ ) ��ߵ�		: �ش� �ʵ��� �����͸� �������� ��������
		      	
		      	while( rs.next() ) {	//	while( ���� ) : ������ true�� �ݺ��� ����
		      		System.out.print("ȸ�����̵� : " + rs.getString(1) + "\t");	// ù��° �ʵ��� ������ ��������
		      		System.out.print("ȸ���� : " + rs.getString(2) + "\t");
		      		System.out.print("ȸ���ּ� : " + rs.getString(3) + "\n");
		      	}
		      	

		      	
		      	
		      }
		      catch(Exception e){
		      System.out.println("db ����");
		      }

				
		
		
	}//main e
}//class e
