package java1.ch13컬렉션프레임워크;

import java.util.HashMap;

import javax.imageio.ImageTranscoder;

public class EX5_HashMap {

	public static void main(String[] args) {
		
		// 1. HaxhMap < Key , Value > 선언	파라미터가 두개니까 두개씩 하나로 저장하는데 그 하나를 entry라고 부름
		HashMap< String , Integer > map = new HashMap<>();
		
		// 2. 저장 entry ( 키 , 값 ) 저장
			// * 키 ( 해시태그 ) :  중복 불가능 	* 값 : 중복 가능
			// 만일 키가 중복이면 기존 entry 제거 후 새로운 entry 추가
		map.put( "신용권" , 85 );		System.out.println( map.toString() );
		map.put( "홍길동" , 90 );		System.out.println( map.toString() );
		map.put( "동장군" , 80 );		System.out.println( map.toString() );
		map.put( "홍길동" , 95 );		System.out.println( map.toString() );			// 키( 홍길동 ) 이 중복됨
		
		// entry 수 체크
		System.out.println("엔트리(키:값)수 :"+map.size());
		
		// 3. 호출 .get(키)
			// 키 통해 값을 호출할 수 있다.
		System.out.println(" .get(키) -> 값 반환 [신용권 키 호출 ] : " + map.get("신용권"));
	
		// 4. 모든 key 호출	 [ .keySet() ]  
		map.keySet();
		
		for( String key : map.keySet() ) {
			System.out.println("키 : " + key);
			System.out.println("값 : " + map.get(key));
		}
	
		// 5. 키 값으로 삭제
		map.remove("홍길동");
		
		// 6. 
		map.clear();
		
		
		
		
		
		
		
		
		
	
	
	}
	
}
