package java1.a변수;

public class EX_3문자열 {//class s
	public static void main(String[] args) {//main s
		
	// p. 64 String 타입 [ String 클래스 ]
		//char 문자 = "자바";	//오류발생 : char 문자 한개만 저장할 수 있다.
		String 문자열 = "자바";
		
	// p. 65
		String name = "홍길동"; System.out.println(name);
		String job = "프로그래머"; System.out.println(job);
		
	// p. 66
		System.out.println("안녕하세요");	//println 출력 후 줄바꿈처리O
		System.out.print("자바입니다");		//print 출력 후 줄바꿈처리X
		
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		System.out.println("\\     /\\    야옹");
		System.out.println(" )  (  ')   ˚");
		System.out.println(" (  /   )  ˚");
		System.out.println("  \\(___)|\n");
		
		System.out.println("멍멍     |\\_/|\t멍멍");
		System.out.println(" \t|p q|   /}");
		System.out.println("   멍멍! ( 0 )\"\"\"\"\\  멍  멍멍");
		System.out.println(" \t|\"^\"`    |");
		System.out.println(" \t||__/=\\\\_|\t멍\n");
		
		
		//예3
		System.out.println("\t\t[[ 출석부 ]]\n");
		System.out.println("------------------------------");
		System.out.println("\n이름\t1교시\t2교시\t3교시");
		System.out.println("\n유재석\t출석\t결석\t출석");
		System.out.println("\n강호동\t출석\t결석\t출석");
		System.out.println("------------------------------");
	
	}//main e
	
}//class e

/*

 	문자[한글자]			:	char	: '자'
 	문자열[ 두글자 이상 ]		: String	: "자바 입니다"
 
	 -console화면에 출력하는 출력 함수
	 	print()			: 출력
	 	printIn()		: 출력하고 줄바꿈 처리[\n] 포함
	 	printf()		: 형식문자 출력
 	
 	-제어[이스케이프]문자
 		1. \n : 줄바꿈
 		2. \t : 들여쓰기(tab 5칸)
 		3. \" : 큰따옴표 출력
 		4. \특수문자 : 특수문자 출력
 			"홍길동" ----> 홍길동
 			"\"홍길동\"" ----> "홍길동"
 	
 */