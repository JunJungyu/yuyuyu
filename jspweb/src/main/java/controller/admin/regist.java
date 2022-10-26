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
public class regist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public regist() {
        super();

    }

 // 2. 제품 등록 메소드 [ post ]
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		
 		System.out.println("들어오고계시나요1");
 		
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
 				
 		ProductDto dto = new ProductDto( 
 				0 , pname, 
 				pcoment, pprice, 
 				pdiscount, (byte) 0, 
 				pimg, null, pcno);
 		
 		// 싱글톤 안씀
 		boolean result = new ProductDao().setproduct(dto);
 		
 		response.getWriter().print(result);	}

 
    
 // 2. 제품 출력 메소드 [ get ]
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// list->JSON
		ArrayList<ProductDto> list = new ProductDao().getprProductList();
		// js를 위해 list를 json으로 형젼환
		JSONArray array = new JSONArray();
		for( int i = 0; i<list.size(); i++ ) {
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
		
		// list.js에서 가져오기 위해 작성..  여기서 가져오는게 아닌가? 여기는 맞는데 위에 다 있음
		//int pdate =  Integer.parseInt(multi.getParameter("pdate"));
		
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
	}

}	
