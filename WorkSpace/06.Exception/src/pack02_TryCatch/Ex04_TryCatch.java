package pack02_TryCatch;

import java.util.Scanner;

public class Ex04_TryCatch {
	public static void main(String[] args) {
		//Scanner를 이용해 랜덤한 값을 입력 받음 // int
		//그값이 정수형일때는 계속해서 누적해서 합을 구함
		//프로그램이 종료되면 안됨 // -예외처리를 해라
		//단, exit라는 값을 입력하면 프로그램은 종료가 된다. 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			String inputData = sc.nextLine();// new String("");
			if(inputData.toUpperCase().equals( "exit".toUpperCase() ) ) { //참조형 데이터 == 참조비교
				//Upper = 대문자
				break;
			}
			try {
				
			sum =+ sum + Integer.parseInt(inputData); // 데이터의 누적
			}catch (Exception e) {
				
				System.err.println("정수형 데이터가 입력이 안됨.");
			}
			
			System.out.println("누적 된 합 : " + sum);
			
		}
	}
}
