package java1.ch7상속.타이어;

public class HankookTire extends Tire {
	
	// 1. 필드
	// 2. 생성자
	
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	// 3. 메소드
		// 1. roll 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;		// 누적 회전수 1씩 증가
		if( accumulatedRotation < maxRotation ) {	// 최대회전수보다 누적회전수가 더 작으면 [ 수명남음 ]
			System.out.println( location + " 현대 Tire 수명 : " 
				+ (maxRotation-accumulatedRotation ) + "회" );
		return true;	// 수명 있을 경우 true
	}else {
		System.out.println("***" + location + " Tire 펑크 *** ");
		return false;	// 수명 없을경우 false [ 펑크일경우 ]
	}
	}
	
	
	
}
