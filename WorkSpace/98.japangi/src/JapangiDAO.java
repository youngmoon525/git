import java.util.Scanner;

public class JapangiDAO {
	public boolean insertCoin(JapangiDTO dto) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("금액 입력 완료후 0번 입력");
			displayCoin(dto);
			try {
				int inputNum =  Integer.parseInt( sc.nextLine() );
				dto.setCoin( inputNum );
				
				if (inputNum == -1) {
					System.out.println("자판기 종료");
					return false;
				}else if(inputNum == 0 ) {
					System.out.println("금액 입력 완료.");
					return true;
				}
			
			}catch (Exception e) {
				System.out.println("금액을 올바르게 입력해주세요. 종료 버튼 = -1");
			}
			
		}//while
	}

	
	
	public static void displayCoin( JapangiDTO jpg_dto) {
		System.out.println("현재 금액 : " + jpg_dto.getCoin());
	}

	public void exp_Drink(int inputNum, JapangiDTO jpg_dto, DrinkDTO[] drk_dto) {
		System.out.println(drk_dto[inputNum].name + " 선택됨 "  +  " 가격 : " + drk_dto[inputNum].price + "원");
		displayCoin(jpg_dto);
		if(jpg_dto.getCoin() >= drk_dto[inputNum].price) {
			jpg_dto.setCoin( (drk_dto[inputNum].price * -1 ) );
			System.out.println("남은 금액 : " + jpg_dto.getCoin());
		}else {
			System.out.println("금액 부족");
		}
		
	}
}
