package 개인과제.강사님;

import java.util.ArrayList;

public class ExpenseControll {

	// 1. 내용추가 컨트롤러
	boolean create( String edate , int emoney , String econtent ) {
		
		// 매개변수 3개 --> 1개 dto 선언
		ExpenseDTO dto = new ExpenseDTO( 0 , edate, emoney, econtent);
		
		// dao 객체
		return ExpenseDAO.getExpenseDAO().create( dto );
		
	}
	
	// 2. 내용호출 컨트롤러
	ArrayList<ExpenseDTO> read(){
		return ExpenseDAO.getInstance().read();
	} 
	
	
	// 3. 내용수정 컨트롤러
	boolean update( int eno , String b , int c , String d ) {				// 선언부? 
		return ExpenseDAO.update( new ExpenseDTO(eno, d, c, d) );  
	}
	
	
	// 4. 내용삭제 컨트롤러
	boolean delete( int eno ) {
		return ExpenseDAO.getExpenseDAO().delete( eno );
	}
}
