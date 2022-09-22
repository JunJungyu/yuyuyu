package java1.ch13컬렉션프레임워크;

import java.lang.reflect.Member;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class EX1_ArrayList {

	public static void main(String[] args) {
		
		// 1. 객체 [ 클래스명 변수명 = new 생성자 ]
		// 1. 컬렉션 프레임워크 객체 [ 클래스명< 타입파라미터 > 변수명 = new  클래스명<>(); ]
			// <  > : 제네릭? 클래스안에 클래스를 매개로 넣는 방식
		
		
		// 정수 int 여러개를 저장할 수 있는 리스트 선언
		ArrayList<Integer> intlist = new ArrayList<>();
		
		// 실수 double 여러개를 저장할 수 있는 리스트 선언
		ArrayList<Double> doublelist = new ArrayList<>();
		
		// 내가 만든 자료형(member)을 여러개 저장할 수 있는 리스트 선언
		ArrayList<Member> memberlist = new ArrayList<>();
		
		// String 여러개를 저정할 수 있는 리스크 선언
		ArrayList<String> list = new ArrayList<>();		
		
		list.add("java");/*	"java" : String타입*/System.out.println( "리스트 현황 : " + list.toString() );		
		list.add("jdbc");						System.out.println( "리스트 현황 : " + list.toString() );	
		list.add("servlet.jsp");				System.out.println( "리스트 현황 : " + list.toString() );	
		list.add( 2 , "database" );				System.out.println( "리스트 현황 : " + list.toString() );	
		list.add("ibatis");						System.out.println( "리스트 현황 : " + list.toString() );	
		
		// 2. size
		System.out.println("리스크 내 객체 수 : " + list.size() );
		
		// 3. get()
		System.out.println("특정인덱스 호출 : " + list.get(0));
		
		// 4. remove()
		System.out.println("특정 인덱스 삭제" + list.remove(0));		System.out.println( "리스트 현황 : " + list.toString() );	
		
		// 5. 리스트/배열 과 반복문은 긴밀한 사이
			// 1. 
		for( int i = 0 ; i < list.size(); i++ ) {
			System.out.println("1번 : "+list.get(i));
		}
		
			// 2. 
		for( String s : list ) {			// 리스트에서 스트링을 하나씩 꺼내오겠다?? for( 타입파라미터 ) 향상된 for문.. 자료 : 배열이고 배열에 자료를 하나씩 대입비교하는건가봄 s는 어디서 나온거야?
			System.out.println("2번 : "+ s );
		}
		
		// 7. .contains
		System.out.println(".contains : "+list.contains("jdbc"));		// 해당 객체가 존재하면 true / 아니면 false
		
		// 8. .indexOf
		System.out.println("indexOf : "+list.indexOf("jdbc"));		//	해당 객체의 인덱스위치 반환	
		
		// 9. list.isEmpty()	: 리스트가 객체 하나도 없으면 true/false
		System.out.println("isEmpty : "+list.isEmpty());
		
		// 10. 리스트 내 객체를 순회
		System.out.println(".iterator : "+ list.iterator() );

		// 6. 한번에 다 삭제하기
		list.clear();
		
		
	}
	
	/*
	 
	 문자열 10개 저장한다.
	 1. String[ ] 배열 = new String[10]								[ ] 안에 배열 길이 작성	/ 	순서를 준다?
		1. 선언된 길이는 변경이 안됨. 만약에 변경하면 손실이 생기거나 문제 생김
		2. 추가 삭제 삽입 -> 직접 인덱스를 이용해서 해야됨
		
	 2. ArrayList< String > 배열 = new ArrayList<>();					<  > 여기안에 들어가는게 리스트에 들어갈 타입 = 스트링 / 자동이니까 길이입력X / 객체 안에 객체를 넣는다
	 	1. 길이가 자동 [ 기본값이 10부터 ]
	 	2. 추가 삭제 삽입 -> 함수( 미리 만들어진 코드 사용 ) -> 편리함 / 무겁고 속도가 느리다.
	 
	 */
	
}
