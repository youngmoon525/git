package pack04_Japangi;

import java.util.ArrayList;
import java.util.Scanner;

public class JMain {
	public static void main(String[] args) {
		// ArrayList를 사용ㄹㄹㅇ
		// List<DrinkDTO> list = new ArrayList<DrinkDTO>();
		// List의 하위에 존재하는 List자료구조들을 살펴봄
//		ArrayList<DrinkDTO> list = new ArrayList<DrinkDTO>();
//		DrinkDTO dto = new DrinkDTO("콜라", 800, "코카콜라");
//		list.add(dto);
//		list.add(new DrinkDTO("삼다수", 700, "삼다수"));
//		list.add(new DrinkDTO("사이다", 700, "칠성"));
		DrinkDAO dao = new DrinkDAO();
//		dao.drinkDisplay(list);
		
		System.out.println("자판기 프로그램을 시작 합니다.");
		System.out.println("1.관리자 모드 2.사용자 모드");
		
		while (true) {
			int num = dao.rtnInt();
			//메소드의 호출
			if (num == 1) {
				MasterJapangi.main(null);
				
				// 관리자 모드 로직
				// 다른 자바파일로 나누거나 여기에 구현
			} else if (num == 2) {
				// 사용자 모드 로직
				// 다른 자바파일로 나누거나ㅏ 여기에 구현
			} else {
				System.out.println("잘못 된 입력 !!");
			}
		}

	}
}
