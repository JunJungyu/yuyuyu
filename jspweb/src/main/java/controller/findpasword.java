package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

@WebServlet("/member/findpasword")
public class findpasword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public findpasword() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. ajax 변수 요청
		String mid = request.getParameter("mid");
		String memail = request.getParameter("memail");		
		
		// 2. DB 메소드 호출
		boolean result = MemberDao.getInstance().findpassword( mid, memail );
		String randstr = "";	// 랜덤 문자를 저장할 문자열
		// 3. 제어
		// 아이디와 이메일이 동일할 경우 [true]에만 임시비밀번호 생성

		if(result) {// 문자 난수 15자리 : 랜덤클래스 [임시비밀번호]
			Random random = new Random();	// 1. 랜덤 객체 선언
			for( int i = 0; i<15; i++ ) {
				randstr += (char)(random.nextInt(26)+97);	// 3. 숫자 -> 강제형변환 [ 문자로 변환 ]
									// 영소문자[아스키코드] : 97~122
									// random.nextInt(26); 0 ~ 25
									// random.nextInt(26); + 97 하면 97 ~ 122
									// (char)강제 형변환 : a ~ z
			}
			// 해당 회원의 비밀번호를 임시 비밀번호 교체[업데이트]

			MemberDao.getInstance().passwordchange(mid, randstr);
			
		}
		// 4. 반환 

		response.getWriter().print(randstr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
