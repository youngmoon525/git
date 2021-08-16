import java.util.ArrayList;

public class UserMode {
	private void displayMenu() {
		System.out.println("1.금액 입력");
		System.out.println("2.상품 주문");
		System.out.println("3.로그 아웃");
	}
	
	public void userStart() {
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.allProductSelect();
		dao.displayProduct(list);
		displayMenu();
		
		String menu =  Common.rtnString("메뉴를 선택해주세요.");
		if(menu.equalsIgnoreCase("1")) {
			System.out.println("금액 입력 로직");
			System.out.println("이름 : " +TestMain.loginInfo.getName()  + "  잔액 : "+ TestMain.loginInfo.getMoney() + "원");
			int money = Common.rtnInt("추가할 금액을 입력해주세요.");
			int result = dao.addMoney(TestMain.loginInfo.getId() , money);
			if(result == 1) {
				System.out.println("금액 추가가 완료 되었습니다.");
				UserDAO udao = new UserDAO();
				TestMain.loginInfo = udao.userLogin(TestMain.loginInfo.getId(), TestMain.loginInfo.getPw());
				System.out.println("이름 : " +TestMain.loginInfo.getName()  + "  잔액 : "+ TestMain.loginInfo.getMoney() + "원");
				
			}else {
				System.out.println("금액 추가 실패 !");
			}
			
		}else if(menu.equalsIgnoreCase("2")) {
			System.out.println("상품 주문 로직 ");
			System.out.println("이름 : " +TestMain.loginInfo.getName()  + "  잔액 : "+ TestMain.loginInfo.getMoney() + "원");
			int num = Common.rtnInt("주문할 상품을 입력해주세요.");
			//checkNum 메소드 이용해서 있는 상품인지 체크
			ProductDTO dto = dao.checkNumDTO(num);
			if(dto != null) {
				System.out.println("재고 : " +dto.getQty());
				int qty = Common.rtnInt("주문 수량을 입력해주세요.");
				if(qty > dto.getQty()) {
					System.out.println("재고를 초과한 수량은 주문이 불가 합니다.");
				}else {
					if(TestMain.loginInfo.getMoney() < (dto.getPrice() * qty) ) {
						System.out.println("잔액이 부족해서 주문할수가 없습니다.");
					}else {
						System.out.println((dto.getPrice() * qty)  + "정상 처리 로직 추가부분 ");
						//사용자의 금액이 마이너스 되어야함 - UPDATE
						//재고도 마이너스가 되어야함 - UPDATE
						int money = (dto.getPrice() * qty);
						int result = dao.minusMoney(money , TestMain.loginInfo.getId()); //key
						if(result ==1)System.out.println("사용자 금액 처리 완료");
						result = dao.minusQty(qty , dto.getNum());
						if(result ==1)System.out.println("재고 처리 완료 ");
					}
				}
				
			}else {
				System.out.println("잘못 입력 하셨습니다.(없는 상품번호)");
			}
		}else if(menu.equalsIgnoreCase("3")) {
			System.out.println("로그아웃 처리");
			TestMain.loginInfo = null;
		}
	}

	
}
