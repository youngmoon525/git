package pack01_if1;

import java.util.Scanner;

public class testst {
	public static void main(String[] args) {
		// 구글스프레드시트 , Notion (exe설치) , sticky
		// 줄정리 줄정리할부분 블럭킹 , ctrl + shif + f
		// 1.어떤 값 a를 변수로 선언하시고 정수형
		// 그 값이 홀수인지 짝수인지를 if else문을 사용해서 출력해보세요
		int a = 9;
		//a==0 true / false
		//a % 2 == 0 나머지
		//a / 2 몫
		if(a % 2 == 0) {
			System.out.println("값이 짝수입니다.");
		}else {
			System.out.println("값이 홀수입니다.");
		}
		// 2.Scanner를 이용하여 값을 입력받고 그값이 홀수인지 짝수인지
		// 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int number = Integer.parseInt(inputData);
		//int -> String , String - > int 
		if(number % 2 == 0) {
			System.out.println("값이 짝수입니다.");
		}else {
			System.out.println("값이 홀수입니다.");
		}

	}// main
}// class
