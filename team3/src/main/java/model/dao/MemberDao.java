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
	
	
}
