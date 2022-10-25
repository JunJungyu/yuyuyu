package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public regist() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("서블릿 들어옵니다");
		/* 첨부파일이 있을 경우 [ 업로드용 ] */
		MultipartRequest multi = new MultipartRequest(
				request,
				request.getSession().getServletContext().getRealPath("/admin/pimg") ,
				1024*1024*10 ,
				"UTF-8" , 
				new DefaultFileRenamePolicy() );
		String pname = multi.getParameter("pname");				
		String pcoment = multi.getParameter("pcomment");
		String pdiscount = multi.getParameter("pdiscount");
		String pimg = multi.getParameter("pimg");
		
		System.out.println( pname + pcoment + pdiscount + pimg );
	}

}
