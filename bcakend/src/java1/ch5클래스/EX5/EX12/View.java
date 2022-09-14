package java1.ch5클래스.EX5.EX12;

import java.security.PublicKey;
import java.util.Scanner;

// print , scanner : 입/출력 작성할 에정

public class View {

	// * 함수 밖에 scanner선언한 이유 : 모든 함수에서 같이 사용하려고
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 1. static 사용 버전
		start();	// 함수 호출
		// 2. static 없는 버전
			// view view - new view();
			// view.start();
		
		}
	
	static void con_delete( int bnum ) {
		
		if(  ) {
			for( int i = 0; i <boardlist.lenfth ; i++  ) {
				boardlist[ bnum ] = boardlist[bnum+1];
				if( boardlist[ bnum + 1 ] == null ) { return true; }
			}			
		}

		
	}
	
	
		// 1. 프로그램 시작하는 화면 구현 함수 [ 매개변수X 반환X 정적메소드 : new 생략가능 ]
		static void start() {
			while(true) {//무한루프
				view_boardlist();	// 무조건 실행 view_boardlist() 함수 호출
				System.out.println("-----비회원 게시판------");
				System.out.println("1. 글쓰기 2. 글보기 선택 : ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {view_regist();}	// 1번 선택하면
				else if( ch == 2 ) {view_board();}	// 2번 선택하면
				else {System.out.println("알 수 없는 번호입니다.");}
			}
		}
		
		// 2. 게시물을 등록하는 화면 구현 함수
		static void view_regist() {
			System.out.println("-----게시물 등록 페이지-----");
			System.out.print("제목 : ");		String title = scanner.nextLine();
			System.out.print("내용 : ");		String content = scanner.nextLine();
			System.out.print("작성자 : ");	String writer = scanner.next();
			System.out.print("비밀번호 : ");	String password = scanner.next();
			
			// 1. 메소드 호출[ 통신 ]
			boolean result = Controller.con_regist(title , content , writer , password);
			
			// 2. 메소드 호출한 결과
			if( result ) {
				System.out.println("안내) 게시물 등록 완료");
			}else {
				System.out.println("안내) 게시물 실패 [ 관리자에게 문의 ]");
			}
			return;
		}
			                          

		
		// 3. 게시물 상세페이지 화면 구현 함수
		static void view_board() {
			System.out.println("게시물번호 선택 : "); int bnum = scanner.nextInt();
			System.out.println("-----게시물 상세 페이지-----");
			
			Board temp = Controller.boardlist[bnum];	// 새로운 객체 = 입력받은 인덱스의 객체
			if( temp == null ) { System.out.println("안내) 없는 번호 입니다."); return; }		// 만약에 해당객체가 null 이면 함수
			System.out.println("제목 : " + temp.title);
			
			System.out.println("작성자 : " + temp.writer);
			System.out.println("내용 : " + temp.content);
			System.out.println("1. 뒤로가기 2. 수정 3. 삭제 선택 : "); 
			int ch = scanner.nextInt();
			if( ch == 1 ) {}
			else if( ch == 2 ) {}
			else if( ch == 3 ) {view_delete( bnum );}
			else {  }
			return;
			
		}
		
		// 4. 게시물 목록 화면 구현 함수
		static void view_boardlist() {
			System.out.println("-----게시물 목록 페이지-----");
			System.out.println("번호\t\t작성자\t\t제목");
			for( int i = 0 ; i < Controller.boardlist; i++ ) {
				Board temp = Controller.boardlist[i];
				if( temp != nill ) {// temp 객체의 목적 : 코드 줄이기
					System.out.print(i+"\t\t");
					System.out.print( temp.writer +"\t\t");
					System.out.print(Controller.boardlist[i].title+"\n");					
				}	
				

			}
		}
		
		// 5. 게시물 삭제 함수
		static void view_delete( int bnum ) {
			System.out.println("안내) 비밀번호 : ");  	String password = scanner.next();
			if( Controller.boardlist[bnum].password.equals( password ) ) {
				Controller.con_delete( bnum );
			}else { System.out.println("안내) 비밀번호가 다릅니다."); }
			
		}
		
		// 6. 게시물 수정 함수
		static void view_update( int bnum ) {
			System.out.println("안내) 비밀번호 : ");  	String password = scanner.next();
			System.out.println("수정할 제목 : ");		String title = scanner.next();
			System.out.println("수정할 내용");			String content = scanner.next();
		}
		
		
		
		
		
		
	
	
}
