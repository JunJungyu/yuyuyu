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
				// 
				 ArrayList < MemberDto > list = dao.예제1결과();										// dao.예제1결과() 만든거를 ArrayList < MemberDto > 에 담아주고?? 왜냐면 타입이 다 다르니까
				 System.out.println("--------------------예제 "+ch+" 결과물--------------------");
				 // 향상된 for문
				 for( MemberDto dto : list ) { // list내 모든 객체를 반복대입								// list 에 MemberDto dto 를 반복대입
					 System.out.println( dto.mem_id 		+ "\t");								// MemberDto dto 는 뭐냐면 Dao에서 만든 레코드들..
					 System.out.println( dto.mem_name 		+ "\t");								
					 System.out.println( dto.mem_number 	+ "\t");
					 System.out.println( dto.addr 			+ "\t");
					 System.out.println( dto.phone1			+ "\t");
					 System.out.println( dto.phone2			+ "\t");
					 System.out.println( dto.height 		+ "\t");
					 System.out.println( dto.debut_date 	+ "\t");
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
						 System.out.println( dto.phone1			+ "\t");
						 System.out.println( dto.phone2 		+ "\t");
						 System.out.println( dto.height 		+ "\t");
						 System.out.println( dto.debut_date 	+ "\t");			   
		   }//if e
		   // -------------------------여기부터 안됨.. 왜?
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
			   ArrayList< MemberDto > list = dao.예제6결과();										// list에 Dao에서 만들어준 함수(?)를 넣어주고
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
			   for( MemberDto dto : list ) {													// MemberDto dto를 list에 하나씩 비교...
				   System.out.println( dto.mem_name  	+ "\t");								// 가져올 값들
				   System.out.println( dto.height    	+ "\t");
				   System.out.println( dto.mem_number   + "\n");
			   }
		   if( ch == 7 ) {
			   MemberDto dto = dao.예제7결과();
			   System.out.println("--------------------예제 "+ch+" 결과물--------------------");
			   	
			   		 System.out.println( dto.mem_id 		+ "\t");
					 System.out.println( dto.mem_name 		+ "\t");
					 System.out.println( dto.mem_number 	+ "\t");
					 System.out.println( dto.addr 			+ "\t");
					 System.out.println( dto.phone1			+ "\t");
					 System.out.println( dto.phone2 		+ "\t");
					 System.out.println( dto.height 		+ "\t");
					 System.out.println( dto.debut_date 	+ "\t");	
			   	
			   }
			   
		   if( ch >= 13 ) {
				  System.out.println("범위 내의 숫자를 입력해주세요.");
			  }
		     
		   }
		}//while e
	}//main e
	
}//class e
