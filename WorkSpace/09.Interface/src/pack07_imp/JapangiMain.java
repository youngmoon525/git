package pack07_imp;

import java.util.Scanner;

public class JapangiMain implements Japangi_Interface {
	int coin = 0 ;
	//static int coin2 = 0;
	public static void main(String[] args) {
		JapangiMain main = new JapangiMain();
		main.insertCoin();
		main.choiceDrink();
		main.receiveCoin();
		//coin = 0;//사용불가 인스턴스 멤버인지 정적 멤버인지 확인
		//coin2 = 0;
		//main.coin = 0; 
	}
	
	@Override
	public void insertCoin() {
		//DAO로 분리
		//dao.inserCoin();
		System.out.println("동전을 넣음");
		Scanner sc = new Scanner(System.in);
		coin = Integer.parseInt( sc.nextLine() );
		System.out.println(coin + "입력완료");
		//추후 try{} catch{} 를 통해서 예외처리 할 예정
		//int[] numarr = new int[3]; //음료의 번호만 
		//String[] namearr = new String[3]; //음료의 이름만
		
	}

	@Override
	public void choiceDrink() {
		//System.out.println("음료 목록을 보여주고 선택함" + coin);
		//System.out.println("1.콜라(800) , 2.물(500) , 3.포카리(1000) , 4.사이다");
		//사용자가 선택을 하게 되면 그 값을 인트형으로 받음
		//String[] drinkName = {"콜라(800)" , "물(500)" , "포카리(1000)" , "사이다(500)", "게토레이" } ;
		//int[] drinkPrice = { 800 , 500 , 1000 , 500 , 800 } ;
		//int + String을 모두 사용할수있는 객체를 만들어야함
		//
		//for (int i = 0; i < drinkPrice.length; i++) {
	//		System.out.println(drinkName[i] + drinkPrice[i]);
		//}
		//생성자를 이용하지 않았을 경우 필드에 하나씩 접근을 해야하는 불편함이 생김
		//DrinkDTO dto = new DrinkDTO();
		//dto.name = "콜라";
		//dto.price = 400;
		//데이터 타입[] 배열의이름 = new 데이터타입[size];
		DrinkDTO[] dtos = new DrinkDTO[3];//DrinkDTO를 배열로 만듬 
		dtos[0] = new DrinkDTO(1,400, "콜라");
		dtos[1] = new DrinkDTO(2,600, "물");
		dtos[2] = new DrinkDTO(3,500, "사이다");
		
	
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].num + "." + dtos[i].name + "(" + dtos[i].price + ")");
		}
		
		Scanner sc = new Scanner(System.in);
		int choice  = Integer.parseInt( sc.nextLine() ); 
		for (int i = 0; i < dtos.length; i++) {
			if (choice == dtos[i].num) {
				System.out.println(dtos[i].name);
				coin = coin -  dtos[i].price ;
				break;
			}
		}
		//System.out.println(drinkName[choice]);
		//coin = drinkPrice[choice];
//		if(choice.equals("1")) {
//			System.out.println("콜라가 선택 됨");
//			coin = coin - 800;
//		}
		//음료가 추가가 되면 하드코딩으로 
		//else if 처리를 더 해줘야함 
		//음료 목록에도 수동으로 값을 넣어줘야함
		//값이 반복해서 사용이 되니 배열을 사용하자.
		//객체를 만들어야겠다.
	}

	@Override
	public void receiveCoin() {
		System.out.println("잔돈을 반환함" + coin);
	}

}
