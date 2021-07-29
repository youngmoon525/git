package pack05_Japangi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static int coin ;
	public static void main(String[] args) {
		//실제 자판기의 프로그램이 실행되서 동작하는 부분
		System.out.println("자판기 프로그램이 시작됨");
		System.out.println("1.관리자 모드  2.사용자 모드 ▶ 그 외 키를 누르면 종료 됩니다.");
		//Scanner sc = new Scanner(System.in);
		//String inputData = sc.nextLine(); 
		//▶==스캐너로 입력받는 부분들은 DAO의 메소드로 처리
		
		//Drink <음료라는 객체는 String , int , String ..등등의 속성을 여러가지 변수타입으로
		//가지고 있기때문에 DTO라는 속성의 묶음(객체)를 만들어야 된다.
		//ArrayList<String> name = new ArrayList<String>();
		//ArrayList<Integer> price = new ArrayList<Integer>();
		//==DTO라는 클래스를 만듬 => 클래스를 통해서 객체를 생성해 ArrayList의 데이터 타입으로
		//사용하자 !
		//
		ArrayList<DrinkDTO> list = new ArrayList<DrinkDTO>();
		//list에 item추가
		//DrinkDTO cola = new DrinkDTO("cola", 800, "코카콜라");
		list.add(new DrinkDTO("1.콜라", 800, "코카콜라"));
		list.add(new DrinkDTO("2.사이다", 1000, "칠성"));
		list.add(new DrinkDTO("3.삼다수", 500, "삼다수"));
		///DrinkDAO.display(list); static멤버의 사용
		//인스턴스화를 하고 나서 사용
		//인스턴스 멤버의 사용 
		DrinkDAO dao = new DrinkDAO();
		dao.display(list);
		String inputData = dao.rtnString();
		if (inputData.equals("1")) {
			System.out.println("관리자 모드 ");
			//음료의 추가 수정 삭제 조회
			//CRUD
			//CREATE(데이터의 추가) -list.add
			//Read(데이터의 조회)	-dao.display
			//Update(데이터의 수정)	-list.?
			//Delete(데이터의 삭제) -list.remove
			
			//1.데이터의 추가(음료추가) 
			System.out.println("1.음료 추가 2.음료 삭제 3. 음료 수정 4.음료 다시보기");
			inputData = dao.rtnString();
			if(inputData.equals("1")) {
				//음료 추가 로직을 구현 
				System.out.println("음료 추가 로직 시작");
				DrinkDTO dto = new DrinkDTO();
				//dto.name , price , compay = null , 0 , null
				System.out.println("음료의 이름을 입력해주세요");
				dto.setName( dao.rtnString() ) ;
				System.out.println("음료의 가격을 입력해주세요");
				dto.setPrice( dao.rtnInt() ) ;
				System.out.println("음료의 회사를 입력해주세요");
				dto.setCompany( dao.rtnString() ) ;
				list.add(dto);
				dao.display(list);
			}else if(inputData.equals("2")) {
				//음료 삭제 로직을 구현
				System.out.println("음료 삭제 시작");
				dao.display(list);//음료의 목록을 다시보여주고 해당하는 번호를 선택하게끔 유도
				System.out.println("삭제할 번호를 선택 하세요");
			
				list.remove( dao.rtnInt()-1 ) ;//음료 삭제 완료
				dao.display(list);
			}else if(inputData.equals("3")){
				//음료 수정 로직을 구현
				System.out.println("음료 수정 시작");
				System.out.println("수정할 번호를 선택 하세요");
				//inputData = sc.nextLine();
				
				System.out.println("음료의 이름을 입력해주세요.");
				
				list.get(dao.rtnInt()-1 ).setName(dao.rtnString() );
				dao.display(list);
				//..반복 처리 
			}
		}else if(inputData.equals("2")) {
			System.out.println("사용자 모드");
			dao.display(list);
			System.out.println("금액을 입력해주세요.");
			coin = dao.rtnInt();
			
			System.out.println("음료를 선택해 주세요.");
	
			coin = coin - list.get(dao.rtnInt()-1).getPrice();
			System.out.println("잔돈"+ coin);
			
			//반복되는 코드를 찾는다. => 메소드로 나누고
		}else {
			System.out.println("프로그램을 종료 합니다.");
		}
		
		
	}
}
