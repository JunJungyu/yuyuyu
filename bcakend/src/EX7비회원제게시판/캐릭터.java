package EX7비회원제게시판;

public class 캐릭터 {
	
	int 체력 = 1000;
	int 레벨 = 1;
	int 경험치 = 0; // 10 이면 레벨업
	
	void 공격() {
		this.경험치++;
		if( 경험치 >=10 ) { 레벨++; 경험치=0; }
	}
	void 상태() {
		System.out.println("체력 : " + 체력 );
		System.out.println("레벨 : " + 레벨 );
		System.out.println("경험치 : " + 경험치 );
		
	}
}
