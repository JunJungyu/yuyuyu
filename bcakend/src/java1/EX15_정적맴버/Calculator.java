package java1.EX15_정적맴버;

public class Calculator {
	
	//1. 필드
	double p1 = 3.141592;				// 인스턴스 필드 = 객체마다 메모리 할당
	static double pi2 = 3.141592;		// 정적 필드 = 메소드 영역 메모리 할당
	
	// 인스턴스 메소드
	int plus1( int x , int y ) {return x + y ; }

	// 정적 메소드
	static int plus2( int x , int y ) {return x + y ;}
	
	// 인스턴스 메소드
	int minus1( int x , int y ) { return x - y; }
	
	// 정적 메소드 2 
	static int minus2( int x , int y ) { return x - y; }
	
}
