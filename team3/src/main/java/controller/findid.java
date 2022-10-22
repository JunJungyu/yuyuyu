package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class findid
 */
@WebServlet("/findid")

public class findid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public findid() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			
			String nname = (String)request.getParameter("nname");
			String result = (String)MemberDao.getInstance().findid( nname );
			
			System.out.println( "닉네임1 : "+ nname );	// 여기서 제대로 나오다가..? 다시 이게 나오더니 깨져서 나오고 js에서도 깨져서 물음표로 나옴 흑흑 뭔데
			System.out.println("다오 리턴값1 :" + result);
			
			
			response.getWriter().print(result);
	}
}