package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.tools.DocumentationTool.Location;

import model.dao.BoareDao.Dao;
import model.dao.BoareDao.ddao;

/**
 * Servlet implementation class w
 */
@WebServlet("/w")
public class w extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public w() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bwriter = request.getParameter("bwriter");
		String bpassword = request.getParameter("bpassword");
		
		boolean result = ddao.getInstance().write( btitle , bcontent , bwriter , bpassword );
		
		if(result) {
			response.getWriter().print(result); 	// print 딱히..? 의미없음~
			System.out.println("글 작성 완료");
		}else {System.out.println("글 작성 실패");}
		
	}

}
