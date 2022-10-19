package controller.board;

import java.io.Console;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.jmx.LoadBalanceConnectionGroupManager;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;
import model.dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public write() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		//String mid = (String)request.getSession().getAttribute("mid");		// 1. 로그인 세션 [ 로그인한 사람의 아이디 ]가져오기
		//int mno = MemberDao.getInstance().getMno(mid);						// 2. 회원 아이디 --> 회원번호
//																			// fk는 pk에 있는 데이터만 저장가능 [ 무결성 ]
//		String btitle = request.getParameter("btitle");						// 3. 입력받은 데이터1 요청
//		String bcontent = request.getParameter("bcontent");					// 3. 입력받은 데이터2 요청
//		
//		boolean result = BoardDao.getinstance().bwrite(btitle, bcontent, mno, )
//		System.out.println(btitle+" "+bcontent); 							// 값이 잘 넘어왔는지 콘솔로 확인 후 작업하기
//		
//		if( result ) {														// 4. DAO 호출 [ 저장 ]
//			response.sendRedirect("http://localhost:8080/jspweb/board/list.jsp");
//		}else {response.sendRedirect("http://localhost:8080/jspweb/board/write.jsp");}
		
		
		// ↓ 이거 밑에다가 코드 작성하면 다 의미없음 전송해주는 뭐 그런 친구기때문에.. 근데 또 있어도 그만 없어도 그만인듯
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 첨부파일[ cos.jar 라이브러리 필요 ]..
			// 1. cos.jar 필드 추가
			// 2. HttpServletRequest : 첨부파일 지원X 	[ 소량의 문자만 지원 - 첨부파일은 대량의 문자열 ]
			// 3. MultipertRequest 첨부파일 지원O 		[ 대용량의 문자 가능 ]
				// 첨부파일은 http post 메소드만 지원
			// new MultipartRequest( 1. 요청방식 2. 파일저장경로 3. 인코딩타입 4. 기타(보안기능) )
					// 1비트 ( 0 , 1 ) --> 1바이트 ( 01010101 : 8비트 ) -> 1kb ( 1024b ) -> 1mb ( 1024kb ) -> 1G ( 1024MB )
		// 1. 저장경로 [ 프로젝트 저장 ]
		// String uploadpath = "C:\\Users\\504\\git\\yuyuyu\\jspweb\\src\\main\\webapp\\upload\\";
		// 1. 저장경로 [ 배포된 프로젝트의 (서버) 폴더 저장 ]
			// 1. 현재 배포된 프로젝트의 경로 찾기
		// String uploadpath =  request.getSession().getServletContext().getRealPath("/"); // 최상위경로
		String uploadpath =  request.getSession().getServletContext().getRealPath("/upload"); // jspweb/upload
		System.out.println( uploadpath );
		
		
		
		// 2. Multipart 객체 생성
		MultipartRequest multy = new MultipartRequest(
					request , 						// 1. 요청방식
					uploadpath ,					// 2. 저장 경로
					1024 * 1024 * 10 ,				// 3. 10MB
					"UTF-8" ,						// 4. 인코딩
					new DefaultFileRenamePolicy()	// 5. 업로드된 파일의 이름이 중복일 경우 자동이름 변경
				);
		
		// 3. 해당 저장경로에 첨부파일 업로드가 된다.
		// 4. 나머지 데이터를 직접 요청
		String btitle = multy.getParameter("btitle");	// request -> multy
			 System.out.println( btitle );
		String bcontent = multy.getParameter("bcontent");					// <p></p> 가 같이옴★★ 왜..?
			 System.out.println( bcontent );
			// *어떤 파일을 업로드 했는지 DB에 저장할 첨부파일 경로/이름
		String bfile = multy.getFilesystemName("bfile");	// 첨부파일된 이름 호출시 : getFilesystemName
				System.out.println( bfile );								// 제대로 가져옴★★
			// * 회원아이디 --> 회원번호
		int mno = MemberDao.getInstance().getMno( (String)request.getSession().getAttribute("mid"));
	
		if( mno == 0 ){ response.getWriter().print("0"); return; }
		
		// 5. DB처리
		boolean result = BoardDao.getinstance().bwrite(btitle, bcontent, mno , bfile);
		// 6. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print( result );
		
		
	}

}







































