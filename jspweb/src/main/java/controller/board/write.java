package controller.board;

import java.io.Console;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
import model.dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public write() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mid = (String)request.getSession().getAttribute("mid");
		int mno = MemberDao.getInstance().getMno(mid);
			
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		boolean result = BoardDao.getinstance().bwrite(btitle, bcontent,mno);
		System.out.println(btitle+" "+bcontent); // 값이 잘 넘어왔는지 콘솔로 확인 후 작업하기
		
		if( result ) {
			response.sendRedirect("http://localhost:8080/jspweb/board/list.jsp");
		}else {response.sendRedirect("http://localhost:8080/jspweb/board/write.jsp");}
		
		// ↓ 이거 밑에다가 코드 작성하면 다 의미없음 전송해주는 뭐 그런 친구기때문에..
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
