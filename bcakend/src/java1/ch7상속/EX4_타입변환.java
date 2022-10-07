package java1.ch7상속;

import java.util.ArrayList;

// 이 파일 자체가 클래스가 아니라 java기 때문에 가능
class A{}

class B extends A{}				// 	 A
class C extends A{}				// B   C
								// D   E
class D extends B{}
class E extends C{}

public class EX4_타입변환 {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 하위에 있는게 다 들어옴
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		// 슈퍼클래스가 같더라도 상위가 같더라도 D extends B 니까 E는 안됨 대각선 이모 안돼~!
		//B b3 = e;
		
		// 일일이 만들지 말고
		ArrayList<B> listb = new ArrayList<>();
		
		// 슈퍼클래스가 리스트가 되면 자식들도 알아서 그 리스트에 들어갈 수 있음 
		ArrayList<A> lista = new ArrayList<>();
		
		// 근데 또 Object가 더 상위니까 여기도 다 들어올 수 있음
		ArrayList<Object> listo = new ArrayList<>();
		listo.add( b );
		
		
	}

}
