package model.dao;

import model.dto.MemberDto;

public class MemberDao extends Dao {
	
	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() { return mdao; }
	
	public boolean singup( MemberDto dto ) {
		String sql = "insert into member"
				+ " ( mid , mpassword , mnickname )"
				+ "values( ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpassword());
			ps.setString( 3 , dto.getMnickname());
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e + "회원가입 실패");}
		return false;
	}
	
	public boolean idcheck( String id ) {
		String sql = "select * from member where mid ="+id;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeQuery();
			if( rs.next() ) {
				return true;
			}
		} catch (Exception e) {System.out.println(e + "아이디 체크 실패~!");}
		return false;
	}

}
