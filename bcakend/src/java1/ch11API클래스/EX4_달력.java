package java1.ch11API클래스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class EX4_달력 {
	
	// 1.필드
	Scanner scanner = new Scanner(System.in);//입력객체
	
	// 2. 생성자
	
	// 3. 메소드
	
	void run() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH ) + 1;				// 1월이 0이니까 더해주는듯
		int day = cal.get( Calendar.DAY_OF_MONTH );
		// 1일의 요일을 알아야 공백을 만듬..? / 현재 날짜를 이용한 1일 날짜 찾기
		cal.set( year, month-1 , 1 ); 		// 현재 월의 1일 날짜
		// 현재 날짜의 마지막 일수 찾기
		int eday = cal.getActualMaximum( Calendar.DAY_OF_MONTH );
		int sweek = cal.get( Calendar.DAY_OF_WEEK );

		/*
		System.out.printf("\n=================%d 년 %d 월 의 달력================= \n" , year , month , day);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	

	
		// 공백
		for( int i = 1; i < sweek ; i++ ) {
			System.out.print("\t");
		}
	
		// 2. 1일부터 마지막일수까지 일수를 출력하는 반복문
		for( int i = 1 ; i <= eday; i++ ) {
			System.out.printf("%2d \t", i );
			// 토요일 이후에 줄바꿈처리
			if( sweek % 7 == 0 ) {
				System.out.println();
			}
			// 일수를 출력할때마다 요일 증가
			sweek++;
		}
		*/
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		while ( true ) {
			System.out.printf("\n=================%d 년 %d 월 의 달력================= \n" , year , month , day);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for( int i = 1; i < sweek ; i++ ) {
				System.out.print("\t");
			}
		
			// 2. 1일부터 마지막일수까지 일수를 출력하는 반복문
			for( int i = 1 ; i <= eday; i++ ) {
				System.out.printf("%2d \t", i );
				// 토요일 이후에 줄바꿈처리
				if( sweek % 7 == 0 ) {
					System.out.println();
				}
				// 일수를 출력할때마다 요일 증가
				sweek++;
			}
			일정출력();
			System.out.println("\r===================================================");
		
		System.out.println("\n◀이전달[1] ▶다음달[2] 검색[3] 일정추가[4] : ");
		int btn = scanner.nextInt();
		if( btn == 1 ) { month --; if( month == 0 ); { month = 12; year--; }
			// 이전달 : 뭘에서 차감 [ 만일 월이 0 이면 월=12 설정 연도 1 차감 ]
			
		}else if( btn == 2 ) { month++; if( month == 13 ) { month = 1; year++; }
			// 다음달 월에서 1 증가
		}else if( btn == 3 ) {
			System.out.println("이동하실 년도를 입력해주세요.");
			int Y = scanner.nextInt();
			if( Y < 1900 || Y > 9999 ) { System.out.println("지원하지 않는 연도입니다."); break;}
			
			System.out.println("입력하신 연도 : "+Y+"년. 이동하실 월을 입력해주세요.");
			int mon = scanner.nextInt();
			if( mon >13 || mon <0 ) {System.out.println("다시 입력해주세요"); break;}else{ month = mon; year = Y;}
		}else if( btn == 4 ) {
			
			
		}else { System.out.println("범위내의 숫자를 입력해주세요."); }
			}
		}
	
		// 일정추가
		void 일정추가() { // 날짜 , 메모 등
			System.out.println("날짜 : "); String cdate = scanner.next();
			System.out.println("메모 : "); String ccoment = scanner.next();
			boolean result = 달력Dao.getInstans().일정추가( cdate , ccoment );			
			if( result ) {System.out.println("일정등록성공");}
			else {System.out.println("일정등록실패");}
			
		}
		
			
		void 일정출력() {
			System.out.println("---------일정확인---------");
			System.out.println("번호\t날짜\t메모");
			
			String strmonth = "";
			if( month < 10 ) {  }
			
			HashMap< Integer , ArrayList<String> > map
			= 달력Dao.getInstans().일정출력( String.valueOf(year) , String.valueOf(month) );								
			
			for( Integer key : map.keySet() ) {
					// keySet() : 모든키호출
				for( String s : map.get(key) ) {
					System.out.println( s  + "\t");
				}
			System.out.println();
			}
			
		}
	
///////////////////////////////////////////////활용////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
