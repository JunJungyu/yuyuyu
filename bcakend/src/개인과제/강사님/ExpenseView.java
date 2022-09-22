package 개인과제.강사님;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import java1.ch5클래스.EX5.EX12.Controller;
import 개인과제.View;

import java.util.ResourceBundle.Control;

public class ExpenseView {
		
			Scanner scanner = new Scanner(System.in);
			Controller control = new  Controller();		// 메소드 호출하려고 객체 생성

	public static void main(String[] args) {
		View view = new View();	// 메소드 호출하려고 객체 생성
		view.menu();		// 같은 문제..★
	}
			// 0 .메인메뉴
		void menu() {
			while( true ) {
				read();
				System.out.println("1. 추가 2. 삭제 3. 수정 4. 검색 5. 통계");
				int btn = scanner.nextInt();
				if( btn == 1 ) { create(); }
				else if( btn == 2 ) { update(); }
				else if( btn == 3 ) { delete(); }
				
			}
		}
		
		void create() {
			System.out.println("날짜 : "); String edate = scanner.next();
			System.out.println("금액 : "); int emoney = scanner.nextInt();
			System.out.println("내용 : "); String econtent = scanner.next();
			boolean result = control.create( edate , emoney , econtent );		// 같은 문제..★
			if( result ) { System.out.println("등록성공");}
			else { System.out.println("등록실패");}
		}
		
		void read() {
			ArrayList<ExpenseDTO> list = control.read();
			for( ExpenseDTO dto : list ) {
			// for(타입 파라미터 임시변수 : 리스트/배열 ) {}
			System.out.println(dto.getEno()+"\t");
			System.out.println(dto.getEno()+"\t");
			System.out.println(dto.getEno()+"\t");
			System.out.println(dto.getEno()+"\t");
			}
		}
			
		void update() {
			System.out.println("수정할 번호 : ");	int eno = scanner.nextInt();						//식별 용도
			System.out.println("수정할 날짜 : ");	String edate = scanner.next();
			System.out.println("수정할 금액 : ");	int emoney = scanner.nextInt();
			System.out.println("수정할 내용 : ");	String econtent = scanner.nextLine();	scanner.nextLine();
			
			control.update( eno , edate , emoney , econtent );
			
		}
			
		void delete() {
			System.out.println("삭제할 번호 : ");
			int eno = scanner.nextInt();
			boolean result = control.delete( eno );		// 같은 문제..★ 왜지? 컨트롤에 썼는데
			if( result ) {System.out.println("[ 삭제 성공 ]");}
			else {System.out.println("[ 삭제 실패 ] 삭제할 번호가 없습니다.");}
		}

}
