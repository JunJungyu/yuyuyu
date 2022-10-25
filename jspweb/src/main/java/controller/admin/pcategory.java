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

import model.dao.ProductDao;
import model.dto.PcategoryDto;

/**
 * Servlet implementation class pcategory
 */
@WebServlet("/admin/pcategory")
public class pcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public pcategory() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 요청X
		// 2. db 처리
		ArrayList<PcategoryDto> list = new ProductDao().getpcategory();
		// 3. 리스트 --> json 변환 [ js ]
		JSONArray array = new JSONArray();
		for( PcategoryDto dto : list ){
			JSONObject object = new JSONObject();
			object.put("pcno", dto.getPcno());
			object.put("pcname", dto.getPcname());
			array.add( object );
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		request.setCharacterEncoding("UTF-8");
		String pcname = request.getParameter("pcname");
		
		// 2. dao 처리
		boolean result = new ProductDao().setpcategory(pcname);	// 싱글톤 객체를 사용하지 않을 경우
		
		// 3. 응답
		response.getWriter().print(result);
	}

}
