package 개인과제.강사님;

public class ExpenseDTO {
	
	private int eno ;
	private String edate;
	private int emoney;
	private String ecomanet;
	
	// 생성자
	public ExpenseDTO(int eno, String edate, int emoney, String ecomanet) {
		this.eno = eno;
		this.edate = edate;
		this.emoney = emoney;
		this.ecomanet = ecomanet;
	}
	     
	// getter setter
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public int getEmoney() {
		return emoney;
	}
	public void setEmoney(int emoney) {
		this.emoney = emoney;
	}
	public String getEcomanet() {
		return ecomanet;
	}
	public void setEcomanet(String ecomanet) {
		this.ecomanet = ecomanet;
	}
	

	
}
