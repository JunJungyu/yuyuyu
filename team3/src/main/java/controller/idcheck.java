package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;


@WebServlet("/idcheck")
public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public idcheck() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		boolean result = MemberDao.getInstance().idcheck( id );
		
		response.getWriter().print(result);
		
		if( result ) {
			System.out.println("아이디 체크 완료");
		}else { System.out.println("아이디 체크 실패"); }
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
