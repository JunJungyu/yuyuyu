package java1.ch5클래스.비회원제게시판DB버전;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDao {
	
	// 1. 필드 
	// JDBC 자주 사용 하는 클래스/인터페이스
	Connection con; 		// DB 접속할수 있는 인터페이스
		// con = DriverManager.getConnection( "db주소" , "db계정명" , "db비밀번호" ) 
		//	-- 오류 발생[ 예외 발생 ] : 만약에 접속실패 했을때에 대한 대처 방안 [ 예외 처리 try~catch ]
	PreparedStatement ps; 	// 접속된 DB에 SQL 연결 조작하는 인터페이스 
	ResultSet rs;			// SQL 결과를 조작하는 인터페이스 

	// 2. 생성자 
	public BoardDao() {
		// 빈생성자에 DB 접속 코드 ( 객체 생성시 자동으로 DB 접속 )
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/boardtest",
				"root",
				"1234");
		}catch (Exception e) { System.out.println("경고) DB 접속 실패 " + e ); }
	}
	
	// 3. 메소드 
		// 1. 등록 메소드
	boolean regist( BoardDto boardDto ) {
		// 1. sql 작성
		String sql = "insert "	// 띄어쓰기 해주기?
					+ "into "
					+ "board( b_title  , b_content , b_writer , b_password , b_view ) "
					+ "values( ? , ? , ? , ? , ? )";
				// ? : 변수가 들어갈 자리 [ 와일드 카드 ]
		// sql 연결 조작
		try {
		ps = con.prepareStatement(sql);
		// * : ? 에 변수 넣기
		ps.setString(1, boardDto.b_title);		//( n , ㅇㅇ ) n번재에 oo 넣자..	
		ps.setString(2, boardDto.b_content);
		ps.setString(3, boardDto.b_writer);
		ps.setString(4, boardDto.b_password);
		ps.setInt(5, 0);						//	이건 조회수니까 0부터 시작
		
		ps.executeUpdate();
		return true;	
		}catch (Exception e) {
		
			return false;
		}
	}
	
	// * 전체 게시물 수 구하는 메소드
	 
		
		// 1. SQL 작성
	int getrows() {
		String sql = "select count(*) from board"; // 1. SQL 작성
		
		try {// 2. SQL 연결/조작
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// 3. SQL 결과
			if( rs.next() ) {
			return rs.getInt(1);}
			} catch (SQLException e) {
			System.out.println("경고");}
			return 0; // 없으면 0
			
	}
		// 2. 모든 게시물 출력 메소드 
	BoardDto[] getBoardlist( ) {
		int rowcount = getrows();
		BoardDto[] boardlist = new BoardDto[ rowcount ];	// 배열의 길이 = ㄱㅔ시물수
		// 1. SQL 작성
		String sql = "select * from board";
		// 2. SQL 연결/조작
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// rs 쿼리[sql결과]에 조작
				// rs -> null --.next()-->검색된 레코드1[행] -> 다음레코드[행]
			int row = 0;	// 배열에 인덱스를 대체할 변수 선언
			while( rs.next() ) {
				// 레코드 한개당 필드는 6개의 필드가 존재하기 때문에  -> 6개 변수가 필요하고 -> 객체를 만든담에 -> 그 객체를 배열에 담는다.
				int b_no = rs.getInt(1);	//해당 레코드의 첫번째 필드의 데이터 호출
				String b_title = rs.getString(2);
				String b_cotent = rs.getString(3);
				String b_writer = rs.getString(4);
				String b_password = rs.getString(5);
				int b_view = rs.getInt(6);
				BoardDto board = new BoardDto( b_no , b_title , b_cotent , b_writer , b_password , b_view );  
				boardlist[row] = board;
				row++;	// 인덱스증가
			}
			
		} catch (SQLException e) {
			System.out.println("경고");
			e.printStackTrace();
		}
		
		
		// sql 코드 들어갈 예정 
		return boardlist;
	}
		// 3. 개별 게시물 출력 메소드 
	BoardDto getBoard( int b_no  ) {
		BoardDto board = null;
		// sql 코드 들어갈 예정
		
		
		String getboard( int b_no ) {
			BoardDto board = null;
		// 1. sql 작성	
		String sql = "select * from board where b_no = ?";
		// 2. sql 연결/조작
		try {
			ps.getConnection().prepareCall(sql);
			rs = ps.executeQuery();
			if( rs.next() ) {
				//검색된 레코드의 필드를 객체화
				board = new BoardDto(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6)
						);
			}
		} catch (Exception e) {
			System.out.println("경고");
		}
			return board;
		}
		 
		
		
		return board;
	}
		// 4. 수정 처리 메소드 
	boolean update( int b_no , String b_password , String new_title , String new_content ) {
		// sql 코드 들어갈 예정  
		return false;
	}
		// 5. 삭제 처리 메소드 
	boolean delete( int b_no , String b_password ) {
		// sql 코드 들어갈 예정 
		return false;
	}
	
	
}

