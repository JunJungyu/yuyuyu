package java1.ch5클래스.비회원제게시판DB버전;

import java.util.Scanner;

public class Boardpage {
	// 1. 필드
	// 입력객체 [ 함수 밖에 만든 이유  ?? ]
	Scanner scanner = new Scanner (System.in);	
	BoardComtrol control = new BoardComtrol();
	
	// 2. 생성자
	// 3. 메소드
	
	public static void main(String[] args) {
		// 메소드 호출 방식 : 1. static 2. new
		Boardpage page = new Boardpage();
		page.view();	
	}//main e
	
	// 0. 메인화면
	void view() {
		Boardpage page = new Boardpage(); // 메소드 호출용 객체
		
		while( true ) {//무한루프
			page.getboardlist(); // 모든 게심루 출력 함수 호출
			System.out.println("1. 글쓰기 2. 글제목 선택 : ");	// 안내[출력] -> 입력[scanner]
			int  btn = scanner.nextInt(); // int 변수를 쓰는 이유 ??? 숫자.. 입력받을거니까
			
			// 경우의 수  2개 +1(그 외)
			if ( btn == 1 ) {
				page.regist();
			}else if( btn == 2 ) {
				page.getBoard();
			}else { System.out.println("알 수 없는 번호입니다."); }
		
		}
	}
	
	
	
		// 1. 등록화면
		void regist() {
			System.out.println("===>>> 등록 페이지 ");
			System.out.print(">>제목 : ");		String b_title = scanner.nextLine();
			System.out.print(">>내용 : ");		String b_content = scanner.nextLine();
			System.out.print(">>작성자 : ");		String b_writer = scanner.next();
			System.out.print(">>패스워드 : ");		String b_password = scanner.next();
			scanner.nextLine();
			
		// 2. 입력받은 데이터를 control 이동 [ 다음 클래스의 메소드 호출 ]
		boolean result = control.regist( b_title , b_content , b_writer , b_password );
		// 반환값을 result에 저장한 다음 제어
		// 3. control 처리된 결과를 result에 저장한 다음에 제어 [ control 실행 후 결과의 경우의 수 ]
		if( result ) {
			System.out.println("게시물 등록 완료");
		}else {System.out.println("게시물 등록 실패");}
		
		}// m end
		
		// 2. 모든 개시물 출력화면
		void getboardlist() {
			
			System.out.println("===>>> 게시판");
			System.out.println("번호\t작성자\t제목\t조회수");
			BoardDto[] boardlist = control.getBoardlist();
			
			//for( int i = 0 ; i<boardlist.length; i++ ) {}
			for( BoardDto dto : boardlist ) {
				// for ( 배열의자료형 반복변수명 : 배열 )
				System.out.println( dto.b_no + "\t" );
				System.out.println( dto.b_writer + "\t" );
				System.out.println( dto.b_title + "\t" );
				System.out.println( dto.b_view + "\n" );
			}
		}
		
		// 3. 개별게시물 출력 화면
		void getBoard() {
			System.out.println("게시물 번호 : "); int b_no = scanner.nextInt();
			BoardDto board = control.getBoard(b_no);	// 2. 입력받은 번호를 getBoard 메소드에 전달하면 해당 게시
				if( board == null ) { System.out.println("경고 ) 해당 게시물이 없습니다."); return;}
				
			System.out.println("===>>> 개별조회 페이지");
			System.out.println("제목 : " + board.b_title+"\t");
			System.out.println("작성자 : " + board.b_writer+"\t");
			System.out.println("조회수 : " + board.b_view);
			System.out.println("내용 : " + board.b_content);
			
			
			System.out.println("1. 뒤로가기 2. 수정 3. 삭제 : ");
			int btn = scanner.nextInt();
			Boardpage page = new Boardpage();				//아깐 이게 없고 그냥 부르기만해서 안된듯..? 객체?
			if( btn == 1 ) {
				return;
			}else if( btn == 2 ) {
				page.update();
			}else if( btn == 3 ) {
				page.delete();
			}else {}
			
			
			
		}
		
		// 4. 수정처리 출력 화면
		void update() {
			System.out.println("===>>>수정처리 페이지");
		}
		
		// 5. 삭제처리 출력 화면
		void delete() {
			System.out.println("===>>> 삭제처리 페이지");
		}
		
		
		
		
		
		
	
	
}
