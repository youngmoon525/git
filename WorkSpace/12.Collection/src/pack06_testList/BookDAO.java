package pack06_testList;

import java.util.ArrayList;
import java.util.Scanner;

//도서에 관련 된 기능들을 모아놓은 클래스
//DAO <-> Database 
public class BookDAO {
	public static Scanner sc = new Scanner(System.in);

	// 스캐너를 dao에 접근하면 언제든지 사용할수있게 static(정적멤버로만듬)
	// 접근제한자 리턴타입 메소드이름(파라메타 인자값)
	public int rtnInt(String msg) {
		System.out.println(msg);
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		}
	}

	public int rtnInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		} // 무한 루프 밑에 코드는 사용이 불가능하다.

		// return 0; //리턴타입이 void가 아닐때 무조건 return이 있다.
	}

	public void initBook(ArrayList<BookDTO> dtos) {
		dtos.add(new BookDTO("책1", "작가1", "회사1", 10000));
		dtos.add(new BookDTO("책2", "작가2", "회사2", 20000));
		dtos.add(new BookDTO("책3", "작가3", "회사3", 30000));
	}

	public void display(ArrayList<BookDTO> dtos) {
		for (int i = 0; i < dtos.size(); i++) {
			System.out.print(dtos.get(i).getName() + "\t");
			System.out.print(dtos.get(i).getAuthor() + "\t");
			System.out.print(dtos.get(i).getCompany() + "\t");
			System.out.print(dtos.get(i).getPrice() + "\n");
		}
	}
	public void display(BookDTO dtos) {
			System.out.print(dtos.getName() + "\t");
			System.out.print(dtos.getAuthor() + "\t");
			System.out.print(dtos.getCompany() + "\t");
			System.out.print(dtos.getPrice() + "\n");
		
	}
	// for문 => foreach(향상 된 for문)
	public void displayForeach(ArrayList<BookDTO> dtos) {
		// foreach
		// for(밖으로 빼낼 객체 타입 : 밖으로 빼낼 객체를 가지고있는 collection)
		//
		System.out.print("제목" + "\t");
		System.out.print("작가" + "\t");
		System.out.print("출판사" + "\t");
		System.out.print("가격" + "\n");
		for (BookDTO dto : dtos) {
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAuthor() + "\t");
			System.out.print(dto.getCompany() + "\t");
			System.out.print(dto.getPrice() + "\n");

		}
	}

	public String rtnString(String msg) {
		System.out.println(msg);
		while (true) {
			String inputData = sc.nextLine();
			if (inputData.trim().length() > 0) {
				return inputData;
			} else {
				System.out.println("적어도 한글자 이상 입력을 해주세요.");
			}
		}
	}

	public String rtnString() {
		while (true) {
			String inputData = sc.nextLine();
			if (inputData.trim().length() > 0) {
				return inputData;
			} else {
				System.out.println("적어도 한글자 이상 입력을 해주세요.");
			}
		}
	}

	public ArrayList<BookDTO> addBook(ArrayList<BookDTO> dtos) {
		dtos.add(new BookDTO(rtnString("제목을 입력 해 주세요."), rtnString("작가를 입력 해 주세요."), rtnString("회사를 입력 해 주세요."),
				rtnInt("가격을 입력 해 주세요.")));

		return dtos;
	}

	public ArrayList<BookDTO> updateBook(ArrayList<BookDTO> dtos) {
		display(dtos);
		int inputNum = rtnInt("수정할 책을 선택 해 주세요.");

		dtos.get(inputNum).setName(rtnString("수정할 책 제목 입력:"));
		dtos.get(inputNum).setAuthor(rtnString("수정할 책 작가 입력:"));
		dtos.get(inputNum).setCompany(rtnString("수정할 책 회사 입력:"));
		dtos.get(inputNum).setPrice(rtnInt("수정할 책 가격 입력:"));

		return dtos;
	}

	public ArrayList<BookDTO> deleteBook(ArrayList<BookDTO> dtos) {
		int inputNum = rtnInt("삭제할 책을 선택 해 주세요.");
		dtos.remove(inputNum);
		return dtos;
	}

	public void findBook(ArrayList<BookDTO> dtos) {
		String inputData = rtnString("검색 할 책 제목을 입력해주세요");
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().trim().equals(inputData.trim()) ) {
				display(dtos.get(i));
				System.out.println("책 검색이 완료 되었습니다.");
				break;
			}
		}
		
	}

}
