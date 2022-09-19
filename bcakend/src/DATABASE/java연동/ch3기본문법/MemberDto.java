package DATABASE.java연동.ch3기본문법;

public class MemberDto {

			// 1. 필드
			// DB TABLE 필듬여 동일
		
			String mem_id;
		    String mem_name;
		    int mem_number;
		    String addr;																				 
		    String phon1; 																										
		    String phon2; 
		    Short height;
		    String debut_data;

		    // 2. 생성자
			public MemberDto(String mem_id, String mem_name, int mem_number, String addr, String phon1, String phon2,
					Short height, String debut_data) {
				super();
				this.mem_id = mem_id;
				this.mem_name = mem_name;
				this.mem_number = mem_number;
				this.addr = addr;
				this.phon1 = phon1;
				this.phon2 = phon2;
				this.height = height;
				this.debut_data = debut_data;
			}    
}
