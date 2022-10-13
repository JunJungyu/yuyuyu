package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewload
 */
@WebServlet("/board/viewload")
public class viewload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public viewload() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 요청 [ 클릭한 게시물의 번호 저장 = backend ]
		// * 세션 : 웹서버에 저장할 수 있는 메모리 공간
			// 브라우저마다 할당 [ 유저마다 메모리 웹서버 할당 ]
			// 서버 종료되거나 시간타이머 종료되었을때
		int bno = Integer.parseInt(request.getParameter("bno") );
		
		request.getSession().setAttribute("bno", bno);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
