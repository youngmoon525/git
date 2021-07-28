package pack05_Japangi;

import java.util.ArrayList;

public class DrinkDAO {
	// Method의 이름은 소문자로 시작 , Class의 이름은 대문자로 시작
//	public static void display(ArrayList<DrinkDTO> list) {
//		for (int i = 0; i < list.size(); i++) {//list.size() 배열을 사용했을때는 배열.length
//			//출력 // i=0 < 3 , 0 , 1 , 2
//			System.out.println(list.get(i).getName() + ".(" + list.get(i).getPrice() + ")" + list.get(i).getCompany() );
//		}
//	}
//인스턴스 멤버의 사용	
	public void display(ArrayList<DrinkDTO> list) {
		for (int i = 0; i < list.size(); i++) {// list.size() 배열을 사용했을때는 배열.length
			// 출력 // i=0 < 3 , 0 , 1 , 2
			System.out.println(list.get(i).getName() + ".(" + list.get(i).getPrice() + ")" + list.get(i).getCompany());
		}
	}
}
