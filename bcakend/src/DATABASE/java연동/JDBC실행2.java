package DATABASE.java����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC����2 {

	public static void main(String[] args) {
		try {
		// 1. DB���� 
		Connection con = DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/shop_db3", 
				"root",
				"1234");
		System.out.println("��������");
		
		// 2. SQL �ۼ�
		String sql = "insert into product values('�ٳ���',1500,'2021-07-01','����Ʈ',17)";
		// 3. SQL ����[����] 
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. SQL ���� 
		ps.executeUpdate();
		
		sql = "insert into product values('ī��',2500,'2022-03-01','OB', 3 )";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		
		sql = "insert into product values('�ﰢ���',800,'2023-09-01','CJ',22)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		
		// 1. ī���� �������� 10�� ����
		sql = "update product values '10';
		ps = con.prepareStatement(sql);
		ps.executeUpdate();		
		
		// 2. �ﰢ��� ���� 
		
		
		// 3. ��� ��ǰ�� ������ console ��� 
		
		
		
		
		}catch (Exception e) { System.out.println("�����߻� : " + e );}

	}
}
