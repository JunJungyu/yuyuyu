package java1.ch7상속;

public class EX2_상속2 {

	public static void main(String[] args) {
		
	
	Student student = 
			new Student("홍길동", "123456-789123", 1 );
	
	System.out.println("이름 : "+student.name);
	System.out.println("주민번호 : "+student.ssn);
	System.out.println("학생번호 : "+student.studentNo);
	
	}
}
