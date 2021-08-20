package pack06_TestList;
//1.관리자 모드 (CRUD) 

//-1.도서 추가
//-2.도서 수정
//-3.도서 삭제
//-4.도서 검색 (모든 기능이 완료 되면 추가 할 것 , 도서의 제목을 입력하면 도서의 
//    제목 , 저자 , 출판사 , 가격 이 출력 됨) for if

import java.util.ArrayList;
import java.util.Scanner;

import pack05_Japangi선생님풀이.DrinkDTO;

public class MasterBook {

	public ArrayList<bookDTO> mstBook(ArrayList<bookDTO> list) {
		System.out.println("< 관리자 모드 >");
		System.out.println("----------------------------------------");
		System.out.println("▽ 도서 목록 출력 ▽");
		bookDAO dao = new bookDAO();
		dao.display(list);
		System.out.println("----------------------------------------");
		while (true) {
			System.out.println("[ 1.도서 추가   2.도서 수정   3.도서 삭제   4.도서 검색 ]");
			System.out.println("사용할 기능의 번호를 입력하세요.");
			String inputData = dao.inputData();
			if (inputData.equals("1")) {
				System.out.println("도서 추가 기능 시작");
				bookDTO dto = new bookDTO();
				System.out.println("추가할 도서 '번호' 입력");
				dto.setNum(Integer.parseInt(dao.inputData()));
				System.out.println("추가할 도서 '제목' 입력");
				dto.setName(dao.inputData());
				System.out.println("추가할 도서 '저자' 입력");
				dto.setAuthor(dao.inputData());
				System.out.println("추가할 도서 '출판사' 입력");
				dto.setPublisher(dao.inputData());
				System.out.println("추가할 도서 '가격' 입력");
				dto.setPrice(Integer.parseInt(dao.inputData()));
				list.add(dto);
				System.out.println("----------------------------------------");
				dao.display(list);
				System.out.println("----------------------------------------");

			} else if (inputData.equals("2")) {
				System.out.println("도서 수정 기능 시작");
				System.out.println("수정할 도서의 번호를 적고 수정할 제목을 입력하세요.");
				list.get(dao.inputInt() - 1).setName(dao.inputData());
				 System.out.println("수정할 도서의 번호를 적고 수정할 저자를 입력하세요.");
				 list.get(dao.inputInt()-1).setAuthor(dao.inputData());
				 System.out.println("수정할 도서의 번호를 적고 수정할 출판사를 입력하세요.");
				 list.get(dao.inputInt()-1).setPublisher(dao.inputData());
				 System.out.println("수정할 도서의 번호를 적고 수정할 가격을 입력하세요.");
				 list.get(dao.inputInt()-1).setPrice(Integer.parseInt(dao.inputData()));
				System.out.println("----------------------------------------");
				dao.display(list);
				System.out.println("----------------------------------------");

			} else if (inputData.equals("3")) {
				System.out.println("도서 삭제 기능 시작");
				dao.display(list);
				System.out.println("삭제할 도서 번호를 선택 하세요");
				list.remove(dao.inputInt() - 1);
				System.out.println("----------------------------------------");
				dao.display(list);
				System.out.println("----------------------------------------");

			} else if (inputData.equals("4")) {
				while (true) {
					System.out.println("도서 검색기능 시작");
					System.out.println("검색할 카테고리를 선택해주세요.");
					System.out.println("[1.제목 검색  2.저자 검색  3.출판사 검색]");
					String inputSearch = dao.inputData();
					if (inputSearch.equals("1")) {
						System.out.println("검색할 도서의 '제목'을 입력해주세요.");
						String inputSearch1 = dao.inputData();
						for (int i = 0; i < list.size(); i++) {
							if (inputSearch1.equals(list.get(i).getName())) {
								System.out.println("검색하신 도서 정보 : "+list.get(i).getName() + " / " + list.get(i).getAuthor() + " / "
										+ list.get(i).getPublisher() + " / " + list.get(i).getPrice() + "원");
								System.out.println("도서 검색기능 종료.");
								System.out.println("");
							}
						}
						break;
					} else if (inputSearch.equals("2")) {
						System.out.println("검색할 도서의 '저자'를 입력해주세요.");
						String inputSearch2 = dao.inputData();
						for (int i = 0; i < list.size(); i++) {
							if (inputSearch2.equals(list.get(i).getAuthor())) {
								System.out.println("검색하신 도서 정보 : "+list.get(i).getName() + " / " + list.get(i).getAuthor() + " / "
										+ list.get(i).getPublisher() + " / " + list.get(i).getPrice() + "원");
								System.out.println("도서 검색기능 종료");
								System.out.println("");
							}
						}
						break;
					} else if (inputSearch.equals("3")) {
						System.out.println("검색할 도서의 '출판사'를 입력해주세요.");
						String inputSearch3 = dao.inputData();
						for (int i = 0; i < list.size(); i++) {
							if (inputSearch3.equals(list.get(i).getPublisher())) {
								System.out.println("검색하신 도서 정보 : "+list.get(i).getName() + " / " + list.get(i).getAuthor() + " / "
										+ list.get(i).getPublisher() + " / " + list.get(i).getPrice() + "원");
								System.out.println("도서 검색기능 종료");
								System.out.println("");
							}
						}
						break;
					} else {
						System.err.println("사용 가능한 기능이 아닙니다. 1 ~ 3 까지 다시 입력하십시오.");
						continue;
					}
				} // 4.도서검색 안에 while문
			} else {
				System.err.println("사용 가능한 기능이 아닙니다. 1 ~ 4 까지 다시 입력하십시오.");
				continue;
			}
		} // 관리자 모드 while문
}// mstBook
}// class MasterBook