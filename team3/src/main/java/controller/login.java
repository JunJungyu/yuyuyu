package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		int result = MemberDao.getInstance().loginid(id, password);
		
		if( result == 0 ) {
			System.out.println("존재하지 않는 아이디");
			response.getWriter().print(result);
		}
		if( result == 1 ) {
			System.out.println("로그인 성공");
			response.getWriter().print(result);
			HttpSession session = request.getSession();
			session.setAttribute( "id" , id );
			
		}
		if( result == 2 ) {
			System.out.println("비밀번호가 틀렸습니다");
			response.getWriter().print(result);
		}
	}

}
