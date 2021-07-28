import java.util.Scanner;

public class JapangiMain3 {

	public static void main(String[] args) {
		//DB <->JAVA Connection 
		//DB 음료 ( 음료목록을 가져옴)
		DrinkDAO dao = new DrinkDAO();
		DrinkDTO[] dtos = dao.getData(); // dao.getData();//개발자A DAO 음료목록을 조회해오는
									     //기능을 추가해놨다.
		dao.displayDrink(dtos);
		dao.getInt("금액 입력");
		dao.displayDrink(dtos);
		dao.getInt("음료 선택");
		//음료를 선택 시 잔돈이 출력 되게 끔 dao를 수정하시오.
		//음료선택 (syso)
		//사용자가 선택시 어떤 음료가 선택이 되었고 잔돈이 얼마가 되는지 처리
		//<--완료 -->
		//어떤 음료를 선택했을때 내가 가진 금액 보다 음료의 가격이 큰지
		//...............금액을 입력했을때 50원짜리 100원짜리 500원짜리 1000원짜리만 입력하게
		//(현실에서 사용했을때 문제가 없게끔)
		//음료를 관리자 모드로 들어갔을때 추가할수있는기능.
	}
	
	
	
}
