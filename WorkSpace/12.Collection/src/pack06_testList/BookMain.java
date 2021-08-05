package pack06_testList;

import java.util.ArrayList;

//프로그램의 동작은 Main에서 한다.
public class BookMain {
	public static void main(String[] args) {
		ArrayList<BookDTO> dtos = new ArrayList<>();
		BookDAO dao = new BookDAO();
		dao.initBook(dtos);// 3건의 데이터를 넣음

		int menu = dao.rtnInt("1.관리자 모드 2.사용자 모드 -1.종료▶");
		while (true) {

			if (menu == 1) {
				admin();
			} else if (menu == 2) {
				user();
			} else if (menu == -1) {
				System.out.println("프로그램이 종료 됩니다.");
				break;
			} else {
				System.out.println("잘못 된 입력");
			}
		}

	}

	public static void admin() {
		System.out.println("관리자 모드 실행 됨 ▶");
	}

	public static void user() {
		System.out.println("사용자 모드 실행 됨 ▶");
	}
}

//
//1.관리자 모드 (CRUD) 
//-1.도서 추가
//-2.도서 수정
//-3.도서 삭제
//-4.도서 검색 (모든 기능이 완료 되면 추가 할 것 , 도서의 제목을 입력하면 도서의 
//		제목 , 저자 , 출판사 , 가격 이 출력 됨) for if
//2.사용자 모드
//-0.금액 입력
//-1.도서 목록 조회
//-2.도서 주문
//	     (도서를 선택 후 주문함 , 추후 도서를 몇권 주문할건지 선택 가능)
//-3.잔돈 배출
