import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDTO jpg_dto = new JapangiDTO();
		DrinkDTO[] drk_dto = new DrinkDTO[3]; //DTO => 배열
		JapangiDAO jpg_dao = new JapangiDAO();
		DrinkDAO drk_dao = new DrinkDAO();
		drk_dto[0] = new DrinkDTO("콜라", 800);
		drk_dto[1] = new DrinkDTO("사이다", 700);
		drk_dto[2] = new DrinkDTO("오렌지쥬스", 600);
		Scanner sc = new Scanner(System.in);
		
		//자판기 프로그램 시작
		//금액 입력이 정상적으로 되었다면.if()
		while(true) {
			try {
				System.out.println("자판기 프로그램");
				System.out.println("1.동전 입력  2.음료추가 exit.종료 \r");
				
				JapangiDAO.displayCoin(jpg_dto);
				
				String inputData = sc.nextLine();
				
				if(inputData.equals("exit")) { //종료
					System.out.println("잔돈 : " + jpg_dto.getCoin() + "원");
					break;
				}else if(Integer.parseInt(inputData) == 1) { // 동전입력
					System.out.println();
					//boolean true , false
					if(jpg_dao.insertCoin(jpg_dto)  ) {
						drk_dao.display(drk_dto, jpg_dto);
						int inputNum = Integer.parseInt( sc.nextLine());
							if(inputNum > drk_dto.length-1) {
								System.out.println("잘못된 선택");
							}else {
								jpg_dao.exp_Drink(inputNum , jpg_dto , drk_dto);
							}
					}
				}else if(Integer.parseInt(inputData) == 2) {
					drk_dto = drk_dao.addDrink(drk_dto);
				}
			}catch (Exception e) {
				System.out.println("잘못 된 입력");
			}
		}
		
		

	}
}
