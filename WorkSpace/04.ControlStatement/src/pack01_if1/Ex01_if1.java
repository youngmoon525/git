package pack01_if1;

public class Ex01_if1 {
	public static void main(String[] args) {
		int score = 90 ; //변수타입 변수명 = 값 을 이용해서 초기화
		//if ( 조건식 ) { 내용부 조건식이 true일때 실행할 내용부 }
		//조건식은 반드시 true , false 값이 나올수 있어야함
//		if(score >= 90) {
//			System.out.println("점수가 90보다 큽니다.(이상입니다)");
//		}//if
//		if(score > 90) {
//			System.out.println("점수가 90보다 큽니다.(초과입니다)");
//		}
//		//if문 안에 들어갈 조건식에 따라서 프로그램의 결과가 달라진다.
//		조건문 흐름을 제어한다.
		//프로그램의 int형 데이터가 짝수인지 홀수인지 판단하는 프로그램
		int a = 9;
		if(a % 2 == 0) { //a를 2로 나눈 나머지 값이 0과 같다. : 짝수
			System.out.println("입력받은 값은 " + a + "입니다.");
			System.out.println("입력받은 값은 짝수 입니다.");
		}
		if(a % 2 == 1) { // if(a % 2 != 0 ) 
			System.out.println("입력받은 값은 " + a + "입니다.");
			System.out.println("입력받은 값은 홀수 입니다.");
		}
		if(true) {
			System.out.println("실행되는 문장이 한줄");
		}
		
		//홀수일때도 어떤 내용이 출력 될 수 있는 프로그램을 작성해보세요
		
		
		
		
	}//main
}//class
