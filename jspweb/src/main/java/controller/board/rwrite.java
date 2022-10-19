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
		
		// 1. 요청 [ 공통 ]
		request.setCharacterEncoding("UTF-8");
		// 타입 요청 [ 0:댓글 1:대댓글[답글] ]
		String type = request.getParameter("type");
		String rcontent = request.getParameter("rcontent");
		// 왼쪽부터 읽는게 아니라 괄호순서대로 보기
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid")) ;
		
		// 비로그인일 경우 반환
		if( mno == 0 ){ response.getWriter().print("0"); return; }		
		int bno = (Integer)request.getSession().getAttribute("bno");
		boolean result = false;
		
		// 2. db 처리
		if( type.equals("reply") ) {		// 댓글일 경우
			result = BoardDao.getinstance().rwrite( rcontent , mno , bno );
		}else if( type.equals("rereply") ){ 	// 대댓글일 경우
			int rindex = Integer.parseInt( request.getParameter("rno") );
			result = BoardDao.getinstance().rrwrite(rcontent, mno, bno, rindex);
		}

		// 3. 결과 반환
		if( result ) { response.getWriter().print("1"); }	// 성공
		else { response.getWriter().print("2"); }			// db오류
	}
	
}
