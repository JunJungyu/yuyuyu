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

	// getter & setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	// toString
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bpassword=" + bpassword + ", bdate=" + bdate + ", bview=" + bview + "]";
	}
	
}
