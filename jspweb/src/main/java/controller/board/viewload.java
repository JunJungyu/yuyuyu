package controller.board;

import java.io.IOException;
import java.sql.DataTruncation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.BoardDao;

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
	




		
		// 1. 요청 [ 클릭한 게시물의 번호 저장 = backeand ]
		int bno = Integer.parseInt(request.getParameter("bno") );
			// 1. 요청 [ 클릭한 게시물의 번호 저장 = backend ]
			// * 세션 : 웹서버에 저장할 수 있는 메모리 공간
				// 브라우저마다 할당 [ 유저마다 메모리 웹서버 할당 ]
				// 서버 종료되거나 시간타이머 종료되었을때		

		// 2. 세션 객체 만들기
		HttpSession session = request.getSession();		// 방문자가 웹 서버에 접속해 있는 상태
		
		// 3. 클릭한 게시물 번호를 세션에 저장
		session.setAttribute("bno", bno);	// setAttribute : 선택한 엘리먼트의 속성값 정하기
			
		// 3. 로그인한 회원아이디
		String mid = (String)session.getAttribute("mid");
		
		// 4. 해당 유저가 24시간내 한번도 클릭한 적이 없으면 [ 세션이 없으면 ]
		if( session.getAttribute(bno+mid) == null ) {
			// 3. DAO 조회수 증가
			BoardDao.getinstance().bviewupdate( bno );
			
			// 3. 현재 유저가 조회수 한 기록 남기기 [ 해당 유저가 조회수 올린적 있다/없다 ]
			request.getSession().setAttribute( bno+mid, true );
			request.getSession().setMaxInactiveInterval(60*60*24); 	// 하루 ( 초단위 )			
			
		}
		

		
		// 3. DAO 조회수 증가
		
		
		request.getSession().setAttribute("bno", bno);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
