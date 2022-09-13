package EX7비회원제게시판;

public class Board {

	// 클래스 맴버
	// 1. 필드 
	String title ; // 상자크기[자료형] 상자이름[변수명]
	String content; 
	String writer;
	String password;
	int view;
	
	// 2. 생성자
		// 1. 빈 생성자 [ 기본 생성자 ]
	Board() {}
	
		// 2. 플 생성자
	Board( 	String title , String content , 
			String writer , String password , 
			int view ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
		
	}
	
	// 3. 메소드
	
}
