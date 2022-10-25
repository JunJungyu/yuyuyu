package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;


@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public signup() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// input값 가져오기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		
		// System.out.println( id );
		// System.out.println( password );
		// System.out.println( nickname );
		
		// string이랑 int 섞여있으니 dto 객체 만들어서 여기에 담기?
		MemberDto dto = new MemberDto(
				0, id, 
				password,
				nickname, nickname);
		
		// Dao 리턴값
		int result = MemberDao.getInstance().singup(dto);
		// System.out.println( result );
		
		if( result == 0 ) {
			System.out.println("성공");
			response.sendRedirect("http://localhost:8080/team3/view/main.jsp");
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

}
