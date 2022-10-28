package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.ProductDao;
import model.dto.ProductDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet { // HttpServlet 서블릿 클래스 [ http 구현 ]
	private static final long serialVersionUID = 1L;
       

    public regist() {
        super();

    }

 // 2. 제품 등록 메소드 [ post ] - post는 보통 등록할때 사용함 ---------------------------------------------
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		/* 첨부파일이 있을 경우 [ 업로드용 ] */
 		MultipartRequest multi = new MultipartRequest(
 				request,
 				request.getSession().getServletContext().getRealPath("/admin/pimg") ,
 				1024*1024*10 ,
 				"UTF-8" , 
 				new DefaultFileRenamePolicy() );
 		
 		String pname = multi.getParameter("pname");				
 		String pcoment = multi.getParameter("pcomment");
 		int pprice = Integer.parseInt(multi.getParameter("pprice")); 
 		float pdiscount = Float.parseFloat( multi.getParameter("pdiscount") );
 		String pimg = multi.getFilesystemName("pimg");
 		int pcno = Integer.parseInt(multi.getParameter("pcno"));
 		
 		// 이게 생성자인데.. 다 담아야됨?? 아 위에서 변수에 저장한 값을 dto에 담아야한다		
 		ProductDto dto = new ProductDto( 
 				0 , pname, 					// default면 null auto면 0인가?
 				pcoment, pprice, 
 				pdiscount, (byte) 0, 
 				pimg, null, pcno );
 		
 		// 싱글톤 안씀 - getinstance 안쓰나봄?
 		boolean result = new ProductDao().setproduct(dto);
 		response.getWriter().print(result);		
 	}
 	
 // 2. 제품 출력 메소드 [ get ] 출력은 겟 ---------------------------------------------
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 공통 변수
		String type = request.getParameter("type");
		response.setCharacterEncoding("UTF-8");
		
		if( type.equals("1") ){	// 모든 제품 출력
			// 1. 전체출력 이면서 2. 판매중 출력
			String option = request.getParameter("option");
			
			// list->JSON
			ArrayList<ProductDto> list = new ProductDao().getProductList( option );	// DAO처리
			// js를 위해 list를 json으로 형젼환
			JSONArray array = new JSONArray();
			for( int i = 0; i< list.size(); i++ ) {
				JSONObject object = new JSONObject();
				object.put("pno" , list.get(i).getPno());
				object.put("pname" , list.get(i).getPname());
				object.put("pcoment" , list.get(i).getPcomment());
				object.put("pprice" , list.get(i).getPprice());
				object.put("pdiscount" , list.get(i).getPdiscount());
				object.put("pactive" , list.get(i).getPactive());
				object.put("pimg" , list.get(i).getPimg());
				object.put("pdate" , list.get(i).getPdate());
				object.put("pcno" , list.get(i).getPcno());
				array.add( object );
			}
			// ↑js에서 꺼내올 수 있는 값이 됨 jason.pno이런 식으로 접근			
		
			response.getWriter().print(array);
			
		}else if( type.equals("2") ) {
			
			// 1. 호출할 제품번호 요청
			int pno = Integer.parseInt(request.getParameter("pno"));
			
			// 2. db처리
			ProductDto dto = new ProductDao().getProduct( pno );
			
			// 3. dto -> json 형변환 [ 로직 ]
			JSONObject object = new JSONObject();
			object.put("pno" , dto.getPno());
			object.put("pname" , dto.getPname());
			object.put("pcoment" , dto.getPcomment());
			object.put("pprice" , dto.getPprice());
			object.put("pdiscount" , dto.getPdiscount());
			object.put("pactive" , dto.getPactive());
			object.put("pimg" , dto.getPimg());
			object.put("pdate" , dto.getPdate());
			object.put("pcno" , dto.getPcno());
			
			// 4. 응답
			response.getWriter().print(object);
		}
	}

	
	// 3. 제품 수정 메소드 [ put ] --------------------------------------------------------
	// 자동완성하면 됨
	@Override
		protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("들어오니?");
		
		
		/* 첨부파일이 있을 경우 [ 업로드용 ] */
 		MultipartRequest multi = new MultipartRequest(
 				request,
 				request.getSession().getServletContext().getRealPath("/admin/pimg") ,
 				1024*1024*10 ,
 				"UTF-8" , 
 				new DefaultFileRenamePolicy() );
		
 			int pno = Integer.parseInt(multi.getParameter("pno"));
			String pimg = multi.getFilesystemName("pimg"); // 파일명 호출시 .getFilesystemName
			String pname = multi.getParameter("pname");
			String pcoment = multi.getParameter("pcomment");
			float pdiscount = Float.parseFloat(multi.getParameter("pdiscount"));
			int pcno = Integer.parseInt(multi.getParameter("pcno")) ;
			int pprice = Integer.parseInt(multi.getParameter("pprice")); 
			byte pactive = Byte.parseByte(multi.getParameter("pactive"));
			
			// Dto 형태의 변수 dto에 하나하나 담아주고 
	 		ProductDto dto = new ProductDto(pno, pname, pcoment, pprice, pdiscount, pactive , pimg, null , pcno);
	 		
	 		// Dao에서 하나하나 안쓰고 dto변수로 퉁 넣어둠
			boolean result = new ProductDao().UpdateProduct( dto );
					
 			//System.out.println("다오 리턴값 : " + result);
 			
 			response.getWriter().print(result);
 		
		}
	
	
	// 4. 재품 삭제 메소드 [ delete ] -------------------------------------------------------
		
	@Override
		protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		int pno = Integer.parseInt(request.getParameter("pno"));
		
		// 2. dao
		boolean result = new ProductDao().deleteproduct( pno );
		
		// 3. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
		}
}	
