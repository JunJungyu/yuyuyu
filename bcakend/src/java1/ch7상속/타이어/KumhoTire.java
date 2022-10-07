package java1.ch7상속.타이어;

public class KumhoTire extends Tire {
	// 상속을 받았는데 빨간 줄 들어온 이유 = 슈퍼클래스와 생성자가 다르기 때문에 / 생성자 만들어주면 됨?
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);}
	
	@Override
	
	
	public boolean roll() {
		++accumulatedRotation;		// 누적 회전수 1씩 증가
		if( accumulatedRotation < maxRotation ) {	// 최대회전수보다 누적회전수가 더 작으면 [ 수명남음 ]
			System.out.println( location + " 금호 Tire 수명 : " 
					+ (maxRotation-accumulatedRotation ) + "회" );
			return true;	// 수명 있을 경우 true
		}else {
			System.out.println("***" + location + " Tire 펑크 *** ");
			return false;	// 수명 없을경우 false [ 펑크일경우 ]
		}}
	
	
	
}
