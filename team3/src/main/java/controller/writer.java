package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bfile = request.getParameter("bfile");
		
		// 이게 왜 널이지? 애초에 어디서 가져오는거더라..? 아 애초에 요청할 필요가 없나?! 여기서 null값이니까 DB에도 널만 들어가는데..
		System.out.println( btitle + bcontent + bfile );
		
		boolean result = BoardDao.getInstance().writeboard(btitle, bcontent, bfile);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
