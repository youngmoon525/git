import java.util.Scanner;

//DAO<- implement 받아야 하는곳
//
public class DrinkDAO implements JapangiInterface{

	@Override
	public int getInt(String msg) {
		//사용자가 입력을 잘못하였을 경우 프로그램을 다음 스택으로 넘어가는게 아니라
		//다시 입력하게끔 유도
		for(int i = 0 ; true ; i++) {
			System.out.println(msg);
			Scanner sc = new Scanner(System.in);
			try {
				int inputNum = Integer.parseInt(sc.nextLine());
				System.out.println(inputNum);
				return inputNum;
			}catch (Exception e) {
				System.out.println("input Int");
			}
			
		}
	
	}
	@Override
	public void displayDrink(DrinkDTO[] drinkDTOs) {
		
		for (int i = 0; i < drinkDTOs.length; i++) {
			System.out.print((i+1) + "." + drinkDTOs[i].name  + "(" + drinkDTOs[i].price + ")");
			System.out.println();
		}
		
		
	}
	@Override
	public void choiceDrink() {
//		int choice = getInt("음료를 골라 주세요 ");
//		price = price - drinkDTOs[choice].price;
//		System.out.println(price + "가 배출 됨 ");
//		
	}
	@Override
	public DrinkDTO[] getData() {
		DrinkDTO[] dtos = new DrinkDTO[3]; // dao.getData();
		dtos[0] = new DrinkDTO(800, "콜라");
		dtos[1] = new DrinkDTO(800, "사이다");
		dtos[2] = new DrinkDTO(500, "물");
		
		return dtos;
		//DrinkDTO[] 배열을 리턴을 해줘야 메인에서 DB에서 받아온 값을 받아서 사용가능
		//DB (음료목록,콜라,사이다....) <- java(getData) -> Japangi3 main
		
	}

}
