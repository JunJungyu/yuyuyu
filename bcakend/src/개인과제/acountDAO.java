package 개인과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import 키오스크.관리자.MenuDTO;

public class acountDAO {

	public static void main(String[] args) {
		
		try {
			// 1. DB연동 
			Connection con = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/acountbook_db", 
					"root",
					"1234");
			System.out.println("연동성공");
			
			//String sql = "insert into acount values( null , 20221109 , 3000 , '붕어빵' )";
			//PreparedStatement ps = con.prepareStatement(sql);
			//ps.executeUpdate();
			
			}catch (Exception e) { System.out.println("오류발생 : " + e );}
	}
	
	//현재 가계부 목록
	void getnow() {
		String sql = "selct * from acount";
	}
	
}
