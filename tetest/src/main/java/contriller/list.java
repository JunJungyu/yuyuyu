package contriller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.BoareDao.BoardDao;
import model.dao.BoareDao.Dao;
import model.dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/board/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public list() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JSONObject boards = new JSONObject();
		ArrayList<BoardDto> list = BoardDao.getInstance().getlist( );
		// ** arraylist ----> jsonarray 변환 [ js에서 쓰려고 ]
		JSONArray array = new JSONArray();								
		for( int i = 0; i<list.size(); i++ ) {
				JSONObject object = new JSONObject();
				object.put( "bno" , list.get(i).getBno() );
				object.put( "btitle" , list.get(i).getBtitle() );
				object.put( "bcontent" , list.get(i).getBcontent() );
				object.put( "bwriter" , list.get(i).getBwriter() );
				object.put( "bpassword" , list.get(i).getBpassword());
				object.put( "bdate" , list.get(i).getBdate() );
				object.put( "bview" , list.get(i).getBview() );
				array.add(object);
		}
		
		
		System.out.println( array );
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( boards );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
