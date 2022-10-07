package DATABASE.java연동.ch3기본문법;

public class ResultDto {
	
	
	public NineDto() {
		  String mem_name;
	}
	
	
	String mem_id;	
	double value;	// 집계함수 결과를 저장하는 필드 
	
	public ResultDto() {}
	
	public ResultDto(String mem_id, double value) {
		super();
		this.mem_id = mem_id;
		this.value = value;
	}
	// 이건 왜 있는걸까?? 왜 두개만 있지??
	
	
			  String mem_id;
			  String mem_name;
			  int mem_number;
			  String addr;
			  String phone1;
			  String phone2;
			  int height;
			  int debut_date;
			
}