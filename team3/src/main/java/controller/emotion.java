package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.DiaryDao;
import model.dto.DiaryDto;
import model.dto.EmotionDto;

/**
 * Servlet implementation class emotion
 */
@WebServlet("/emotion")
public class emotion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public emotion() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<EmotionDto> list = DiaryDao.getInstance().getemotion();
		
		JSONArray array = new JSONArray();
		for( EmotionDto dto : list ) {
			JSONObject object = new JSONObject();
			object.put("emono", dto.getEmo_no());
			object.put("emotion", dto.getEmotion());
			object.put("emoing", dto.getEmo_img());
			array.add(object);
		}
	
		System.out.println("두겟들어옴");
		System.out.println(array);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
