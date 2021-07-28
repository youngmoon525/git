package pack05_etc;

import java.util.Scanner;

public class Ex01_break {
	public static void main(String[] args) {
		//break = 제어문의 종료를 하기위한 문법
		int i = 0;
		while(true) {
			System.out.println("i의 값" + i);
			if(i == 10) {
				System.out.println("i의 값이 10이 되면 중지가 된다.");
				break;
			}
			i++;
		}
		for(int j=0 ; true ; j++) {
			if(i == 10) {
				System.out.println("for문도 i의값이 10이되면 중지");
				break;
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요 ");
		while(true) {
			
			String inputData = sc.nextLine();
			System.out.println(inputData);
			if(inputData.equals( "a" ) ) { // String 의 비교는 ==로 안됨
				System.out.println("종료 ");
				break;
			}
			//숫자값 또는 내가 key로 주고싶은값을 입력했을때 while문이 종료되게
			//프로그램을 수정해보세요.
			//ex) 1이라는 값을 입력시 종료라고 출력되고 루프가 종료됨
			//ex) a이라는 값을 입력시 종료라고 출력되고 루프가 종료됨
		}
	}
}
