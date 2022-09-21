package 키오스크.관리자;

public class ProductDto {
	// 1. 필드 /필드와 테이블과 동일하게
	private int pno;	
	private String pname; 							
	private int pprice;  								
	private String pcommen;						
	private short pamount;							
	private int mno;

	// 생성자
	public ProductDto(int pno, String pname, int pprice, String pcommen, short pamount, int mno) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pcommen = pcommen;
		this.pamount = pamount;
		this.mno = mno;
	}
	
	// 3. 메소드
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public String getPcommen() {
		return pcommen;
	}

	public void setPcommen(String pcommen) {
		this.pcommen = pcommen;
	}

	public short getPamount() {
		return pamount;
	}

	public void setPamount(short pamount) {
		this.pamount = pamount;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}							 
	
	

	
	
}
