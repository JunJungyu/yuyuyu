package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

@WebServlet("/board/view")
public class view extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		//int bno = Integer.parseInt(request.getParameter("bno"));
		//System.out.println(bno);
		
		// 1. 세션 요정				스트링으로 한번 인트로 한번 형변환...
			// 다형성 : 부모가 자식에게 강제 형변환 가능
		
		int bno = (Integer)request.getSession().getAttribute("bno");
	
		// 2. DAO 처리
		BoardDto dto = 
				BoardDao.getinstance().getboard(bno);
		
		// 3. DTO --> JSON 형변환
		JSONObject object = new JSONObject();
		object.put( "bno" , dto.getBno() );
		object.put( "btitle" , dto.getBtitle() );
		object.put( "bcontent" , dto.getBcontent() );
		object.put( "mid" , dto.getMid() );
		//object.put( "bfile" , dto.getBfile() );
		
		System.out.println("으이2");
		System.out.println( object );
		
		// * 삭제 , 수정 버튼 활성화를 위한 식별변수 선언 [ 본인글 판단 ]
		// 1. 로그인한 세션 정보 호출
		String mid = (String)request.getSession().getAttribute("mid");
		// 이게 널이여서 페이지가 안열리나??
		
		// 2. 로그인한 세션과 현재 게시물의 작성자와 일치하면
		if( mid != null && mid.equals( dto.getMid() ) ) {
			// 로그인했으면서 로그인된 아이디와 현재 게시물의 작성자 아이디가 동일하면
			object.put("btnaction", true );
		}

		// 4. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(object);
	
	}

	private static final long serialVersionUID = 1L;
    public view() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
