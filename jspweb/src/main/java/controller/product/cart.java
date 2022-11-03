package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

/**
 * Servlet implementation class cart
 */
@WebServlet("/product/cart")
public class cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public cart() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 요청
		request.setCharacterEncoding("UTF-8"); 		// 항상 넣어두기~
		
		String result = request.getParameter("data");
		
		System.out.println(result);
		
		// 2. db 처리
		
		
		// 3. 응답
		
		response.setCharacterEncoding("UTF-8"); 		// 항상 넣어두기~
		response.getWriter().print(result);
	}

}
