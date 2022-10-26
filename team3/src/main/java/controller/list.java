package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public list() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ArrayList<BoardDto> list = new ArrayList<>();		// dto를 담는 list를 생성하고?
		JSONArray array = new JSONArray();					// 위에걸 담을 JSONarray를 선언
		for( int i = 0 ; i < 9 ; i++ ) {					// 9개만 할거니까...
			JSONObject object = new JSONObject();			// JSONOnject 에 사진파일 9개를 담아주고
			object.put("bfile", list.get(i).getBfile() );
			array.add( object );							// 제이슨 오브젝트 형식의 사진파일을 어레이에 담고
		}
		
		System.out.println("리스트 서블릿임둥");
		System.out.println( array );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);					// 최종적으론 array를 넘김
															// 그럼 다오는? 다오는 언제 쓰는거지?
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
