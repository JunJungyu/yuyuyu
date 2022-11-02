package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dao.ProductDao;


@WebServlet("/product/plike")
public class plike extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public plike() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청
		int pno = Integer.parseInt(request.getParameter("pno")) ;
		int mno = MemberDao.getInstance().getMno( (String)request.getSession().getAttribute("mid") ) ;
		
		// 2. db 처리
		int result = new ProductDao().setPlike( pno , mno );
		
		// 3. 응답
		response.getWriter().print(result);	// 1- 찜 취소 2- 찜 등록 3- 오류

	}

}
