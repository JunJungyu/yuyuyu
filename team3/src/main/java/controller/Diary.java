package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.Dao;
import model.dao.DiaryDao;
import model.dto.DiaryDto;

/**
 * Servlet implementation class Diary
 */
@WebServlet("/Diary")
public class Diary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Diary() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String content = request.getParameter("content");
		
		System.out.println(content);
		
		boolean result = DiaryDao.getInstance().dwrite(content);
		
		System.out.println(result);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date = request.getParameter("date");
		System.out.println("date : " + date);
		
		String di_content = DiaryDao.getInstance().getdiary( date );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(di_content);
		
	}

}
