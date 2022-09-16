package java1.ch5클래스.비회원제게시판DB버전;

public class BoardComtrol {
	
	BoardDao boardDao = new BoardDao();	// 현재 클래스에 존재하는 메소드들이 dao 객체의 메소드 호출용
	
	// 1. 
	boolean regist( String b_title , String b_content , String b_writer , String b_password ) {
		
		// 1. 4개의 매개변수 받는다.
		// 2. 변수가 많을 때 이동하면 매개변수 코드가 많으니까 객체화 하자 / 하나씩 안옮기고 한 묶음으로 이동하는거... 
		BoardDto boardDto = new BoardDto( 0 ,  b_title ,  b_content ,  b_writer ,  b_password , 0 );
		// 3. 유효성 검사 [ 추후에 할 예정 ]
		// 4. DB 처리
		boolean result = boardDao.regist(boardDto); // dao.regist 메소드 호출 후 결과값을 result에 저장
		
		// 5. DB 결과 반환
		return result;
		

	}

	// 2. 모든 게시물 출력 메소드
	BoardDto[] getBoardlist( ) {
		// 로직 or DAO 호출 작성 예정
		BoardDto[] boardlist = null;	// 선언
		
		boardDao.getBoardlist();		// 반환
		
		return boardlist;				// 결과
		
	}
	
	// 3. 개별 게시물 출력 메소드
	BoardDto[] getBoard( int b_no ) {
		BoardDto board = null;
		board = boardDao.getBoard(b_no);
		return board;
	}
	
	// 4. 수정 처리 메소드
	boolean update ( int b_no , String b_password ) {
		return false;
	}
	
	// 5. 삭제ㅓ리 메소드
	boolean delete ( int b_no , String b_password ) {
		return false;
	}
	
}
