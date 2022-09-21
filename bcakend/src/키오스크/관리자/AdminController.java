package 키오스크.관리자;

import java.util.ArrayList;

public class AdminController {

	

	// 2. 메뉴추가 로직
		boolean inMenu ( String menuname ) {
			return AdminDao.getInstance().inMenu(menuname); //
		}
		
	// 3. 메뉴 호출 로직●        
		ArrayList< MenuDto > getMenu() {
			return AdminDao.getInstance().getMenu();
		}
		
	// 3. 제품추가로직
		boolean inproduct( String pname , int pprice , String pcoment , int pamount ) {
			ProductDto dto = new ProductDto(pamount, pname, pprice, pcoment, 0, pamount)
		}

		
	// 4. 주문 확인 로직
		void getOrder() {}
	
	
	
}
