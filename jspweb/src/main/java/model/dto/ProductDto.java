package model.dto;

public class ProductDto {
	private int pno	; 		
	private String pname ;
	private String pcoment ;
	private int pprice ;
	private float pdiscount ;
	private byte pactive ;
	private String pimg ;
	private String pdate ;	
	private int pcno ;
	
	public ProductDto() {}

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

	public String getPcoment() {
		return pcoment;
	}

	public void setPcoment(String pcoment) {
		this.pcoment = pcoment;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public float getPdiscount() {
		return pdiscount;
	}

	public void setPdiscount(float pdiscount) {
		this.pdiscount = pdiscount;
	}

	public byte getPactive() {
		return pactive;
	}

	public void setPactive(byte pactive) {
		this.pactive = pactive;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public int getPcno() {
		return pcno;
	}

	public void setPcno(int pcno) {
		this.pcno = pcno;
	}

	public ProductDto(int pno, String pname, String pcoment, int pprice, float pdiscount, byte pactive, String pimg,
			String pdate, int pcno) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pcoment = pcoment;
		this.pprice = pprice;
		this.pdiscount = pdiscount;
		this.pactive = pactive;
		this.pimg = pimg;
		this.pdate = pdate;
		this.pcno = pcno;
	}

	@Override
	public String toString() {
		return "PcategoryDto [pno=" + pno + ", pname=" + pname + ", pcoment=" + pcoment + ", pprice=" + pprice
				+ ", pdiscount=" + pdiscount + ", pactive=" + pactive + ", pimg=" + pimg + ", pdate=" + pdate
				+ ", pcno=" + pcno + "]";
	}
	
	
}
