package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;

/**
 * Servlet implementation class writer
 */
@WebServlet("/writer")
public class writer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public writer() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //String uploadpath =  request.getSession().getServletContext().getRealPath("/upload"); 
		 //System.out.println( uploadpath );
				
		// 2. Multipart 객체 생성
		//MultipartRequest multy = new MultipartRequest(
		// 			request , 						// 1. 요청방식
		//			uploadpath ,					// 2. 저장 경로
		//			1024 * 1024 * 10 ,				// 3. 10MB
		//			"UTF-8" ,						// 4. 인코딩
		//			new DefaultFileRenamePolicy()	// 5. 업로드된 파일의 이름이 중복일 경우 자동이름 변경
		//		);
		
		//String bfile = multy.getParameter("bfile");	// request -> multy
		// System.out.println( bfile );
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bfile = request.getParameter("bfile");
		
		boolean result = BoardDao.getInstance().writeboard(btitle, bcontent, bfile);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
