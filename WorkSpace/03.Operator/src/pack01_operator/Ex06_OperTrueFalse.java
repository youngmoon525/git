package pack01_operator;

public class Ex06_OperTrueFalse {
	public static void main(String[] args) {
		//논리적인 계산 , 비교
		//==같은지의 비교		? 참인지에 대한 값 : 거짓일때의 값
		//을 리턴해준다
//		int a = 10;
//		String result = (a == 10 ? "맞다" : "틀리다" );
//		//a==10을 비교한다 true,false 참인지 거짓인지
//		//a==10 true ? "true일때의 리턴값" : false일때의 리턴값
//		System.out.println(result);
//		//if문의 구조와 같습니다.
//		result = (a != 10 ? "맞다" : "틀리다" );
//		//a!= 10 a와10이 다르냐.
//		//
//		System.out.println(result);
		//비교 연산자 ▶ 조건문에 굉장히 많이 사용됨
		//연산의 결과는 항상 true , false
		//수학 관계연산자 > , < 크다 작다 , 미만 초과를 비교
		//a =b , : 수학에서는 같다라는 의미이지만 프로그래밍에서는 할당이다.
		//프로그래밍에서 같다라는것은 a==b
		//다르다(같지 않다) !=
//		//<= , >= 이상과 이하
//		System.out.println(10 > 5); // 10이 5보다 크기때문에 true
//		System.out.println(10 >= 5);
//		System.out.println(10 < 5); //10보다 5가 큰지에 대한 질문을 던짐
//		System.out.println(10 <= 5); //10보다 5가 큰지에 대한 질문을 던짐
//		System.out.println(10 == 5);//false
//		System.out.println(10 != 5);//true
		//논리 연산자 : 여러개의 조건을 파단▶
		//연산의 결과는 true , false 반환
		//AND , OR 연산이 나옴
		//조건 A && 조건 B : 조건 A도 참이고 조건 B도 참일경우 ->참으로출력
		// 1      *    1 = 1 둘다 true 1   *    0  = 0 //모든 조건을 만족해야함
		
		//조건 A || 조건 B : 조건 A 또는 B중에 하나라도 참일경우 참임
		// 1     +      1 = 1 둘다 true 1 + 0 = 1;하나의 조건이라도 만족하면 참
		System.out.println(10 > 5 && 20 > 5);//1 * 1 = 1 true
		System.out.println(10 > 5 && 20 < 5);//1 * 0 = 0 false
		System.out.println(5 > 10 && 20 > 5);//0 * 1 = 0 false
		System.out.println(5 > 10 && 5 > 20);//0 * 0 = 0 true
		//id , pw 확인할때 login
		System.out.println("=============================");
		
		System.out.println(10 > 5 || 20 > 5);//true 1 + 1 = 1;
		System.out.println(10 > 5 || 20 < 5);//true 1 + 0 = 1;
		System.out.println(10 < 5 || 20 < 5);//true 0 + 0 = 0;
		//조건1(0 ) +  조건2(0) 
		//문제 10 5      20 5 OR연산자를 이용해서 false가 나오게 출력하시오
		
		
		
	}
}
