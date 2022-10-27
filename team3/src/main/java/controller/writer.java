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
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("글 작성 서블릿 들어오나요?");
		String uploadpath =  request.getSession().getServletContext().getRealPath("/upload"); 	// 폴더가 없고 썸머노트인데도 이걸 써야하나?
		// 2. Multipart 객체 생성
		MultipartRequest multy = new MultipartRequest(
					request , 						// 1. 요청방식
					uploadpath  ,					// 2. 저장 경로
					1024 * 1024 * 10 ,				// 3. 10MB
					"UTF-8" ,						// 4. 인코딩
					new DefaultFileRenamePolicy()	// 5. 업로드된 파일의 이름이 중복일 경우 자동이름 변경
				);
		
		// 3. 해당 저장경로에 첨부파일 업로드가 된다.
		// 4. 나머지 데이터를 직접 요청
		String btitle = multy.getParameter("btitle");	
			 System.out.println( btitle );
		String bcontent = multy.getParameter("bcontent");					
			 System.out.println( bcontent );
			// *어떤 파일을 업로드 했는지 DB에 저장할 첨부파일 경로/이름
		String bfile = multy.getFilesystemName("bfile");	
				System.out.println( bfile );								
		
		boolean result = BoardDao.getInstance().writeboard(btitle, bcontent, bfile);
		
		System.out.println( "답 : "+result );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

}
