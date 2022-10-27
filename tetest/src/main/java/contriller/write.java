package contriller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoareDao.Dao;
import model.dao.BoareDao.BoardDao;

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
		
		// 2. Multipart 객체 생성
		MultipartRequesString uploadpath =  request.getSession().getServletContext().getRealPath("/upload"); // jspweb/upload
		System.out.println( uploadpath );
		
		
		
		// 2. Multipart 객체 생성
		MultipartRequest multy = new MultipartRequest(
					request , 						// 1. 요청방식
					uploadpath ,					// 2. 저장 경로
					1024 * 1024 * 10 ,				// 3. 10MB
					"UTF-8" ,						// 4. 인코딩
					new DefaultFileRenamePolicy()	// 5. 업로드된 파일의 이름이 중복일 경우 자동이름 변경
				);
		
		// 3. 해당 저장경로에 첨부파일 업로드가 된다.
		// 4. 나머지 데이터를 직접 요청
		String btitle = multy.getParameter("btitle");	// request -> multy multy = new MultipartRequest(
		String bcontent = multy.getParameter("bcontent");
		String bwriter = multy.getParameter("bwriter");
		String bpassword = multy.getParameter("bpassword");
		
		// 3. 해당 저장경로에 첨부파일 업로드가 된다.
		// 4. 나머지 데이터를 직접 요청
		//String btitle = multy.getParameter("btitle");	// request -> multy
		
		//String btitle = request.getParameter("btitle");
		//String bcontent = request.getParameter("bcontent");
		//String bwriter = request.getParameter("bwriter");
		//String bpassword = request.getParameter("bpassword");
		
		boolean result = BoardDao.getInstance().write( btitle , bcontent , bwriter , bpassword);;
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
