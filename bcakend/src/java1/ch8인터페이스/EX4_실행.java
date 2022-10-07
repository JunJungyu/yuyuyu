package java1.ch8인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

import Team.team;

public class EX4_실행 {
	
	public static void main(String[] args) {
		
		// 1. 인터페이스 변수에 구현객체 대입
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// 2. 인터페이스에 ㅇ벗는 메소드이므로 사용불가
		// vehicle.checkFare();
		
		// 3. 강제형변환 [ 인터페이스 -> 객체 ]
			// 객체/변수명 instanceof 클래스명 
		System.out.println( "관계확인 : " + (vehicle instanceof Bus) ); 					// true 나옴 - 관게있음	구현이 됐다는 뜻?
		System.out.println( "관계확인 : " + (vehicle instanceof Television) ); 			// false 나옴 - 관게있음 구현이 안됐다는 뜻?
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();					// 강제 형변환이 이루어져야 가능
		
		// *** 컬렉션 프레임 워크
		List < String > list ;				// 인터페이스 변수 선언
		
		// 1. 인터페이스 변수에 arraylist 객체 탑재
		list = new ArrayList<>();
		list.add("ㅇㅇㅇ");
		// 2. 인터페이스 변수에 Vector 객체 탑재
		list = new Vector<>();
		list.add("ㅁㅁㅁ");
		// 3. 인터페이스에 링크드리스트 객체 탑재
		list = new LinkedList<>();
			list.add("ㅋㅋㅋ");
			
			System.out.println( list.toString() );
			
			// 안됨 구현해준적 없음
			// list = new HashMap();			해시맵 클래스는 리스트 구현을 안하기 때문에 오류 당연~!
		
	}
	
}
