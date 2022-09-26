package java1.ch11API클래스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class 달력Dao {

	// 1. 필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static 달력Dao dao = new 달력Dao();	// 싱글톤
		// 싱글톤 외부로 호출시키는 메소드
		public static 달력Dao getInstans() { return dao; }				//getInstans 이게 자동완성이 아니였다니...
	
	// 2. 생성자
	private 달력Dao() {
		// private 접근제한자
		try {
			con = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/test", 
					"root",
					"1234");
			System.out.println("연동성공");
			}catch (Exception e) { System.out.println("오류발생 : " + e );}
	}
	
	boolean 일정추가 ( String cdate , String ccoment ) {
		String sql = "insert into Calender values( null ,? ,? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , cdate );
			ps.setString( 2 , ccoment );
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	
	// 일정출력
	HashMap< Integer , ArrayList<String> > 일정출력( String year , String month ){
		String sql = "select * "
				+ " from Calender "
				+ " where substring( cdate , 1 , 4 ) = ? and substring( cdate , 6 , 2 ) = ? ;";
		HashMap< Integer , ArrayList<String> > map = new HashMap<>();
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString( 1 , year );
			ps.setString( 2 , month );
			
			rs = ps.executeQuery();
			while( rs.next() ) {
				ArrayList<String> values = new ArrayList<>();
				values.add( rs.getString(2) );
				values.add( rs.getString(3) );
				// pk와 리스트를 map에 담기
				map.put( rs.getInt(1) , values);
				
			}
			System.out.println( map.toString() );
			return map;
		} catch (Exception e) {  }
		return map;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	















