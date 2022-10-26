package controller.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.print.DocFlavor.READER;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;	// 안생겨서 복붙했음..
import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

@WebServlet("/board/list")								// 왜 /board를 추가해주지? 왜 이게 구분이 돼..? 절대경로랑 맞추는건가?
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public list() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		// 검색처리
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		// System.out.println( key );
		// System.out.println( keyword );
		
		// 1.  요청X
			// 1. 페이징 처리에 필요한 변수 요청
		int listsize = Integer.parseInt(request.getParameter("listsize"));
			// System.out.println( listsize );
		// 2. 전체 게시물 수
		int totalsize = BoardDao.getinstance().gettotalsize( key , keyword );
		// 3. 전체 페이지 수 계산
		int totalpage = 0;
		if( totalsize % listsize == 0 ) { // 게시물수랑 페이지수 나눈게 딱 맞으면 3 /15 같은 경우
		 	totalpage = totalsize / listsize;
		}else { totalpage = totalsize / listsize + 1; }	// 나머지가 존재하면 나머지를 표시할 페이지 +1
		
		// 3. 현재 페이지 번호
		int page = Integer.parseInt(request.getParameter("page")) ;
		
		// 3. 페이지별 시작 게시물 행번호
		int startrow = (page-1)* listsize; 
			// 1페이지 -> (1-1)*3 => 0
			// 2페이지 -> (2-1)*3 => 3
			// 3페이지 -> (3-1)*3 => 6
		
		// 3. 화면에 표시할 최대 버튼 수
		int btnsize = 5;							// 버튼 5개씩 [ 몫이 있다 = 현재페이지 커지면 ]
		// 버튼시작번호
		int startbtn = ((page-1) / btnsize) * btnsize + 1;				// 시작버튼
		// 버튼끝번호	
		int endbtn = startbtn + ( btnsize - 1 );							// 끝 버튼
			// 만약에 endbtn이 마지막 페이지보다 크면
		if( endbtn > totalpage ) {
			endbtn = totalpage;
		}
		
		
			//  sb				ed
			// 	1	2	3	4	5		page 1 ~ 5 다 1 나와야됨
			// 	6	7	8	9	10		page 6 ~ 10
			//  11	12	13	14	15		page 11 ~15
		
		// * 페이징 처리에 필요ㅏㄴ 정보들을 담는  jsonobjest
		JSONObject boards = new JSONObject();
		
		// 2. db
		ArrayList<BoardDto> list = BoardDao.getinstance().getlist( startrow , listsize , key , keyword );
			// ** arraylist ----> jsonObject 변환 [ js에서 쓰려고 ]
			JSONArray array = new JSONArray();								// 자동완성이 안된다..!
			for( int i = 0; i<list.size(); i++ ) {
					JSONObject object = new JSONObject();
					object.put( "bno" , list.get(i).getBno() );
					object.put( "btitle" , list.get(i).getBtitle() );
					object.put( "bdate" , list.get(i).getBdate() );
					object.put( "bview" , list.get(i).getBview() );
					object.put( "mid" , list.get(i).getMid() );
					array.add(object);
			}
		// 4. 
		boards.put("totalpage", totalpage );	// 1. 전체 페이지 수
		boards.put("data", array);				// 2. 게시물 리스트
		boards.put("startbtn", startbtn);		// 3. 버튼의 시작번호
		boards.put("endbtn", endbtn);			// 4. 버튼의 끝번호
		boards.put("totalsize", totalsize);		// 5. 게시물 수
			
		// 3. 응답o
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( boards );

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
