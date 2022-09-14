package DATABASE.java연동;
//★★이것도 다 안맞음..★★
import java.sql.*;



public class JDBC실행 {

	public static void main(String[] args) {
		
		// JDBC : 자바와 DB 연동
			// 1. 라이브러리 필요! [ mysql-connector-java-8.0.30.jar ]
				// * jar : 미리 만들어진 클래스들의 집합
			// 2. 해당 프로젝트 라이브러리 추가
				// 1. 해당 프로젝트 오른쪽 클릭
				// 2. build path -> configure build path
				// 3. libraries 탭 선택
				// 4. add External Jar -> 해당 jar 파일 선택
					// 해당 jar 파일의 경로 변경되면 라이브러리 실행 불가능
				// 5. apply
			// 3. 미리 만들어진 JDBC 관련된 클래스를 사용할 수 있다.
				// 1. Connection : 인터페이스
				// 2. DriverManager : 클래스

		// MYSQL 연동 할 때 해당 클래스에서 예외 ( 오류발생 )
		
		
		
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection con = DriverManager.get		// ★★여전히 안되고★★
		    		  
		            "jdbc:mysql://localhost:3306/shop_db2",
		            "root",
		            "1234");
		      System.out.println("db 성공");
		      
		      
		      /*
		      // JDBC에서 SQL조작
		      // 1. 테이블에 데이터 추가
		      		// 1. sql 문법을 " " 감싸고 문자열에 저장
		      	String sql = "insert into mamber values('tess','나훈아','경기 부천시 중동')";
		      	// 2. sql 조작 인터페이스
		      	PreparedStatement ps = con.prepareStatement(sql);
		      	// 3. SQL 실행
		      	ps.executeUpdate();
		      	
		      	
		      	// 아이유
		      	sql = "insert into mamber values('iyou','아이유','인천 남구 주안동')";
		      	ps = con.prepareStatement(sql);
		      	
		      	// 박진영
		      	sql = "insert into mamber values('jyp','박진영','경기 고양시 장항동')";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      
		      
		      
		      	// 박진영 주소 변경
		      	sql = "update member set member_addr = '경기도 안산시 상록구' where member_id = 'jyp' ";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      	// 아이유 레코드 삭제
		      	sql = "delete from member where member_id='iyou'";
		      	ps = con.prepareStatement(sql);
		      	ps.executeUpdate();
		      	
		      	
		      		*/
		      	
		      	// 모든 맴버 호출
		      	String sql = " selsct * from member ";		
		      	PreparedStatement ps = con.prepareStatement(sql);
		      	ResultSet rs = ps.executeQuery();	// 쿼리 [ SQL 테이블 조작된 결과 ]
		      		// 결과가 레코드[행] 여러개 존재하기 때문에
		      		// 여러개니까 반복문 이용한 레코드 하나씩 출력
		      		// null -> 검색레코드1 -> 검색레코드2
		      		// .next() : 다음 레코드 호출 [ 다음 레코드가 있으면 TRUE 다음 레코드가 없으면 FALSE 로 반환 반복문 종료 ]
		      		// getString ( 필드순서번호 ) : 해당 필드의 데이터를 문자열로 가져오기
		      		// 번호면 .getint ( 필드순서번호 ) 써야됨		: 해당 필드의 데이터를 정수형을 가져오기
		      	
		      	while( rs.next() ) {	//	while( 조건 ) : 조건이 true면 반복문 실행
		      		System.out.print("회원아이디 : " + rs.getString(1) + "\t");	// 첫번째 필드의 데이터 가져오기
		      		System.out.print("회원명 : " + rs.getString(2) + "\t");
		      		System.out.print("회원주소 : " + rs.getString(3) + "\n");
		      	}
		      	

		      	
		      	
		      }
		      catch(Exception e){
		      System.out.println("db 실패");
		      }

				
		
		
	}//main e
}//class e
