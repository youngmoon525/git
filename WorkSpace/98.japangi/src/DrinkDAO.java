import java.util.Scanner;

public class DrinkDAO {
	public void display(DrinkDTO[] drk_dto , JapangiDTO jpg_dto) {
		System.out.println("음료를 선택해 주세요." );
		JapangiDAO.displayCoin(jpg_dto);
		for (int i = 0; i < drk_dto.length; i++) {
			System.out.println(i+"음료명 : \t"+ drk_dto[i].name  + "\t\t음료 가격 :"+ drk_dto[i].price);
		}
	}

	public DrinkDTO[] addDrink(DrinkDTO[] drk_dto) {
		Scanner sc = new Scanner(System.in);
		String name ="";
		int price = 0;
		DrinkDTO[] tempDTO;
		while(true) {
			try {
				if(name.length() < 2) {
					System.out.println("음료 명 입력");		
					name = sc.nextLine();
					continue;
				}if(price < 1) {
					
					System.out.println("음료 가격 입력");
					price = Integer.parseInt( sc.nextLine() );

					continue;
				}
				 tempDTO = new DrinkDTO[drk_dto.length+1];
				for (int i = 0; i < drk_dto.length; i++) {
					tempDTO[i] = drk_dto[i];
				}
				tempDTO[tempDTO.length-1] = new DrinkDTO(name, price);
				System.out.println(name + "추가 됨 ");
				break;
			}catch (Exception e) {
				System.out.println("잘못된 입력");
			}
			
		}
		return tempDTO;
	}
}
