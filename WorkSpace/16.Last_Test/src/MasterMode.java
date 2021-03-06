import java.util.ArrayList;
import java.util.Scanner;

public class MasterMode {
	public void displayMenu() {
		System.out.println("1.상품검색");
		System.out.println("2.상품추가");
		System.out.println("3.상품삭제");
		System.out.println("4.재고관리");
		System.out.println("5.로그아웃");
		
	}
	
	
	public void masterStart() {
		//상품 목록을 전체 출력 DTO , DAO
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.allProductSelect();
		dao.displayProduct(list);
		displayMenu();
	
		String menu =  Common.rtnString("메뉴를 선택해주세요.");
		if(menu.equalsIgnoreCase("1")) {
			System.out.println("1.상품 검색 로직");
				menu = Common.rtnString("1.상품 이름검색 , 2.상품 회사검색 ");
				if(menu.equalsIgnoreCase("1")) {
					String inputData = Common.rtnString("상품 이름을 입력해주세요. ▶");
					dao.displayProduct( dao.selectProduct(inputData , "name") );
				}else if(menu.equalsIgnoreCase("2")) {
					String inputData = Common.rtnString("상품 회사을 입력해주세요. ▶");
					dao.displayProduct( dao.selectProduct(inputData , "company") );
				} //상품 검색 로직 끝---. 
				
		}else if(menu.equalsIgnoreCase("2")) {
			System.out.println("2.상품 추가 로직");
			int num = Common.rtnInt("상품 번호를 입력해주세요▶");
			int result = dao.checkNum(num);
			if(result == 1) {
				System.out.println("이미 등록 된 상품 번호 입니다.");
			}else {
				String name =Common.rtnString("상품 명을 입력해주세요");
				String company =Common.rtnString("회사를 입력해주세요");
				int price = Common.rtnInt("가격을 입력해주세요");
				int qty = Common.rtnInt("재고를 입력해주세요");
				ProductDTO dto = new ProductDTO(num, name, company, price, qty);
				result = dao.insertProduct(dto);
				if(result > 0 ) {
					System.out.println("상품 추가 완료 되었습니다.");
				}else {
					System.out.println("상춤 추가 실패 ");
				}
			}
			
			
		}else if(menu.equalsIgnoreCase("3")) {
			System.out.println("3.상품 삭제 로직");
			int num = Common.rtnInt("상품 번호를 입력해주세요▶");
			int result = dao.checkNum(num);
			if(result == 1) {
				System.out.println("삭제 로직");
				result = dao.deleteProduct(num);
				if(result == 1) {
					System.out.println("상품 삭제 성공");
				}else {
					System.out.println("상품 삭제 실패");
				}
			}else {
				System.out.println("등록 되지 않은 상품 번호 입니다.");
			}
			
		}else if(menu.equalsIgnoreCase("4")) {
			System.out.println("4.상품 재고 관리");
			int num = Common.rtnInt("상품 번호를 입력해주세요▶");
			int result = dao.checkNum(num);
			if(result == 1) {
				int qty = Common.rtnInt("재고를 입력 해주세요.");
				result = dao.updateProduct(num, qty);
				if(result == 1) {
					System.out.println("재고 수정 완료");
				}else {
					System.out.println("재고 수정 실패");
				}
			}else {
				System.out.println("등록 되지 않은 상품 번호 입니다.");
			}
			
		}else if(menu.equalsIgnoreCase("5")) {
			System.out.println("5.로그아웃");
			TestMain.loginInfo = null;
		}
		
		
	}
}
