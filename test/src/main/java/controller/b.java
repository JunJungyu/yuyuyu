package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.BoareDao.ddao;
import model.dto.BoardDto;

@WebServlet("/b")
public class b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		ArrayList<BoardDto> list = 
				ddao.getInstance().gettext();
		JSONArray array = new JSONArray()
		for( BoardDto dto : list ) {
			JSONObject object = new JSONObject();
		
			object.put( "bno" , dto.getBno() );
			object.put( "btitle" , dto.getBtitle() );
			object.put( "bcontent" , dto.getBcontent() );
			object.put( "bwriter" , dto.getBwriter() );
			object.put( "bpassword" , dto.getBpassword());
			object.put( "bdate" , dto.getBdate() );
			object.put( "bview" , dto.getBview() );
			
			array.add(object);
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( array )

    public b() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
