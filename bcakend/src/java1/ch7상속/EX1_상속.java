package java1.ch7상속;

public class EX1_상속 {

	public static void main(String[] args) {
		
		// 1. 객체생성
		DmbCellPhon dmbCellPhon
			= new DmbCellPhon( "자바폰", "검정", 10);
		
		// 2. 객체가 상속받은 필드 호출
		System.out.println( "모델 : " + dmbCellPhon.model ); 	// 해당 클래스가 상속받은 필드를 호출 가능
		System.out.println( "색상 : " + dmbCellPhon.color );
		
		// 3. 본인 클래스
		System.out.println( "채널 : " + dmbCellPhon.channel );
		
		// 4. 객체[클래스]가 상속받은 메소드 호출
		dmbCellPhon.powerOn();
		dmbCellPhon.bell();
		dmbCellPhon.sendVoice( "여보세요." );
		
		
		// 4. 객체[클래스]가 상속받은 메소드 호출
		dmbCellPhon.powerOn();
		
		
		
		
	}
	
}
