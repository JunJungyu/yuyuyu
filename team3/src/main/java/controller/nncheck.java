package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class nncheck
 */
@WebServlet("/nncheck")
public class nncheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public nncheck() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nickname = request.getParameter("nickname");						// 닉네임 체크니까 닉네임만 jsp에서 받아오고
		boolean result = MemberDao.getInstance().idcheck( nickname );			// 매개변수로 입력받은 닉네임 넣어주고 그게 만약 검색되면 result에 다오 리턴값 받아주고
		
		response.getWriter().print(result);										// 다오 결과값을 js로 보내줌
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		doGet(request, response);
	}

}
