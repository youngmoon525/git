package pack01_if1;

import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {
		//블럭if문 : 조건을 판단하여 참일때 또는 거짓일때의 명령을 실행
		//if(조건식){
		//	참일때의 실행문
		//}else{
		//	거짓일때의 실행문
		// }
		int score = 85;
		if(score>= 90) {
			System.out.println("90점 이상입니다.");
			System.out.println("등급은 A입니다.");
		}else {
			//else { } if블럭의 블럭킹 끝부분에 연결해서 사용
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 A가 아닙니다.");
		}
		
		//1.어떤 값 a를 변수로 선언하시고 정수형
		//그 값이 홀수인지 짝수인지를 if else문을 사용해서 출력해보세요
		int a = 10 ;
		
		//2.Scanner를 이용하여 값을 입력받고 그값이 홀수인지 짝수인지
		//출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		
		
		
		
		
		
		
		
	}//main
}//class
