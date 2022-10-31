package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.lookup.ProblemBinding;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import controller.member.info;
import model.dao.BoardDao;
import model.dao.ProductDao;
import model.dto.BoardDto;
import model.dto.ProductDto;
import model.dto.StockDto;

@WebServlet("/admin/stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public stock() {
        super();
       
    }
    
    // [가져오기] - 재고 출력
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청 [ 제품별 모든 재고 환인 -> 제품번호 요청 ]
		int pno = Integer.parseInt(request.getParameter("pno"));
		// 2. db처리
		ArrayList<StockDto> list = new ProductDao().getstock(pno);
		// 3. 형변환 [ list -> jsonarray ]
		JSONArray array = new JSONArray();
		for( StockDto dto : list ) {
			JSONObject object = new JSONObject();
			object.put("psno", dto.getPsno());
			object.put("psize", dto.getPsize());
			object.put("pstno", dto.getPstno());
			object.put("pcolor", dto.getPcolor());
			object.put("pstock", dto.getPstock());
			array.add(object);
		}
		// 4. 반환
		System.out.println("겟 들어옴");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	// [저장] - 재고등록
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		request.setCharacterEncoding("UTF-8");
		String psize = request.getParameter("psize");
		int pno = Integer.parseInt(request.getParameter("pno"));
		String pcolor = request.getParameter("pcolor");
		int pstock = Integer.parseInt(request.getParameter("pstock"));
		
		// 2. db 처리
		boolean result = new ProductDao().setstock( psize , pno , pcolor , pstock );
		
		// 3. 결과
		response.getWriter().print(result);
		
		
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			super.doDelete(req, resp);
	}
	
	
}
