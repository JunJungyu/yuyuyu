package java1.ch10예외처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {

	private Connection con;
	private PreparedStatement ps;
	private static Dao dao = new Dao();
	
	private Dao() {
		
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_db" , "root" , "1234")	}		
		}
	
	
	// 메소드
	public void singup() throws SQLExcption {
		String sql = "insert into mamber = ? ";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
	}
	
}
