package java1.ch7상속;

// 하위[자식]클래스로 사용할 목적
public class DmbCellPhon extends CellPhone {
	// 1. 필드
	int channel;
	
	
	// 기본적으로 모든 클래스는 기본생성자(깡통) 쓰지 않아도 있는거임
	// super이..
	
	// 2. 생성자
		// [ 기본생성자 : 생성자 1개도 없을 때 자동으로 선언된느 생성자 = 빈생성자 ]
		// 만일 빈생성자가 아닌 다른 생성자를 선언했으면 기본생성자는 자동선언이 안된다.
	
	
//	public DmbCellPhon() {
//		model = "d";				// 이 클래스애는 string model을 선언한 적 없지만 자동완성됨 - 상속 받았기 때문
//		channel = 123;				// 어디서 온 친군지 출처를 알고싶을땐 컨트롤 + 클릭
//		
//	}
	
	DmbCellPhon( String model , String color , int channnel ){
		this.model = model;
		this.color = color;
		this.channel = channnel;
		
	}
	
	// 3. 메소드
	void turnchannel() {System.out.println("채널 : "+channel+"본 DMB 방송수신을 시작합니다.");}
	
	
}
