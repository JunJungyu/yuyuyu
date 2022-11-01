package model.dao;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import controller.emotion;
import model.dto.DiaryDto;
import model.dto.EmotionDto;

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
	
	public String getdiary( String date ) {	// 선택한 날짜 일기 가져오기 메소드
		String sql = "select di_content from diary where di_date =?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, date);
				rs = ps.executeQuery();
				if( rs.next() ) {
					String di_content = rs.getString(1);
					return di_content;
				}
			} catch (Exception e) {System.out.println( e +"다이어리 출력 메소드 오류" );}
			return null;
	}
	
	public int getemotionno() {				// 감정 번호 가져오기 메소드
		String sql = "select emo_no from emotion";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) {
				int emo_no = rs.getInt(1);
				return emo_no;
			}
		} catch (Exception e) {System.out.println( e + "감정 번호 가져오기 메소드 오류" );}
		return -1;
	}
	
	public ArrayList<EmotionDto> getemotion() {					// 전체 감정 가져오기 테이블 출력용
		String sql = "select * from emotion";
		JSONArray array = new JSONArray();
		ArrayList<EmotionDto> list = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {						// while인에 왜 한번만 돌지?
				JSONObject object = new JSONObject();
				object.put("emo_no", rs.getInt(1));
				object.put("emotion", rs.getString(2));
				object.put("emo_img", rs.getString(3));
				array.add(object);
			}
		} catch (Exception e) {System.out.println( e + "전체 감정 가져오기 메소드 오류");}
		return array;
	}
}
