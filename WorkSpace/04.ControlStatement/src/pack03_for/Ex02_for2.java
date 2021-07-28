package pack03_for;

import java.util.Scanner;

//Class
public class Ex02_for2 {
	//iv , 전역변수 , 인스턴스 변수
	String test = "";
//method	
	public static void main(String[] args) {
		//중첩 for문
		//for , 1차원  , 중첩 2,3 - x 4, for 문 4개정도 
		//for문을 이용해서 2단을 출력해보세요
		//(방법 상관 없음)

//		for(int i = 1 ; i<10; i++) {
//			System.out.println("3 * " + i + " = " +  (i * 3) );
//			//String + 어떤변수는 = String
//			//String + (     ) = 
//		}
		//구구단 2 ~9단 출력
//		for(int i = 1 ; i<10; i++) {
//			//i 1 ~ 9 증가를 하는 부분 , Count 9
//			System.out.println("i의 값 " + i);
//			for(int j = 2 ; j<10; j++) {
//			System.out.println(j + " * " + i + " = " + (i * j) + "\t");
//				//i 1   j = 1........9  i가 1일때 j는 9번 반복 
//				//i 2   j = 1........9  i가 2일때 j는 9번 반복  
//			}
//		}
//		for(int i = 2 ; i < 10 ; i ++) {
//			//2*1 ~ 2* 9 
//			//3*1 ~ 3* 9 
//			//9 ~
//			System.out.println(i);
//			for(int j = 1 ; j<10 ; j ++ ) {
//				System.out.println(i + " * " +  j + "="  +  (i*j));
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		String dan = sc.nextLine(); // 정수를 입력받는다.
		int num = Integer.parseInt(dan);
		for (int i = 2; i <= num; i++) {
			System.out.println(i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		//그리고 입력받은 정수 만큼의 구구단을 출력하세요.
		//ex ) dan = 20 => 20단까지 출력
		//ex ) dan = 17 => 17단까지 출력
		//1.String - > int 
		
	}
	

}
