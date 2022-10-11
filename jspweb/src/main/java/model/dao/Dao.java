package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	Connection con;	PreparedStatement ps;	ResultSet rs;
	public Dao() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",  // 디비 이름이 jsweb임 오타아님..
					"root",
					"1234");
			 System.out.println("db 연동 성공");			  // 이거조차 안뜬다..
		}catch (Exception e) { System.out.println( "db연동실패" + e);}
	}
}