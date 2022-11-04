package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dao.ProductDao;
import model.dto.CartDto;

/**
 * Servlet implementation class cart
 */
@WebServlet("/product/cart")
public class cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public cart() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 요청
		
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid")) ;
		System.out.println("카트 두겟 들어옵니다");
		System.out.println("mno : "+mno);
		
		// 2. db처리
		ArrayList<CartDto> list = new ProductDao().getCart(mno);
		
		System.out.println("list : "+list);
		
		JSONArray array = new JSONArray();
		// 형변환
		for( CartDto dto : list ) {		// 향산된 포문으로 리스트에  dto를 하나씩 넣어주고 그걸 오브젝트에 넣어주고 그걸 제이슨어레이에 저장?
			JSONObject object = new JSONObject();
			object.put("cartno", dto.getCartno());
			object.put("pstno", dto.getPstno());
			object.put("pname", dto.getPname());
			object.put("pimg", dto.getPimg());
			object.put("pprice", dto.getPprice());
			object.put("pdiscount", dto.getPdiscount());
			object.put("pcolor", dto.getPcolor());
			object.put("psize", dto.getPsize());
			object.put("amount", dto.getAmount());
			array.add(object);
		}
		
		System.out.println("array : "+array);
		
		// 3. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 요청
		request.setCharacterEncoding("UTF-8"); 		// 항상 넣어두기~
		String data = request.getParameter("data");
		int pno = Integer.parseInt(request.getParameter("pno")) ;
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid")) ;
		
		// 문자열 ---> JSON 형 변환
			// 1. String -> Json	
		try {
			// 1. JSONParser parser객체 생성
			JSONParser parser = new JSONParser();	
			// 2. parser.parse( "문자열" )
			JSONArray array = (JSONArray)parser.parse( data );
			// 3. 반복문
			for( int i = 0; i<array.size() ; i++ ) {
				JSONObject object = (JSONObject) array.get(i); 	// 순서대로 객체 꺼내기
				
				System.out.println(object.get("psize")); 		
				
				// 2. db 처리 // json리스트객체.get(인덱스) => 해당 json객체.get("키") => 값 호출
				String psize = (String)object.get("psize");				// (String) 강제 형변환
				int amount = Integer.parseInt(String.valueOf(object.get("amount")))  ;	// String.valueOf() 
				String pcolor = (String)object.get("pcolor");
				
				System.out.println("setCart 다오 결과입니다");
				System.out.println("psize : "+ psize);
				System.out.println("amount : "+amount);
				System.out.println("pcolor : "+pcolor);
				
				boolean result = new ProductDao().setcart( pno , psize , amount , pcolor , mno );
				
				// 3. 응답 [ 만약에 옵션들 중에 하나라도 실패하면 false 반환 ]
				if( result == false ) { response.getWriter().print(result); return; }
			}
			
		} catch (Exception e) {System.out.println(e+"json으로 변환 실패");}

		response.setCharacterEncoding("UTF-8"); 		// 항상 넣어두기~
		response.getWriter().print("true");
						// 옵션들을 모두 저장했을 경우
	}

}

/*						기본자료형 얘기가 아니라~
 
 			같은 계층 자식끼리는 형변환 안됨 long와 string은 자식인가봄
 	JSON  ↓둘다 부모가 object		강제형변환
 		"문자" : 문자열 String		(String) -> 가능 ( 클래스가 동일하니까 ) 
 		 숫자 : Long				(String) -> 불가능 ( 자식이 부모에게 어쩌고? 여튼 그래서 String.valueOf() 쓰면 됨 )
 		 
 
 */
