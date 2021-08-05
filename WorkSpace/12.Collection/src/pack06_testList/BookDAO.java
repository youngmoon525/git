package pack06_testList;

import java.util.ArrayList;
import java.util.Scanner;

//도서에 관련 된 기능들을 모아놓은 클래스
//DAO <-> Database 
public class BookDAO {
	public static Scanner sc = new Scanner(System.in);
	//스캐너를 dao에 접근하면 언제든지 사용할수있게 static(정적멤버로만듬)
	//접근제한자 리턴타입 메소드이름(파라메타 인자값)
	public int rtnInt(String msg) {
		System.out.println(msg);
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
				
			}catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		}
	}
	
	public int rtnInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
				
			}catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		}//무한 루프 밑에 코드는 사용이 불가능하다.
		
		
		//return 0; //리턴타입이 void가 아닐때 무조건 return이 있다.
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
	//for문 => foreach(향상 된 for문)
	public void displayForeach(ArrayList<BookDTO> dtos) {
		//foreach
		//for(밖으로 빼낼 객체 타입 : 밖으로 빼낼 객체를 가지고있는 collection)
		//
		int i = 0;
		for(BookDTO dto : dtos) {
			i ++ ;
			System.out.println(i);
			System.out.println(dto.getName());
			System.out.println(dto.getAuthor());
			System.out.println(dto.getCompany());
			System.out.println(dto.getPrice());
		}
	}
	
	public ArrayList<BookDTO> addBook(ArrayList<BookDTO> dtos) {
		
		
		return null ;
	}
	
}
