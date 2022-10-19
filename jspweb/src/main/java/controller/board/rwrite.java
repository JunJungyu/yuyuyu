package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
import model.dao.MemberDao;


@WebServlet("/reply/rwrite")
public class rwrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public rwrite() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		request.setCharacterEncoding("UTF-8");
		String rcoment = request.getParameter("rcoment");
		System.out.println(rcoment);
		
			// 왼쪽부터 읽는게 아니라 괄호순서대로 보기
		
		// 2. 세션에서 값 가져오기
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid")) ;
		int bno = (Integer)request.getSession().getAttribute("bno");
				
		// 3. db 처리
		boolean result = BoardDao.getinstance().rwrite( rcoment , mno , bno );
		
		// 4. 결과제어
		if( result ) {
			response.getWriter().print("1");
		}else{								// DB 오류
			response.getWriter().print("2");
		}
		
		doGet(request, response);
	}

}
