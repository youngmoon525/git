package pack05_Japangi;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	//사용자가 어떤값을 입력했을때 int또는 String형식으로 다시 값을 반환받기 위한
	//메소드 
	//ex)음료의 번호를 사용자가 선택함 -int
	//ex)사용자가 금액을 입력함 -int 
	//ex)rtn String 문자열의 길이가 적어도 1글자 이상은 들어오게끔 처리를 ..
	//String을 리턴하는 메소드
	//void == return이 없는 경우 
	//그외 == return이 있는 경우
	//void != String == return을 줘야함
//	public static void main(String[] args) {
//		//클래스의 메소드 기능 확인 
//		DrinkDAO dao = new DrinkDAO();
//		//System.out.println(dao.rtnString() ) ;
//		System.out.println(dao.rtnInt());
//	} //test용 main 메소드 개발완료후 삭제 요청 
	
	public String rtnString() {
		//반복해서 옳은 값이 나올때까지 입력을 유도해야함
		Scanner sc = new Scanner(System.in);
		String rtnStr = "";
		System.out.println("문자를 입력해주세요.");
		while (true) {		
			rtnStr = sc.nextLine();
			//trim으로 공백문자를 제거 
			if (rtnStr.trim().length() > 0) {
				return rtnStr;
			}
		}//무한루프 되는 반복문 밑에 코드는 실행 될 수가 없기 때문에 오류 코드라고 인식함
		 //메소드 구조만 먼저 만듬
	}//method
	
	//int형을 리턴하는 메소드 
	public int rtnInt() {
		Scanner sc = new Scanner(System.in);
		int rtni =0; 
		System.out.println("숫자를 입력해주세요.");
		while (true) {
			//try Catch
			try {
				
				 rtni = Integer.parseInt(sc.nextLine()); ///pass nextint()
				 return rtni; 
				//에러가 발생 안하면 int 
				//발생 하면 String 
			} catch (Exception e) {
				System.out.println("다시 숫자를 입력 해주세요 ");
			}
			
		}
	}
	
}
