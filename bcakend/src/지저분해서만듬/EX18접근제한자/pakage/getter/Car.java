package 지저분해서만듬.EX18접근제한자.pakage.getter;

public class Car {
	
	// 1. 필드 [ 필드정보를 보호하기 위해 모든 필드 private 권장 ]
	private int speed;  // privaite : 다른 클래스에서 접근 불가
	private Boolean stop;
	
	// 2. 생성자
	
	// 3. 메소드 [ 필드에 직접 접근이 불가능하니까 필드에 간접접근 메소드 선언 ]
	public int  getSpeed() {return speed;}
		
	public void setSpeed() {
		if( speed < 0 ) {this.speed = 0; return;}
	else { this.speed = speed; }
	}
	
	public boolean isStop() {return stop;}
	
	public void setStop(boolean stop){
		this.stop = stop;	this.speed = 0;
	}
	
	
	
	
	
}
