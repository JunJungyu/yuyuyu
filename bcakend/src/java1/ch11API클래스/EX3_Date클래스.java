package java1.ch11API클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX3_Date클래스 {

	public static void main(String[] args) {
		
		
		// 1. 날짜
		Date now = new Date(); System.out.println( now );
		String strNow1 = now.toString();	System.out.println( strNow1 );
		
		// 2. SimpleDAteFormat()	: 날짜/시간 형식[모양] 문자열 변환
			// 1. SimpleDAteFormat 객체명 = new SimpleDAteFormat( "형식" )
			// 2. 객체명.format( 데이터 )
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format( new Date() );
		System.out.println( strNow2 );
		
		
		
	// 3. Calendar 클래스
	Calendar cal = Calendar.getInstance();		// 운영체제에서 설정되어 있는 시간대날짜와 시간의 정보 호출					
	
	int year = cal.get( Calendar.YEAR );		// 연도 호출		
	System.out.println( year );
	
	// 1월[0] 2월[1] 3월[4] ~~ 12월[11]
	int month = cal.get( Calendar.MONTH );
	System.out.println( month );
	// 객체명.get( 번호 ) : 해당 번호의 정보호출
		// 번호 : Calendar.필드 => Calendar.YEAR -> 1
	
	
	int day = cal.get( Calendar.DAY_OF_MONTH );
	System.out.println( day );
	/*
	int week = cal.get( Calendar.DAY_OF_WEEK );
		// 일[1] 월[2] ~~ 토[7]
	String strrWeek = null;
	switch ( week ) {
	case Calendar.MONDAY : strrWeek = "월"; break;
	case Calendar.TUESDAY : strrWeek = "화"; break;
	case 4 : strrWeek = "수"; break;
	case 5 : strrWeek = "목"; break;
	case 6 : strrWeek = "금"; break;
	case 7 : strrWeek = "토"; break;
	default:
	case Calendar.SATURDAY : strrWeek = "일"; break;
	
	}
	
	System.out.println( strrWeek );
	*/
	int amPm = cal.get( Calendar.AM_PM );
	
	if( amPm == Calendar.AM ) {
		System.out.println("오전");
	}else {System.out.println("오후");}
	
	System.out.println( cal.get( Calendar.HOUR ) );
	
	

		
	// 다른 클래스의 메소드 호출하는 방법
	// 1. static 정적맴버일 경우 : 클래스명.메소드명
	// 2. new 객체 생성 -> 객체명.메소드명
	// 3. 싱글톤 -> 클래스명.get싱글톤.메소드명()
		// 현재 클래스의 메소드 호출 시 : 메소드명()
	
	// 1번 방법
	//new EX4_달력().run();
	
	// 2번 방법
	EX4_달력 ex = new EX4_달력();
	ex.run();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
