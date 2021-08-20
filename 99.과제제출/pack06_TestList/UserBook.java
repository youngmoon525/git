package pack06_TestList;

import java.util.ArrayList;

//2.사용자 모드
//-0.금액 입력
//-1.도서 목록 조회
//-2.도서 주문
//      (도서를 선택 후 주문함 , 추후 도서를 몇권 주문할건지 선택 가능)
//-3.잔돈 배출
public class UserBook {
	
	public void usBook(ArrayList<bookDTO> list) {
		System.out.println("< 사용자 모드 > ");
		System.out.println("----------------------------------------");
		System.out.println("도서 목록 출력 ▽");
		bookDAO dao = new bookDAO();
		dao.display(list);
		System.out.println("----------------------------------------");
		
		System.out.println("금액을 입력하세요.");
		int money = dao.inputInt();
		System.out.println("주문할 도서 번호를 선택하세요.");
		int num = dao.inputInt()-1;
//		System.out.println("구매하실 권수를 입력해주세요.");
//		for (int i = 1; i <= Integer.parseInt(sc.nextLine()); i++) {
//			payment += list.get(num-1).getPrice();
//		} (노력의 흔적...ㅎ)
		if (money >= list.get(num).getPrice()) {
			money = money - list.get(num).getPrice();
			System.out.println(list.get(num).getName() + "를(을) 주문하셨습니다.");
			System.out.println("남은 금액 " + money + " 원을 받으세요.");
		}else {
			System.err.println("금액이 모자랍니다.");
		}
	}
}
