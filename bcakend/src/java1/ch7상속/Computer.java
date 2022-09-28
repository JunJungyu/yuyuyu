package java1.ch7상속;

public class Computer extends Calculator{	// 자식이 부모꺼를 포함하는거지 부모에 자식이 속한게 아니라 부모가 자식꺼를 가져오진 못함
	
	// 부모에 있는거랑 같은 이름으로 못만듬
	// 컨트롤 스페이스바로 부모꺼 안쓰고 이름같게 
	@Override
	double areaCircle(double r) {
		System.out.println("컴퓨터 객체의 원 넓이함수 실행");
		return Math.PI * r * r;						// 더 정밀한 계산이 되는 메소드 사용 / 누구꺼가 실행되는지 구분하기 위해
	}
	
	
}
