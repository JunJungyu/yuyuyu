package model.dto;

public class BoardDto {

	private int bno	;
    private String btitle ;
    private String bcontent ;
    private String bfile ;
    private String bdate ;
    private String bview ;
    private int cno ;
    private int mno;
    private String mid;
    						
    public BoardDto() {}

	public BoardDto(int bno, String btitle, String bcontent, String bfile, String bdate, String bview, int cno, int mno,
			String mid) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.bdate = bdate;
		this.bview = bview;
		this.cno = cno;
		this.mno = mno;
		this.mid = mid;
	}

	public int getBno() {
		return bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public String getBfile() {
		return bfile;
	}

	public String getBdate() {
		return bdate;
	}

	public String getBview() {
		return bview;
	}

	public int getCno() {
		return cno;
	}

	public int getMno() {
		return mno;
	}

	public String getMid() {
		return mid;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bfile=" + bfile
				+ ", bdate=" + bdate + ", bview=" + bview + ", cno=" + cno + ", mno=" + mno + ", mid=" + mid + "]";
	}
    
    
    								
   	

    

    
    
}