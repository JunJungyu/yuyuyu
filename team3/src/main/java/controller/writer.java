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
		

		// 3. 해당 저장경로에 첨부파일 업로드가 된다.
		// 4. 나머지 데이터를 직접 요청
		String btitle = request.getParameter("btitle");	
			 System.out.println( btitle );
		String bcontent = request.getParameter("bcontent");					
			 System.out.println( bcontent );
			// *어떤 파일을 업로드 했는지 DB에 저장할 첨부파일 경로/이름
	
											
		
		boolean result = BoardDao.getInstance().writeboard(btitle, bcontent);
		
		System.out.println( "답 : "+result );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

}
