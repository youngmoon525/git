package pack01_Variable;

public class Ex02_Variable02 {
	public static void main(String[] args) {
		//정수형 변수 a와 b를 선언과 동시에 값을 할당
		//(리터럴,초기화 , a=10 , b=20)하고 출력하시오.
		
		//a와 b에 각각 30 , 40으로 값을 재할당하고 
		//출력하시오. 
		int a = 10 , b = 20 ;
		//System.out.println("a의 값 : " + a);
		//System.out.println("b의 값 : " + b);
		a = 30;
		b = 40;
		System.out.println("재할당 된 a의 값은" + a + b);
		//System.out.println("재할당 된 b의 값은" + b);
		// 1 + 1 = 2 Casting 연결 
		// 문자열 + 문자열 = 문자열문자열
		// String " (a의 값 : ) + a " 
		// " (재할당 된 a의 값은  + a  + b "
		
		int x = 9;
		int y = 5;
		//문제 . Console창에 결과 출력 
		//결과값 x : 3 , y : 5 
		System.out.println("x : " + x + " , y : " + y);
		
	}
}
