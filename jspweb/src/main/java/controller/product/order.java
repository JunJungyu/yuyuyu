package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dto.OrderDto;

@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public order() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("data");	    // 결제할 제품 리스트 문자열
		String oinfo = request.getParameter("oinfo");	// 받는 사람 정보 문자열
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid"))  ; // 회원번호
	
		System.out.println(data);
		System.out.println(oinfo);		
		// 문자열 JSON형식 --> JSON타입 형변환
		JSONParser parser = new JSONParser();
		
		try {
			// 1. 객체 [ 회원정보 문자열 --> jsonobjest ]
			JSONObject jsonobject = (JSONObject) parser.parse(oinfo);
			
			// 2. 리스트 [ 결제할 제품 리스트 문자열 -> jsonarray ]
			JSONArray jsonarray = (JSONArray) parser.parse( data );			
		
			// 3. 반복문 [ orderDto 객체 -> Dao 처리 ]
				for( int i = 0 ; i < jsonarray.size(); i++ ) {
					JSONObject object = (JSONObject)jsonarray.get(i);
					
					// 받는사람 정보
					String oname = String.valueOf(i)
					
					// 주문상세 정보
					int odamount = Integer.parseInt( String.valueOf(object.get("amount"))) ; 
					int pprice = Integer.parseInt(String.valueOf(object.get("pprice")));
					float pdiscount = Float.parseFloat(String.valueOf (object.get("pdiscount")));
					int pstno =  Integer.parseInt(String.valueOf( object.get("pstno") )) ;
					
					OrderDto dto = new OrderDto(
							0 , oname,
							ophon, oaddress,
							oquest, null, 
							mno, 0 , 
							odamount, odprice,
							0 , pstno);
				}
			
				// 2. 주문상세 DAO
			
		} catch (Exception e) {System.out.println(e+"json 형병환 오류");}

		response.getWriter().print("true"); // 성공했을때 true
	}

}
