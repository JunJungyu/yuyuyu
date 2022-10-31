package model.dao;

import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dto.DiaryDto;

public class DiaryDao extends Dao{

	private static DiaryDao ddao = new DiaryDao();
	public static DiaryDao getInstance() { return ddao; }
	
	public boolean dwrite( String content ) {
		String sql = "insert into diary ( di_content ) value( ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("다이어리 작성 메소드 오류" + e);}
		return false;
	}
	
	public ArrayList<DiaryDto> getdiary( String date ) {	// 달력 날짜 누르면 그날 일기로 이동 구별위해 배경 이미지만 다르게~? 약간 흐리게?
		String sql = "select di_content from diary where di_date =?";
			JSONArray array = new JSONArray();
			ArrayList<DiaryDto> list = new ArrayList<>();
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if( rs.next() ) {
					JSONObject object = new JSONObject();
					object.put("date", rs.getString(1));
					array.add(object);
				}
			} catch (Exception e) {System.out.println( e +"다이어리 출력 오류 메소드" );}
			return array;
	}
}
