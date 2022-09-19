package DATABASE.java연동.ch3기본문법;

public class ResultDto {

	String mem_id;
	double value;	// 결과값을 저장하는?
	
	public ResultDto() {}

	public ResultDto(String mem_id, double value) {
		super();
		this.mem_id = mem_id;
		this.value = value;
	}
}
