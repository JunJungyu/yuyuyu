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
		} catch (Exception e) {System.out.println(e + "회원가입 실패");}
		return 1;
	}
	
	// 똑같은 아이디가 있는지 체크 [ 유효성검사 ]
	public boolean idcheck( String id ) {
		String sql = "select * from member where mid ="+id;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeQuery();
			if( rs.next() ) {												// 레코드가 있으면 안되는거고 없으면 실행되야하는데.. 어떻게 하는거람~
				return false;					
			}
		} catch (Exception e) {System.out.println(e + "아이디 체크 실패~!");}
		return true;
	}
	
	// 똑같은 닉네임이 있는지 체크 [ 유효성검사 ]
	public boolean nncheck( String nickname ) {
		String sql = "select * from member where nickname ="+nickname;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, nickname);
			ps.executeQuery();
			if( rs.next() ) {												// 레코드가 있으면 안되는거고 없으면 실행되야하는데.. 어떻게 하는거람~
				return false;					
			}
		} catch (Exception e) {System.out.println(e + "닉네임 체크 실패~!");}
		return true;
	}
	
	// [ 로그인 ] 회원가입된 아이디가 있는지 체크
	public int loginid( String id , String password ) {
		String sql = "select * from member where mid = ?";									// 디비에 입력받은 아이디가 있으면
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			rs = ps.executeQuery();
			if( rs.next() ) {																// 레코드가 존재하면
				sql = "select * from member where mid = ? and mpassword = ?";			// 그 중에 입력받은 패스워드와 일치하는게 있는지
				ps =con.prepareStatement(sql);
				ps.setString( 1 , rs.getString( 2 ) );										// mid 자리에 rs에 넣어둔 값 두번째를 넣어줌??
				ps.setString( 2 , password );												// sql문 두번째에는 입력받은 패스워드 값 넣어주고
				rs = ps.executeQuery();														// 결과값을..?
				if( rs.next() ) { return 1; }												// 레코드가 존재하면 = 아이디도 비번도 존재하면 1 리턴 
				return 2;																	// 비밀번호가 틀렸으면 2 리턴
			}
		} catch (Exception e) {System.out.println(e + "로그인 아이디 확인 메소드 실패"); return 3;}	// 다오자체가 안되면 3리턴
		return 0;																			// 아이디가 존재하지 않으면 0 리턴		
	}
	
	// 닉네임 입력받아서 아이디 찾기
	public boolean findid( String nname ) {
		String sql = "select * from member where mnickname = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , nname );
			rs = ps.executeQuery();
			// 만일 동일한 정보가 있으면 찾은 레코드의 아이디 반환
			if( rs.next() ) return ); 
		}catch (Exception e) {System.out.println(e);}
		return null;	// 동일한 정보가 없으면 null 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
