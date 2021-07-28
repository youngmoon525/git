package pack04_Escape;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		//Scanner : console창에 사용자(개발자)가 입력한값을
		//사용할수있게 해준다. 데이터형태는 기본적으로 String
		//Scanner = Java에서만 많이사용한다.(Console)프로그램에서만 많이사용
		Scanner scanner = new Scanner(System.in);
		//클래쓰의 초기화는 new라는 예약어 키워드를 통해 초기화를 한다.
		String inputData ; //String 클래쓰를 통해 scanner에 입력된값을 받아올 예정
		inputData = scanner.nextLine();//enter키를 치기전까지를 line
		System.out.println("입력된 문자열은 " + inputData);
		//syso , Scanner
		
	}
}
