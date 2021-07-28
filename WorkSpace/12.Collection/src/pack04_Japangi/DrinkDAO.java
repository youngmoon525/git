package pack04_Japangi;

import java.util.ArrayList;
import java.util.Scanner;

//음료의 기능을 모두 기술함(정의함)
public class DrinkDAO {
	//void 형태는 return이 없는경우 ex) main메소드에서 메소드를 실행한 결과를 받을 필요가 없는경우
	
	//음료의 목록을 보여주는 메소드 
	public void drinkDisplay(ArrayList<DrinkDTO> list){
		//ArrayList<DrinkDTO> list =new ArrayList<DrinkDTO>();
		//list - lv (지역변수를 만듬)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + list.get(i).getPrice() + list.get(i).getCompany());
		}
		//System.out.println("1.콜라 2.삼다수 3.사이다"); //-- x
		//drinkDisplay(인자값을 받아서 출력하는 메소드를 완성하시오) 
	}
	
	//ArrayList list 에 음료를 하나 추가하는 메소드를 작성하시오.
	public void addDrink() {
		//return 
		//
	}
	//메소드의 정의
	public int rtnInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요");
			try {
				
			int num = Integer.parseInt( sc.nextLine() );
			return num ;
			}catch (Exception e) {
				System.out.println("잘못 된 입력");
			}
		}
	}
}
