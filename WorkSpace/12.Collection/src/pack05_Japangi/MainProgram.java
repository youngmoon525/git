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
		
		
		
	}
}
