package pack05_Japangi;

import java.util.ArrayList;

public class UserJapangi {
	// 아직 어떤값을 리턴해줘야 되는지는 잘 모름(파악이안됨)-?
	int coin; // iv (전역변수) 필드
	public void usJapangi(ArrayList<DrinkDTO> list) { //Main프로그램에서 List를 받아옴 
		DrinkDAO dao = new DrinkDAO();
		//ArrayList<DrinkDTO> list = new ArrayList<>(); // <음료 목록이 있을까? 없을까?
		System.out.println("사용자 모드");
		dao.display(list);
		System.out.println("금액을 입력해주세요.");
		coin = dao.rtnInt();

		System.out.println("음료를 선택해 주세요.");
		int num = dao.rtnInt() - 1 ;
		if(coin >= list.get( num).getPrice()) {
			//입력한 금액이 음료의 금액보다 같거나 크면 출력 아니면 잔돈을 배출하고 프로그램종료(UserJapangi)
			coin = coin - list.get( num).getPrice();
		}else {
			System.out.println("돈을 다시 입력하세요 잔돈을 배출 합니다.");
		}
		System.out.println("잔돈" + coin);

		// 반복되는 코드를 찾는다. => 메소드로 나누고

	}
}
