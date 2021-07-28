package pack01_operator;

public class Ex04_Oper4 {
	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		
		int result1 = var1 + var2;
		System.out.println("result1 : " + result1);
		int result2 = var1 - var2;
		System.out.println("result2 : " + result2);
		int result3 = var1 * var2;
		System.out.println("result3 : " + result3);
		int result4 = var1 / var2;
		System.out.println("result4 : " + result4);
		//사칙연산 결과는 같다. 
		//결과값이 (var1/ var2) 2.5 가 나오게 올바른 계산이 되게끔 캐스팅해서
		//출력하기
		System.out.println(5.0/2);
		// double , float  +  int
		// 캐스팅이 자동으로 됨을 인지
		double result6 = (double) var1/var2;
		System.out.println(result6);
		
		int result7 = var1 % var2 ;
		//짝수인지 홀수인지에 대한 판단
		//%2 == 0 짝수
		//%2 == 1 홀수
		
		System.out.println(result7);
	}
}
