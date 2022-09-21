package DATABASE.java연동.ch3기본문법;

import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	
	// 1. 필드
	Connection con;				// db 연결 인터페이스
	PreparedStatement ps;		// sql 연결/조작 인터페이스
	ResultSet rs;				// sql 결과
	
	// 2. 생성자
	public DAO() {
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/market_db" , 
					"root" , 
					"1234"
					);
		} catch (SQLException e) {System.out.println("오류 : " + e);}
	}

	// 3. 메소드	
	// ---------------------------------------------------------------------------------------------------------

	// 1. 예제1 : 레코드 10줄 -> member Dto 8개 -> 배열/리스트
	
	// 맴버 검색??
	public ArrayList < MemberDto > 예제1결과() {
		// 배열( array ) 대신에 배열을 편하게 사용할 수 있는 만들어진 클래스 [ 컬렉션(수집) 프레임워크 ]
			// 리스트 [선언] : Arraylist < 리스트에 들어갈 클래스 > 리스트명 = new ArrayList<>();
			// 리스트에 객체 담기 : 리스크명.add( 객체명 )
		
		ArrayList < MemberDto > list = new ArrayList<>();	// MemberDto로 생성된 객체 여러개를 담을 수 있는 list 객체
		
		// 1. sql 작성
		String sql = "select * from member";
		// 2. sql 연결조작
		try {
			ps = con.prepareStatement(sql);
			// 3. sql 결과조작
			rs = ps.executeQuery();
			
			while( rs.next() ) {
				MemberDto dto = new MemberDto(
						rs.getString(1), rs.getString(2), 
						rs.getInt(3), 	 rs.getString(4), 
						rs.getString(5), rs.getString(6), 
						rs.getShort(7) , rs.getString(8));
						// 객체 -> 배열/리스트 담기
						list.add(dto);	
			}
			return list;
		} catch ( Exception e ) {System.out.println("예제1 오류 : " + e);}
		return list;
	}
	// ---------------------------------------------------------------------------------------------------------
	// 예제 2 : 레코드 10줄
	// 특정 필드 검색
	ArrayList< String > 예제2결과() {
			// 1. String 객체( 문자열 ) 여러개를 저장할 수 있는 list 객체
			ArrayList< String > list = new ArrayList<>();
			String sql = "select mem_name from member";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) { // rs.next() : 다음 레코드 이동
					list.add( rs.getString( 1 ) ); // rs.get자료형(필드번호)
				}
				
				return list; // 반환
			
			} catch (Exception e) {System.out.println("예제2 오류"  + e);}
			
			return list; // 반환
			
		}
	// ---------------------------------------------------------------------------------------------------------	
	// 예제 3 : 레코드 2줄 : DTO 1개
	// 회원명이 '블랙핑크'인 레코드 검색
		// 메소드 [선언] : 반환타입 함수명 ( 인수 ){ }
	
	MemberDto 예제3결과() {
		// void : 함수 결과가 없다는 뜻
			// sql 작성
			String sql = "select * from member where mem_name ='블랙핑크'";
			
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();	// 결가 1개 반복문 필요없음
				if( rs.next() ) {
					// 레코드의 8개 필드 --> 객체
					MemberDto dto = new MemberDto(
							rs.getString(1), rs.getString(2), 
							rs.getInt(3), 	 rs.getString(4), 
							rs.getString(5), rs.getString(6), 
							rs.getShort(7) , rs.getString(8));
						return dto;
				}
			} catch (Exception e) {System.out.println("예제 3오류" + e );}
			return null;
		}
	
	// ---------------------------------------------------------------------------------------------------------
	// 4. 레코드 3줄 : DTO 3개
	ArrayList< MemberDto > 예제4결과() {
		ArrayList< MemberDto > list = new ArrayList<>();
		
		String sql = "select mem_id , mem_name"
			+ "from member"								// 이건 왜 쪼개는걸까★★ 그냥 보기 편하라고 그런듯?
			+ "where height <= 162";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				MemberDto dto = new MemberDto();	// 빈 객체 선언			//왜 MemberDto 마다 빨간줄일까
						dto.mem_id = rs.getString(1);
						// 검색된 레포트의 첫번째 필드 -> 객체 필드에 대입
						dto.mem_name = rs.getString(2);
						// 검색된 레포트의 두번째 필드 -> 객체 필드에 대입
						list.add(dto); // 객페 --> 리스트 추가
			}//while e
			return list;
		} catch (Exception e) {System.out.println("에제 4오류" + e );}
		return list;
	}
	
	ArrayList< MemberDto > 예제5결과(){
		ArrayList< MemberDto > list = new ArrayList<>();
		String sql = "select mem_name , height , mem_number "
			 +"from member"
			 +"where height >= 165 and mem_number > 6";
		
		try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
							MemberDto dto = new MemberDto();	// 빈 객체 생성
						 	dto.mem_name = rs.getString( 1 );
						    dto.height = rs.getShort( 2 );
						    dto.mem_number = rs.getInt( 3 );
						    list.add(dto);	// 객체 -> 메소드 저장
			}
			return list; // 리스트 반환
		} catch (Exception e) {System.out.println("예제 5오류" + e );}
		return list; // 리스트 반환
	}
	// ---------------------------------------------------------------------------------------------------------
	ArrayList< MemberDto > 예제6결과() {
		ArrayList< MemberDto > list = new ArrayList<>();
		
		String sql = "select mem_name , height , mem_number"
				+ " from member "
				+ "where height >= 165 or mem_number > 6;";
	
		try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while( rs.next() ) {
							MemberDto dto = new MemberDto();
							dto.mem_name = rs.getString(1);
							dto.height = rs.getShort(2);
							dto.mem_number = rs.getInt(3);
							list.add(dto);
			}
			
		}catch (Exception e) {System.out.println("에제 6오류" + e);}
	
	}
	// ---------------------------------------------------------------------------------------------------------
	MemberDto 에제7결과() {
		MemberDto dto = null;
		String sql = "select * from member "
				+ "where mem_name like '우%'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) {
				dto = new MemberDto(
						rs.getString(1), rs.getString(2), 
						rs.getInt(3), 	 rs.getString(4), 
						rs.getString(5), rs.getString(6), 
						rs.getShort(7) , rs.getString(8));
			return dto;			
			}
		} catch (Exception e) {System.out.println("예제 7 오류 : " + e );}
		return dto;
	}
	// ---------------------------------------------------------------------------------------------------------
	ArrayList<MemberDto> 예제8결과() {
		ArrayList<MemberDto> list = new ArrayList<>();
		String sql = "select * from member where mem_name like '__핑크%'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				MemberDto dto = new MemberDto(
						rs.getString(1), rs.getString(2), 
						rs.getInt(3), 	 rs.getString(4), 
						rs.getString(5), rs.getString(6), 
						rs.getShort(7) , rs.getString(8));
				list.add(dto);
			}
		} catch (Exception e) {System.out.println("에제 8오류 : " + e);}
		return list;
	}
	
	
	
	
	
	
	// 14. Buydto [ 일반적으로 table <----> dto ] 생성
	// 14 ~ 19 검색결과 필드 2개 결과dto
	
	
	
}
