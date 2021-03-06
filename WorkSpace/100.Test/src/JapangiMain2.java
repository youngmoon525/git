import java.util.Scanner;

public class JapangiMain2 implements JapangiInterface {
	DrinkDTO[] drinkDTOs ;
	int price ;
	
	public void japangiStrat() {

		drinkDTOs = new DrinkDTO[3];
		drinkDTOs[0] = new DrinkDTO(800, "콜라");;
		drinkDTOs[1] = new DrinkDTO(800, "사이다");;
		drinkDTOs[2] = new DrinkDTO(500, "물");
		
		
		displayDrink(drinkDTOs);
		
		
		drinkDTOs[2] = new DrinkDTO(500, "삼다수");
		displayDrink(drinkDTOs);
		
		
		price = getInt("금액을 입력해주세요");
		System.out.println("금액 입력 완료");
		
		
		choiceDrink();
	}
	
	public static void main(String[] args) {
		JapangiMain2 jm = new JapangiMain2();
		jm.japangiStrat();
		//int , String 등의 속성을 가지는 음료 자체를 객체로 만들기 위해서
		//설계도를 이용해서 (음료라는 객체를 만들수있는설계도) 
		//음료라는 객체를 계속해서 찍어낼수있다.
		//DrinkDTO cola = new DrinkDTO();
		//cola.price = 800;
		//cola.name = "콜라";
		//DrinkDTO soda = new DrinkDTO(800, "사이다");
		
		//int[]
		//데이터타입 [] 배열의 이름 =  new 데이터타입 [size] 
		
	
		
		
	}
	//사용자가 금액을 입력하는 메소드
	
	//목록을 보여줌
	@Override
	public void displayDrink(DrinkDTO[] drinkDTOs) {
		
		for (int i = 0; i < drinkDTOs.length; i++) {
			System.out.print((i+1) + "." + drinkDTOs[i].name  + "(" + drinkDTOs[i].price + ")");
			System.out.println();
		}
		
	}
	//음료를 선택
	@Override
	public void choiceDrink() {
		int choice = getInt("음료를 골라 주세요 ");
		price = price - drinkDTOs[choice].price;
		System.out.println(price + "가 배출 됨 ");
		
		
	}
	//메소드를 호출 했을때 반드시 사용자가 숫자를 입력해서 그결과를 받을수있는 메소드
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
				System.out.println("잘못 된 입력 입니다.");
			}
			
		}
	
	}
}
