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

 // 2. 제품 출력 메소드 [ get ]
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// list->JSON
		ArrayList<ProductDto> list = new ProductDao().getprProductList();
		System.out.println("서블릿 들어옵니다");
		// js를 위해 list를 json으로 형젼환
		JSONArray array = new JSONArray();
		for( int i = 0; i<list.size(); i++ ) {
			JSONObject object = new JSONObject();
			object.put("pno" , list.get(i).getPcno());
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
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
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
		
		System.out.println("왜 안들어오지?");
		
		String pname = multi.getParameter("pname");				
		String pcoment = multi.getParameter("pcomment");
		int pprice = Integer.parseInt(multi.getParameter("pprice")); 
		float pdiscount = Float.parseFloat( multi.getParameter("pdiscount") );
		String pimg = multi.getFilesystemName("pimg");
		int pcno = Integer.parseInt(multi.getParameter("pcno"));
		
		System.out.println( pname );
		System.out.println( pcoment );	
		System.out.println( pprice );
		System.out.println( pdiscount );
		System.out.println( pimg );
		System.out.println( pcno );
		
		ProductDto dto = new ProductDto( 
				0 , pname, 
				pcoment, pprice, 
				pdiscount, (byte) 0, 
				pimg, null, pcno);
		
		System.out.println("투스트링 출력합니다");
		System.out.println( dto.toString() );
		
		// 싱글톤 안씀
		boolean result = new ProductDao().setproduct(dto);
		
		System.out.println("리절트 출력합니다");
		System.out.println( result );
		
		response.getWriter().print(result);	}

}
