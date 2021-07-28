package pack02_TryCatch;

import java.util.Scanner;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//에러의 종류
		//1.하드웨어적 에러 : 치명적인 에러 ▶ 프로그램을 실행 할수 없거나 실행 안됨
		//2.소프트웨어적인 에러 : 가벼운 에러 ▶ 예외(Exception)
		//	-SunMicroSystem(Oracle)에서는 모든 예외들을 클래스로 만들어서 제공한다.
		// 예) ArrayIndexOutBoundsException : 잘못된 index에 접근 중이다.
		//[예외 클래스 종류 ]
		//1.미확인 예외(실행 예외)
		//	-프로그램을 실행 해봐야 예외가 발생했는지 알 수 있다.
		//  -프로그래머의 실수에 의해 발생 : 디버깅(오류수정) 작업이 쉽다.
		//   int aa 
		//2.확인 예외
		//	-프로그램 작성중(코딩)에 반드시 예외를 해야되는 상황
		//   Parsing , Casting , Array index 사용 시 
		// try {
		//	예외가 발생할 가능성이 있는 코드(정상코드);
		// arr[3] . syso(arr[4]);
		// } catch (Exception 처리 종류 =  클래스 ){
		
		//} finally {
		//	생략이 가능한 블럭 
		//  무조건 실행이 되야하는 코드 
		//}
//		try {
//			int num = Integer.parseInt("aaaa");
//		}catch (Exception e){
//			//개발자가 오류나는 상황을 회피 (예외) 하기 위해
//			//try catch 썼기때문에 console창에 에러코드가 표시가 안됨
//			System.out.println("에러남");
//
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 ."); // 금액은 반드시 정수형
		String inputData = sc.nextLine();
		//반드시 숫자형 데이터가 들어와야하는 상황에서 사용 
		int money = 0;
		try {
			//lv(지역변수) 
			//지역 {} 블럭킹
			//class를 제외한 블럭킹내부에서 선언된 변수들은 전부다 lv
			money = Integer.parseInt(inputData);
			System.out.println("금액이 입력됨 : "+money);
		
		}catch (Exception e) {
			//System.out.println(money);
			System.out.println("돈이 아닌 다른 데이터가 들어 왔습니다.");
			System.out.println(inputData);
		}finally {
			//무조건 실행이 되어야하는 문장이 들어가는 부분
			//money 라는 변수는 사용이 불가 
			System.out.println(money);
			System.out.println("안녕히 가세요.");
		}
			
		
		
	}//main money 변수 
}
