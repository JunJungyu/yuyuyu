package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import model.dao.BoardDao;

/**
 * Servlet implementation class api2
 */
@WebServlet("/api2")
public class api2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public api2() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONArray array = BoardDao.getinstance().getapi();
		
		System.out.println(array);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
