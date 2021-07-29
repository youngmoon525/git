package pack05_Japangi;

import java.util.ArrayList;

public class MainPg {
	public static void main(String[] args) {
		System.out.println("자판기 프로그램이 시작됨");
		System.out.println("1.관리자 모드  2.사용자 모드 ▶ 그 외 키를 누르면 종료 됩니다.");
		ArrayList<DrinkDTO> list = new ArrayList<DrinkDTO>();
		list.add(new DrinkDTO("1.콜라", 800, "코카콜라"));
		list.add(new DrinkDTO("2.사이다", 1000, "칠성"));
		list.add(new DrinkDTO("3.삼다수", 500, "삼다수"));
		DrinkDAO dao = new DrinkDAO(); 
		while (true) {
			String inputData = dao.rtnString(); // 1글자 이상
			if(inputData.equals("1")) {
				MasterJapangi ms = new MasterJapangi();
				list = ms.mstJapangi(list);//보내고 결과를 다시 받음
			}else if(inputData.equals("2")) {
				UserJapangi uj = new UserJapangi();
				uj.usJapangi(list);//void
			}else if(inputData.equals("q")) {
				System.out.println("자판기를 종료");
			}
			
		}
	}
}
