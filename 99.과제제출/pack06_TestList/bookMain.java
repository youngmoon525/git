package pack06_TestList;

import java.util.ArrayList;
import java.util.Scanner;

public class bookMain {
	public static void main(String[] args) {
		System.out.println("도서 프로그램 시작 (강동길 & 김소이)");
		
		ArrayList<bookDTO> list = new ArrayList<bookDTO>();
		//도서 번호(나중에 추가했음) , 제목 , 저자 , 출판사 , 가격
		list.add(new bookDTO(1, "aaa", "bbb", "ccc", 1000));
		list.add(new bookDTO(2, "혼자 공부하는 자바", "신용권", "한빛미디어", 30000));
		list.add(new bookDTO(3, "해커스 토익", "데이비드 조", "해커스어학연구소", 12000));
		list.add(new bookDTO(4, "어린 왕자", "생텍쥐페리", "열린책들", 8600));
		
		while (true) {
			System.out.println("1. 관리자 모드  2. 사용자 모드 ▶ 그 외 키를 누르면 종료 됩니다.");
			bookDAO dao = new bookDAO();
			String inputData = dao.inputData();
			if (inputData.equals("1")) {
				MasterBook mb = new MasterBook();
				list = mb.mstBook(list);
			} else if (inputData.equals("2")) {
				UserBook ub = new UserBook();
				ub.usBook(list);// void
			} else if (inputData.equals("q")) {
				System.out.println("도서 프로그램을 종료");
			}
			break;
		}//while
	}//main
}//class
