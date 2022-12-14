package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class bdelete
 */
@WebServlet("/board/bdelete")
public class bdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bdelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 삭제할 번호 요청
		int bno = Integer.parseInt(request.getParameter("bno"));
		// 2. DAO 처리
		boolean result = 
				BoardDao.getinstance().delete( bno );
		
		BoardDto dto = BoardDao.getinstance().getboard(bno);		// 게시물 정보 호출
		
		if( result ) {
			File file = new File( request.getSession().getServletContext().getRealPath("/upload/"+dto.getBfile()) );
			if( file.exists() ) {
				file.delete();
				// file 클래스
					//  자바 외부에 존재하는 파일 조작/제어 메소드 제공하는 클래스
					// 1. 객체명.length() : 해당 파일의 바이트 길이
					// 2. 객체명.delete() : 해당 파일의 삭제
					// 3. 객체명.exists() : 해당 파일이 존재하면 true 아니면 false
			}
			file.delete();			//  해당경로에 
		}
		// 3. 결과응답
		response.getWriter().print(result);
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
