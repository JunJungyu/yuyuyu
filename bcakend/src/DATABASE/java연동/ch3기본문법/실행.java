package DATABASE.java연동.ch3기본문법;

import java.util.ArrayList;
import java.util.Scanner;

public class 실행 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while ( true ) {
			System.out.println("1~12 에제 중 번호 선택  :");
			
			System.out.print("예제 번호 선택 : ");
			int ch = scanner.nextInt();
			
			// 메소드 호출 방법
				// 1. static  선언된 함수 : 클래스명.함수명()
				// 2. 일반함수 : 객체명.함수명()
			
			DAO dao = new DAO();	// dao객체 생성
			
			//1 .
			if( ch == 1 ) {
				 ArrayList < MemberDto > list = dao.예제1결과();
				 System.out.println("--------------------예제 "+ch+" 결과물--------------------");
				 // 향상된 for문
				 for( MemberDto dto : list ) { // list내 모든 객체를 반복대입
					 System.out.println( dto.mem_id 		+ "\t");
					 System.out.println( dto.mem_name 		+ "\t");
					 System.out.println( dto.mem_number 	+ "\t");
					 System.out.println( dto.addr 			+ "\t");
					 System.out.println( dto.phon1			+ "\t");
					 System.out.println( dto.phon2 			+ "\t");
					 System.out.println( dto.height 		+ "\t");
					 System.out.println( dto.debut_data 	+ "\t");
				 }//for e
			}//if e
			
			// 예제 2 : 레코드 10줄
			if( ch == 2 ){
				ArrayList< String > list = dao.예제2결과();
				System.out.println("--------------------예제 "+ch+" 결과물--------------------");
				for( String s : list ) {
					System.out.println( s + "\t");
				}
			}//if e
			
		   if( ch == 3 ) {
			   MemberDto dto = dao.예제3결과();
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
						 System.out.println( dto.mem_id 		+ "\t");
						 System.out.println( dto.mem_name 		+ "\t");
						 System.out.println( dto.mem_number 	+ "\t");
						 System.out.println( dto.addr 			+ "\t");
						 System.out.println( dto.phon1			+ "\t");
						 System.out.println( dto.phon2 			+ "\t");
						 System.out.println( dto.height 		+ "\t");
						 System.out.println( dto.debut_data 	+ "\t");			   
		   }//if e
		   if( ch == 4 ) {
			   ArrayList<MemberDto> list = dao.예제4결과();
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
			   for( MemberDto dto : list ) {
				   System.out.println( dto.mem_id 		+ "\t");
				   System.out.println( dto.mem_name     + "\n");
			   }
		   }
		   if( ch == 5 ) {
			   ArrayList< MemberDto > list = dao.예제5결과();
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
			   for( MemberDto dto : list ) {
				   System.out.println( dto.mem_name			+"\t" );
				   System.out.println( dto.height 			+"\t" );
				   System.out.println( dto.mem_number		+"\n" );
			   }   
		   }
		   if( ch == 6 ) {
			   ArrayList< MemberDto > list = dao.예제6결과();
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
			   for( MemberDto dto : list ) {
				   System.out.println( dto.mem_name  	+ "\t");
				   System.out.println( dto.height    	+ "\t");
				   System.out.println( dto.mem_number   + "\n");
			   }
			   
			   
		   if( ch > 13 ) {
				  System.out.println("범위 내의 숫자를 입력해주세요.");
			  }
			   
		   }
		}//while e
	}//main e
	
}//class e
