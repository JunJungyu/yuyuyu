package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class findid
 */
@WebServlet("/findid")
public class findid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nname = request.getParameter("nname");
		
		String result = MemberDao.getInstance().findid( nname );
		System.out.println("서블릿 들어오네");
		System.out.println( result );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
		
	}

}
