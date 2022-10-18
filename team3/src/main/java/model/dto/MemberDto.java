package model.dto;

public class MemberDto {

	private int mno ;
	private String mid ;
	private String mpassword ;
	private String mnickname ;
	private String mfriendsno ;
	
	// 빈생성자
	public MemberDto() {}

	// 풀생성자
	public MemberDto(int mno, String mid, String mpassword, String mnickname, String mfriendsno) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mnickname = mnickname;
		this.mfriendsno = mfriendsno;
	}

	// getter setter
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMnickname() {
		return mnickname;
	}

	public void setMnickname(String mnickname) {
		this.mnickname = mnickname;
	}

	public String getMfriendsno() {
		return mfriendsno;
	}

	public void setMfriendsno(String mfriendsno) {
		this.mfriendsno = mfriendsno;
	}

	// tostring
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + ", mnickname=" + mnickname
				+ ", mfriendsno=" + mfriendsno + "]";
	}
	
	
	
}
