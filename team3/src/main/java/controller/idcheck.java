package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;


@WebServlet("/idcheck")
public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public idcheck() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");						// 아이디 체크니까 아이디만 jsp에서 받아오고
		boolean result = MemberDao.getInstance().idcheck( id );		// 매개변수로 입력받은 id 넣어주고 그게 만약 검색되면 result에 다오 리턴값 받아주고

		response.getWriter().print(result);							// 다오 결과값을 js로 보내줌
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
