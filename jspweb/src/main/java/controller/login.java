package controller;



import java.io.IOException;
import java.sql.ResultSet;

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
@WebServlet("/member/login") // url 정의 : 해당 클래스로 들어올 수 있는 경로 선언 [ 매핑 ]
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ajax ㅇㅕ기로 알아서 옴
		
		// ---------------------ajax---------------------
		
		// 1. 변수 요청 js에 있는걸 java로 가져옴
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. DAO DB메소드 호출						맴버다오에서 만든 메소드		
		int result = MemberDao.getInstance().login(mid, mpassword);	
		// **** 만약에 로그인 성공하면 세션 할당
		if( result == 1 ) {
		HttpSession 세션 = request.getSession();  // 1. 세션 객체 선언
		세션.setAttribute("mid", mid);			 // 2. 세션 생성 [ 세션 메모리 항당 ]
		}
		// 3 . db 메소드 반환
		response.getWriter().print( result );		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid");
		String mps = request.getParameter("mps");
	}

}
