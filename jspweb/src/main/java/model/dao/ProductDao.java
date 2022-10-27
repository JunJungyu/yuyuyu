package model.dao;

import java.util.ArrayList;
import java.util.function.Function;

import controller.admin.pcategory;
import controller.admin.regist;
import model.dto.ProductDto;
import model.dto.PcategoryDto;

public class ProductDao extends Dao{

	// 1. 카테고리 등록 [ c ]
	public boolean setpcategory( String pcname ) {
		String sql = "insert into pcategory(pcname) values(?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , pcname );
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e + "카테고리 등록 메소드 실패");}
		return false;
	}	
	
	// 2. 카테고리 출력 [ r ]
	public ArrayList<PcategoryDto> getpcategory() {
		ArrayList< PcategoryDto > list = new ArrayList<>();
		String sql = "select * from pcategory";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				PcategoryDto dto = new PcategoryDto( rs.getInt(1) , rs.getString(2) );
				list.add(dto);
			}		
		} catch (Exception e) {System.out.println( "카테고리 출력 메소드 오류" + e);}
		return list;
	}	
	
	// 3. 제품 등록 [ c ]
	public boolean setproduct( ProductDto dto ) {
		
		String sql = "insert into product ( pname , pcoment , pprice , pdiscount , pimg , pcno )"
				+ " values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPname());
			ps.setString(2, dto.getPcomment());
			ps.setInt(3, dto.getPprice());
			ps.setFloat(4, dto.getPdiscount());
			ps.setString(5, dto.getPimg());
			ps.setInt(6, dto.getPcno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e + "제품등록 메소드 오류");}
		return false;
	}
	
	// 4. 제품 관리 [ r ]
	public ArrayList<ProductDto> getProductList() {
		ArrayList<ProductDto> list = new ArrayList<>();
		String sql = "select * from product";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while ( rs.next() ) {
				ProductDto dto = new ProductDto(
						rs.getInt(1) , rs.getString(2),
						rs.getString(3) , rs.getInt(4),
						rs.getFloat(5) , rs.getByte(6),
						rs.getString(7) , rs.getString(8),
						rs.getInt(9)
						);
				list.add(dto);
			}
		} catch (Exception e) {System.out.println(e + "제품 관리 메소드 오류");}
		return list;
	}
	
	// 5. 제품 삭제
	public boolean deleteproduct( int pno ){
		String sql = "delete from product where pno ="+pno;
		try {
			ps = con.prepareStatement(sql);
			// 삭제된 레코드 수로 삭제성공 유무 판단 ( 삭제를 안해도 메소드는 성공이니 )
			int count = ps.executeUpdate();
			if( count == 1 ) {	// 해당 번호의 레코드가 0 = 삭제 됨 잉 아닌가?
				return true;
			}
		} catch (Exception e) {System.out.println(e+"제품 삭제 메소드 오류");}
	return false;
	}
	
	// 6. 제품 개별출력 
	public ProductDto getProduct( int pno ) {
		String sql = "select * from product where pno = "+pno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) { // 1개 --> if -> next() 1번실행
				ProductDto dto = new ProductDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), 
						rs.getFloat(5), rs.getByte(6), 
						rs.getString(7), rs.getString(8), rs.getInt(9) );
				return dto;
			}
		}catch (Exception e) {System.out.println(e);} return null;
	}
	
	// 7. 제품 상세정보 수정
	public boolean UpdateProduct( ProductDto dto ) { // 매개변수 하나하나 쓰기 번거로우니까 Dto로 통으로 가져옴
		String sql = "update product set pimg=? ,  pname =? , pcoment =? , pprice =? ,"
				+ " pdiscount =?, pcno =? , pactive=? where pno =?";
		try {
				ps = con.prepareStatement(sql);	
				ps.setString(1, dto.getPimg());		// dto에서 pimg 가져옴
				ps.setString(2, dto.getPname());
				ps.setString(3, dto.getPcomment() );
				ps.setInt(4, dto.getPprice());
				ps.setFloat(5, dto.getPdiscount());
				ps.setInt(6, dto.getPcno() );
				ps.setInt(7, dto.getPactive() );
				ps.setInt(8, dto.getPno() );
				ps.executeUpdate();
				return true;
		} catch (Exception e) {System.out.println(e+"제품 상세정보 수정 메소드 오류");}
	return false;
	}
}
