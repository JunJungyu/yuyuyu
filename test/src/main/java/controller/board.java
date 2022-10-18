package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.BoareDao.ddao;
import model.dto.BoardDto;

/**
 * Servlet implementation class board
 */
@WebServlet("/board")
public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public board() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<BoardDto> list = ddao.getInstance().gettext();
		
		JSONArray array = new JSONArray();
		for( BoardDto dto : list ) {
			JSONObject object = new JSONObject();
			object.put("bbno", dto.getBno());
			object.put("bbtitle", dto.getBtitle());
			object.put("bbcontent", dto.getBcontent());
			object.put("bbwriter", dto.getBwriter());
			object.put("bbpassword", dto.getBpassword());
			object.put("bbdate", dto.getBdate());
			object.put("bbview", dto.getBview());
			array.add(object);
			System.out.println( dto.getBtitle() );
		}
		
		
		
		ArrayList<BoardDto> dd = ddao.getInstance().gettext();
		System.out.println( dd );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( array );
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
