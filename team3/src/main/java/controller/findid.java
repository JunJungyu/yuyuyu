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
       

    public findid() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String nname = request.getParameter("nname");
			String result = MemberDao.getInstance().findid( nname );
			
			request.setCharacterEncoding("UTF-8");
			response.getWriter().print(result);
	}
}