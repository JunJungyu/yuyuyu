package 키오스크.관리자;

public class MenuDto {

	// 필드
	private int mno;
	private String name;
	
	// 생성자
	public MenuDto() {}
	public MenuDto(int mno, String name) {
		this.mno = mno;
		this.name = name;
	}
	
	// 메소드 각 필드 한개당 getter 이랑 setter 생김
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
