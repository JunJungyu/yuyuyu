package model.dto;

public class BoardDto {

	int bno ;
	String btitle ;
    String bcontent ; 
    String bwriter ;
    String bpassword ; 
    String bdate ;
    int bview ;
    
    // 빈 생성자
    public BoardDto() {}

    // 풀 생성자
	public BoardDto(int bno, String btitle, String bcontent, String bwriter, String bpassword, String bdate,
			int bview) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bpassword = bpassword;
		this.bdate = bdate;
		this.bview = bview;
	}
    
    // 
	
}
