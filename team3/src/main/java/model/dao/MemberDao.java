package model.dao;

import model.dto.MemberDto;

public class MemberDao extends Dao {
	
	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() { return mdao; }
	
	// 맴버테이블에 입력한 정보 넣어줌 [ 유효성검사X ]
	public int singup( MemberDto dto ) {
		String sql = "insert into member"
				+ " ( mid , mpassword , mnickname )"
				+ "values( ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql); 
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpassword());
			ps.setString( 3 , dto.getMnickname());
			ps.executeUpdate(); return 0;
		} catch (Exception e) {System.out.println(e + "회원가입 오류");}
		return 1;
	}
	
	// 똑같은 아이디가 있는지 체크 [ 유효성검사 ]
	public boolean idcheck( String id ) {
		String sql = "select * from member where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if( rs.next() ) {												// 레코드가 있으면 안되는거고 없으면 실행되야하는데.. 어떻게 하는거람~
				return false;					
			}
		} catch (Exception e) {System.out.println(e + "아이디 체크 오류~!!");}
		return true;
	}
	
	// 똑같은 닉네임이 있는지 체크 [ 유효성검사 ]
	public boolean nncheck( String nickname ) {
		String sql = "select * from member where nickname = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, nickname);
			rs = ps.executeQuery();
			if( rs.next() ) {												// 레코드가 있으면 안되는거고 없으면 실행되야하는데.. 어떻게 하는거람~
				return false;					
			}
		} catch (Exception e) {System.out.println(e + "닉네임 체크 오류~!");}
		return true;
	}
	
	// [ 로그인 ] 회원가입된 아이디가 있는지 체크 [ 0.아이디와 비밀번호 검사 ]
	public int loginid( String id , String password ) {
		
		// 1. 아이디 검색
		String sql = "select * from member where mid = ?";									// 디비에 입력받은 아이디가 있으면
		try {
			//
			ps = con.prepareStatement(sql); // prepareStatement : SQL 조작  // PreparedStatement ps 
			ps.setString( 1 , id ); //  ps가 ? 에 값 대입 
			rs = ps.executeQuery(); //  ps가 executeQuery() : 실행 시킨다..  실행 결과를 rs 가 조작한다.
			if( rs.next() ) {																// 레코드가 존재하면
				sql = "select * from member where mid = ? and mpassword = ?";			// 그 중에 입력받은 패스워드와 일치하는게 있는지
				ps =con.prepareStatement(sql);
				ps.setString( 1 , rs.getString( 2 ) ); 	 // 첫번째 ?   대입  rs.getString( 2 )		// 이게 뭐여...								// mid 자리에 rs에 넣어둔 값 두번째를 넣어줌??
				ps.setString( 2 , password );				 // 두번째 ?  패스워드 대입 									// sql문 두번째에는 입력받은 패스워드 값 넣어주고
				rs = ps.executeQuery();														// 결과값을..?
				if( rs.next() ) { return 1; }												// 레코드가 존재하면 = 아이디도 비번도 존재하면 1 리턴 
				return 2;																	// 비밀번호가 틀렸으면 2 리턴
			}
		} catch (Exception e) {System.out.println(e + "로그인 아이디 확인 메소드 오류"); return 3;}	// 다오자체가 안되면 3리턴
		return 0;																			// 아이디가 존재하지 않으면 0 리턴		
	}
	
	// 닉네임 입력받아서 아이디 찾기
	public String findid( String nname ) {
		String sql = "select * from member where mnickname = ?";							// sql 조작할 문구를 string에 넣어줌
		try {
			ps = con.prepareStatement(sql);													// sql에 string보내서 실행시킬건데
			ps.setString( 1 , nname );														// 첫번째 물음표에 매개변수( 입력받은 닉네임 ) 넣어줌
			rs = ps.executeQuery();															// 그리고 그 결과값을																			
			if( rs.next() ){																// 만일 동일한 정보가 있으면 찾은 레코드의 아이디 반환
				System.out.println(rs.getString(2));
				 return rs.getString(2); 													// 두번째 열 = mid 를 리턴해줌
			}else {return "존재하지 않는 닉네임ㅠㅠ";}	
		}catch (Exception e) {System.out.println(e + "아이디 찾기 메소드 오류");}
		return "잘안됨";
	}

	// 아이디 , 닉네임 입력받아서 비밀번호 찾기
	public String findps( String id , String nname ) {
		String sql = "select * from member where mid=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
				if( rs.next() ) {															// 입력받은 아이디의 레코드가 존재하면
					sql = "select * from member where mid=? and mnickname=?";
					ps = con.prepareStatement(sql);
					ps.setString( 1 , id );
					ps.setString( 2 , nname );
					rs = ps.executeQuery();
					if( rs.next() ) {
						return rs.getString(3);
					}
				}
		} catch (Exception e) {System.out.println( e + "비밀번호찾기 메소드 오류" );}
		return "그런 닉네임 없대~";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
