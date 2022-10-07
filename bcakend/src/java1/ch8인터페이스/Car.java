package java1.ch8인터페이스;

public class Car {
	Tire frontleftTire = new HankookTire();				// 원래는 한국타이어였는데
	Tire frontrightTire = new HankookTire();
	Tire backleftTire = new HankookTire();
	Tire backrigntTire = new HankookTire();
	void run() {
		frontleftTire.roll(); 	frontrightTire.roll();
		backleftTire.roll(); 	backrigntTire.roll();
	}

}
