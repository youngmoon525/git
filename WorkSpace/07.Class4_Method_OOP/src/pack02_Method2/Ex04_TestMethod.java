package pack02_Method2;

import java.util.Scanner;

public class Ex04_TestMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String inputData = null;

		int x = 0, y = 0;
		while (true) {
			try {
				if (x < 1) {
					System.out.println("첫번째 숫자를 입력해주세요.");
					x = Integer.parseInt(sc.nextLine());
				}
				if (y < 1) {
					System.out.println("두번째 숫자를 입력해주세요.");
					y = Integer.parseInt(sc.nextLine());
				}
				if(x >= y) {
					x= 0; // 상위에 있는 if문을 다시 입력받게끔 만듬
					y= 0;
					throw new Exception();
					
					//new Exception이 나오게끔 처리
					//x y = 0;
				}
				//조건문 하나 추가
				break;
			} catch (Exception e) {
				System.err.println("올바르지 않은 입력!");
			}
		}//사용자 숫자 입력 완료
		System.out.println("x : "+  x + "y : " + y);

		sc.close();
		// int cnt; // while문에 두수를 입력받으면 증가가 될 변수(사용해도되고 안해도됨)
		// while(true)
		// {
		// try{} catch(Exception e) { }
		// }두 정수를 입력받는 반복문

		// 메소드를 호출해서 처리할 부분
		 int result = methodName(x , y) ;
		 Ex04_TestMethod et = new Ex04_TestMethod();
		 et.getSum( x ,  y);//? 인스턴스화 된 객체에서만 접근이 가능하기 때문
		 //./System.out.println("두수 사이의 값은 : "  + result);
		 
		 
		 
	}//main
	
	public static int methodName(int x , int y) {
		int result = 0 ;
		for (int i = (x+1); i < y; i++) {
			result += i;
		}
		System.out.println("두수 사이의 값의 합 : "  + result);
		return result;
		//결과값이 mainMethod에서 필요한경우에는 return을 받는다.
		//!= 결과값을 그냥 출력만하고 끝내는 경우에는 void를 사용한다.
	}//methodName
	
	// 인스턴스화를 하지 않고(=static) 접근이 가능한 메소드를 만드시오.
	// 1.메소드의 기능은 두가지수(정수)를 입력받아(=?) 정수 사이의 합을 구하는 메소드
	// ex) x = 3 y =10 ( 4 , 5 , 6 ,7 , 8 , 9) = ?
	// 단 x 보다 y값이 작거나 같으면 다시 입력을 받게끔 하시오.
	// 그리고 문자열이 입력 된 경우에는 다시 입력을 받는다.
	// for( int i = ? ;

	// 인스턴스화를 사용하여 객체를 생성하고(=!static) 접근이 가능한 메소드를 만드시오.
	// 2.메소드의 기능은 두가지수(정수)를 입력받아(=인지값이 있는) 두 수의 합을 구하는 메소드
	// ex) x =3 , y= 10 , 13을 출력
	public void getSum(int x , int y) {
		System.out.println("x + y = " + (x + y));
	}
	// 두문제 전부 return타입의 경우는 자유롭게 구현 , 메소드 명도 자유롭게 구현
	// 접근제어자는 public으로 통일한다.
}
