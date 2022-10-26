package model.dao;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dto.BoardDto;

public class BoardDao extends Dao {

	// 싱글톤 선언
	private static BoardDao bdao = new BoardDao();
	public static BoardDao getInstance() { return bdao; }
	
	// 게시물 작성 메소드
	public boolean writeboard( String btitle , String bcontent , String bfile ){
		String sql = "insert into board ( btitle , bcontent , bfile ) values( ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , btitle );
			ps.setString( 2 , bcontent );
			ps.setString( 3 , bfile );							// rs.getString(4) 이게 여기서 되나?
			ps.executeUpdate();
			System.out.println("글 작성 메소드 성공");
			return true;
		} catch (Exception e) {System.out.println( e + "글 목록 메소드 오류");}
		return false;
	}
	
	
	// 메인화면에 이미지 출력할 글목록 메소드								
	public ArrayList<BoardDto> getlistimg(){
		JSONArray array = new JSONArray();
		ArrayList<BoardDto> list = new ArrayList<>();
		String sql = "select bfile from board;";
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeQuery();
			while( rs.next() ) {							// 근데 어떻게 최신글 9개만 가져오지? sql문을 하나 더 쓰거나 다른 메소드를 더 만들어서 제어하나?
				JSONObject object = new JSONObject();
				object.put( "bfile" , rs.getInt(4) );
				array.add(object);
			}
		} catch (Exception e) {System.out.println( e + "글 목록 메소드 오류");}
		return list;
	}
	
}
