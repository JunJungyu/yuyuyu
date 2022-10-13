package controller.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;	// 안생겨서 복붙했음..
import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

@WebServlet("/board/list")								// 왜 /board를 추가해주지? 구분이 돼..?
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public list() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1.  요청X
		// 2. db
		ArrayList<BoardDto> list = BoardDao.getinstance().getlist();
	
			// ** arraylist ----> jsonarray 변환 [ js에서 쓰려고 ]
			JSONArray array = new JSONArray();								// 자동완성이 안된다..!
			for( int i = 0; i<list.size(); i++ ) {
					JSONObject object = new JSONObject();
					object.put( "bno" , list.get(i).getBno() );
					object.put( "btitle" , list.get(i).getBtitle() );
					object.put( "bcontent" , list.get(i).getBcontent() );
					object.put( "bview" , list.get(i).getBview() );
					object.put( "mid" , list.get(i).getMid() );
					object.put( "mno" , list.get(i).getMno() );
					array.add(object);
			}
		// 3. 응답o
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( array );

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
