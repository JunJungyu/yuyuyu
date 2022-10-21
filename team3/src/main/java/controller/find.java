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
@WebServlet("/find")

public class find extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public find() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String type = request.getParameter("type");
		String id = request.getParameter("id");
		
		System.out.println( type );
		System.out.println( id );
		
		if( type == id ) {
			
			String nname = request.getParameter("nname");
			String result = MemberDao.getInstance().findid( nname );
			response.getWriter().print(result);
		}
		

		
		
	}

}