package model.dao.BoareDao;

import java.util.ArrayList;

import model.dto.BoardDto;

public class BoardDao extends Dao{
	
	private static BoardDao dao = new BoardDao();
	public static BoardDao getInstance() { return dao;}

	public boolean write( String btitle , String bcontent , String bwriter , String bpassword) {
		String sql = "insert into board ( btitle , bcontent ,bwriter ,bpassword ) values( ? , ? , ? , ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bwriter);
			ps.setString(4, bpassword);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e); return false;}
	}// 글쓰기 끝
	
	public ArrayList<BoardDto> gettext() {
		ArrayList<BoardDto> list = new ArrayList<>();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while ( rs.next() ) {
				BoardDto dto = new BoardDto(
						rs.getInt(0), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println(e);}
		return list;
	}
	
}
