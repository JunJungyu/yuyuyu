package 개인과제.강사님;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxConnection.CapabilitiesOrBuilder;

public class ExpenseDAO {

	// 1.  필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExpenseDAO dao = new ExpenseDAO();		// 싱글톤
	
	// 2. 생성자
	public ExpenseDAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", 
				"root",
				"1234"
				);			
		} catch (Exception e) {System.out.println("연동실패"+e);}
	
	}
	
	
	// 3. 메소드				// 강사님은 getinstance 사용하셨는데 이건 뭐지 지어준 이름일까 자동완성이 되는걸까... 왜 난 안뜨지
	public static ExpenseDAO getExpenseDAO() {return dao;}
	
	
	// 1. 내용추가 sql메소드
	boolean create( ExpenseDTO dto ) {
		String sql = "insert into expense values( null , ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getEdate() );
			ps.setString( 2 , dto.getEcomanet() );
			ps.setInt( 3 , dto.getEmoney() );
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println("DB오류"+e);}
		return false;
	}
	
	// 2. 내용을 출력하는 SQL 메소드
	ArrayList<ExpenseDTO> read(){
		ArrayList<ExpenseDTO> list = new ArrayList<>();
		String sql = "select * from expense";
		try {
			ps = con.prepareStatement(sql);
			ps.executeQuery();
			
			while( rs.next() ) {				// rs.next() 다음 레코드
				// 레코드 --> 객체화[포장]
				// 레코드 [ 필드4개 ] 1개 --> 객체화 [ 필드4개 ] 1개 []
				ExpenseDTO dto = new ExpenseDTO(rs.getInt( 1 ), rs.getString( 2 ),	rs.getInt( 3 ), rs.getString( 4 ));
				// 첫번째필드 번호 "eno"라고 써도 됨
				// 현 레코드의 두번째 필드
				list.add(dto);
			}
			return list;// 반환
		} catch (Exception e) {}
		return list;
	}
	
	// 내용을 삭제하는 메소드
	boolean delete( int eno ) {
		String sql = "delete from * expense where eno = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt( 1 , eno );
			ps.executeQuery(); return true;
			
		} catch (Exception e) { }
		return false;
	}	
	
	
	// 
	
	boolean update( ExpenseDTO dto ) {
		String sql = "update expense set edate = '2020-05-05' , emoney = 600 , econtent = '껌'  where eno = 3";
		
	}
}








































