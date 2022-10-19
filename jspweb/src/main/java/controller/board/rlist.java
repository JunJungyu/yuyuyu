package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import model.dao.BoardDao;

/**
 * Servlet implementation class rlist
 */
@WebServlet("/reply/rlist")
public class rlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public rlist() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 요청
		String type = request.getParameter("type");										// type값.. 아마 내가 써둔 reply이런거인듯?
		int bno = (Integer)request.getSession().getAttribute("bno");					// bno는 세션에 저장돼있으니 여기서 가져오고
		JSONArray array = new JSONArray();												// 제이슨어레이 선언해서
		// 2. dao 처리
		if( type.equals("reply") ) {													// 만약 타입이 reply = 댓글이면								
			array = BoardDao.getinstance().getrlist(bno);								// 댓글 출력함수.. 를..? js에는 매개변수가 없는데 여긴 있네..? 여튼 이걸 아까 선언한 제이슨어레이에다가 담음
		}else if( type.equals("rereply") ) {											// 만약 타입이 rereply = 대댓글이면
			int rindex = Integer.parseInt(request.getParameter("rno")); 				// 몇번댓글의 누구 대댓글인지 구분 위해서 (댓글고유번호)rno 받아오고 (rno은 댓글식별번호.. 원댓도 대댓도 그냥 순서대로 1234 붙는다)
			array = BoardDao.getinstance().getrrlist( bno, rindex );					// 대댓글가져오는 함수에 아까 가져온 고유번호랑 글번호 넣어서 위치 찾아줌.. 맞나
		}
		
		// 3. 결과
		response.setCharacterEncoding("UTF-8");											// 여튼 결과 한국어로 나와야하고
		response.getWriter().print(array);												// js $.ajax에서 조작해야하니 값을 넘겨줌 ♥1♥
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
