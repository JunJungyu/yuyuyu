package java1.ch5클래스.EX5.EX12;

public class Controller {

	Board[] boardlist = new Board[100]
	
		// 1. 게시물 등록 함수
	static void con_regist ( String title , String content , String writer , String password )
}
	
		// 1. 객체 생성
		Board board = new Board( title, content, writer, password, 0);
		
		// 2. 배열에 빈공간에 배치
		for( int index = 0 ; Index<boardlist.length; index++ ) {
			if( boardlist[index] == null ) {
				boardlist[index] = board;
				
				return true;
			}
		return false;
		
		}
		
		
		// 게시물 수정 함수
		static boolean con_update( int bnum , String password , String title , String content ) {
			if( boardlist[bnum].password.equals ) {
				
			}
		}
		
