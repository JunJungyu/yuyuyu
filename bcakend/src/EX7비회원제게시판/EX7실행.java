package EX7비회원제게시판;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.border.Border;

public class EX7실행 {

	public static void main(String[] args) {
		
		//////////////////////////////////////////한번만 실행됨/////////////////////////////////////////
		// 0. 메모리
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];	//Board 객체 100개를 저장할 수 있는 배열 선언
		///////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////무한///////////////////////////////////////////
		while ( true ) {
			
			// 모든 게시물[ 배열 ] 출력
			System.out.println("-----비회원 게시판-----");
			System.out.println("번호\t\t작성자\t\t제목");
				// 1.
			/*
			for( int index = 0 ; index<boardlist.length; index++ ) {
				System.out.printf("%d\t%s\t%s" , boardlist[index].writer , boardlist[index].title);
			}
			*/
				// 2.
			int num = 0;
			for ( Board temp : boardlist ) { // 배열 내 모든 객체를 하나씩 temp 객체에 반복 대입
				num++;
				if( temp != null ) {
				System.out.printf("%d \t %s \t %s \n " , num , temp.writer , temp.title);
			
				}
			}
			
			System.out.println("1. 글쓰기 2. 글보기 3. 선택: ");
			int ch = scanner.nextInt();
			// 출력 -> 입력( int ) -> 저장 ( int ) -> 제어( if )
			
			//////////////////////////////////////선택1일때/////////////////////////////////////////////
			if( ch == 1 ) {
				// 1. 출력(안내)						-> 입력 -> 저장
				System.out.println("제목 : ");		String title = scanner.nextLine();
				scanner.nextLine(); // next Line쓰면 합쳐지니까 그냥 줄바꾸는 용도로 넣어줌
				
				System.out.println("내용 : ");		String content = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("작성자 : ");		String writer = scanner.next();
				System.out.println("비밀번호 : "); 	String password = scanner.next();
				
				// 2. 저장된 변수 4개를 하나의 객체로 만들기 [ 4개 변수를 묶음 -> 편하게 ]
				//Board regist = new Board();	아깐 이름이 같아서 안됐었음..
				
			Board regist = new Board( title, content, writer, password, 0 );
			// 객체선언 : 클래스명 변수명 = new 생성자 ( 매개변수 순서대로 );
			// 3. 배열에 객체 저장 [ 빈 공간을 찾아서 빈 공간에 저장 ]
			for( int index = 0 ; index<boardlist.length; index++ ) {
				if( boardlist[index] == null ) { // 만일 해당 인덱스에 객체가 없으면
					boardlist[index] = regist;
					System.out.println("글 등록이 되었습니다.");
					break;
				}
			}
			///////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////선택2일때////////////////////////////////////////
			}else if( ch == 2 ) {
				System.out.print("안내) 보고싶은 글 번호를 입력해주세요. ");
				int select = scanner.nextInt();
				Board board = boardlist[select];	// 입력된 번호[인덱스]의 객체 호출
				
				System.out.println("---------"+select+"번 게시물 상세페이지--------");
				System.out.print("작성자 : " + board.writer );
				System.out.println("\t제목 : " + board.title );
				System.out.println("\t내용 : " + board.content );
				System.out.println("------------------------");
				System.out.print("1. 목록보기 2. 삭제 3. 수정 선책 : ");
				int ch2 = scanner.nextInt();
				if( ch2 == 1 ) {}
				else if( ch2 == 2 ) {
					System.out.println("안내) 비밀번호 : ");	String pasaword = scanner.next();
					if( board.password.equals(pasaword) ) {
						// 만일 현재 게시물의 비밀번호와 입력받은 비밀번호가 같으면[ .equals ]
						
							// 한칸씩 당기기 [ 삭제된 인덱스 뒤로 ]
							for( int index = select ; index<boardlist.length; index++ ) {
								// 현재 보고 있는 게시물의 인덱스 부터 마지막 인덱스까지 1씩 증가
								boardlist[index] = boardlist[index+1]; // 객체를 한칸씩 앞으로 당기기
								if( boardlist[index+1] == null ) { break; }	// 다음 객체가 null이면
							}
					}
				}
				else if( ch2 == 3 ) {
					System.out.println("안내) 비밀번호 : ");	String pasaword = scanner.next();
					if( board.password.equals(pasaword) ) {
						
						System.out.println("수정할 제목을 입력해주세요.");	boardlist[select].title = scanner.nextLine();
						scanner.nextLine();
						System.out.println("수정할 내용을 입력해주세요.");	boardlist[select].content = scanner.nextLine();
						scanner.nextLine();
						
						System.out.println("수정되었습니다.");
					}
					else { System.out.println("안내) 패스워드가 다릅니다."); }
				}
				
				else if( ch2 == 4 ){}
			///////////////////////////////////////////////////////////////////////////////////	
				
				///////////////////////////////////////////선택나머지////////////////////////////////////////
			}else {}
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////	
		}//while e
	}//main e
}//class e
/*

	설계 [ 메모리 ]
		1. 제목 2. 내용 3. 작성자 4. 비밀번호
		선택지 : 1. 2차원 배열 2. 클래스->객체->1차원배열
	클래스 설계
		클래스 맴버 : 필드 , 생성자 ,  메소드
		1. 필드 : 메모리 저장
			1. 문자열 제목
			2. 문자열 내용
			3. 문자열 작성자
			4. 정수열 비밀번호
			5. 정수열 조회수
		2. 생성자
			1.빈 [ 매개변수가 없는 ] 생성자
			2. 플 [ 모든 매개변수가 있는 ] 생성자
	
		
*/
