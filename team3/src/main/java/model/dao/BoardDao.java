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
	public boolean writeboard( String btitle , String bcontent ){
		String sql = "insert into board ( btitle , bcontent ) values( ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , btitle );
			ps.setString( 2 , bcontent );
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
		String sql = "select bcontent from board where bcontent is not null order by bno desc";		// 최신글이면서 bcontent가 비어있지 않은 글만 / 근데 디비 자채를 낫널로 해도 될듯
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {							
				JSONObject object = new JSONObject();
				object.put( "bcontent" , rs.getString(1) );
				array.add(object);
			}
		} catch (Exception e) {System.out.println( e + "글 목록 메소드 오류");}
		return array;
	}
	
	// 메인화면에서 글 미리보기 이미지 누르면 글 상세페이지로 이동하는 메소드 [ 미완 ]
	public ArrayList<BoardDto> detailpost( BoardDto dto ) {							// 이게 맞나~
		JSONArray array = new JSONArray();
		String sql = "select * from board where bno=?";
		try {
			ps = con.prepareStatement(sql);
			if( rs.next() ) {
				JSONObject object = new JSONObject();
						object.put( "btitle" , rs.getString(2) );
						object.put( "bcontent" , rs.getString(3) );
						array.add(object);
			}
		} catch (Exception e) {System.out.println( e + "글 번호 가져오기 메소드 오류");}
		return array;
	}
}
