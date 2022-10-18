package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class bupdate
 */
@WebServlet("/board/bupdate")
public class bupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 서버 업로드 파일 경로 찾기
		String uploadpath = request.getSession().getServletContext().getRealPath("/upload");
		System.out.println(uploadpath);
		
		// 2. MultipartRequest 객체
		MultipartRequest multy = new MultipartRequest( 
				request, 							// 요청방식
				uploadpath,							// 경로
				1024*1024*10,						// 파일크기
				"UTF-8" ,							// 인코딩
				new DefaultFileRenamePolicy() );	// 파일이름 중복검사
		
		// 3. 요청
		String btitle = multy.getParameter("btitle");			// 수정할 제목
		String bcontent = multy.getParameter("bcontent");		// 수정할 내용
		String bfile = multy.getFilesystemName("bfile");		// 새로운 첨부파일
		
			// 1. 수정시 새로운 첨부파일 등록시 [ 기존 첨부파일 삭제 ]
			
		// * 수정할 게시물의 번호
		int bno = (Integer)request.getSession().getAttribute("bno");
		
		BoardDto dto = BoardDao.getinstance().getboard(bno);	// 수정 되기전 게시물정보 호출
		
		// * 기존첨부파일 변경 여부 판단
		boolean bfilechange = true;
		
		// 2. 수정 시 첨부파일 등록 없을 경우 [ 기존 첨부파일 호출 ] 
		if( bfile == null ) { bfile = dto.getBfile(); }
		
		// 4. dao 처리
		boolean result = BoardDao.getinstance().bupdate( bno , btitle , bcontent , bfile );
				if( bfilechange ) {//업데이트 성공시 기존파일 삭제
					String delerpath = request.getSession().getServletContext().getRealPath("/upload/"+dto.getBfile());
				}
		// 5. 결과반환
		response.getWriter().print(result);
		
		doGet(request, response);
	}

}
