import java.util.Scanner;

public class JapangiMain implements JapangiInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputMoney = Integer.parseInt(sc.nextLine());
		System.out.println(inputMoney);
		//사용자가 금액을 입력을 완료 했다고 가정
//		int cola = 800;
//		int soda = 800;
//		int water = 500; //하드코딩을 하게되면 음료의 종류가 늘어날수록 불편해짐
		//int[] drinkPrice = { 800 , 800 , 500 , ..하드코딩이 발생 };
//		int[] drinkPrice = new int[3];
//		drinkPrice[0] = cola;
//		drinkPrice[1] = soda;
//		drinkPrice[2] = water;
//		drinkPrice[0] = 800;
//		drinkPrice[1] = 800;
//		drinkPrice[2] = 500;
		
		///........................20
//		System.out.println("1.콜라(800) 2.사이다(800) 3.물(500) ");
//		//사용자가 음료를 선택 함
//		int inputUser = Integer.parseInt(sc.nextLine());
//		inputMoney = inputMoney - drinkPrice[inputUser - 1];
////		if(inputUser == 1) {
////			inputMoney = inputMoney - cola;
////		}
//		System.out.println(inputMoney);
		
	}
	//사용자가 금액을 입력하는 메소드
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		
	}
	//목록을 보여줌
	@Override
	public void displayDrink() {
		// TODO Auto-generated method stub
		
	}
	//음료를 선택
	@Override
	public void choiceDrink() {
		// TODO Auto-generated method stub
		
	}
}
