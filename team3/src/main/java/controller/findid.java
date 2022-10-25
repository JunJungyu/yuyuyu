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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			
			String nname = (String)request.getParameter("nname");
			String result = (String)MemberDao.getInstance().findid( nname );
			
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(result);
	}
}