package pack02_Method2;

public class Ex01_Method01 {
	public static void main(String[] args) {
		//main메소드 - static 메모리에 먼저 올라감
		//String[] args 입력을 받음  
		//main메소드가 실행될때 외부에서 입력을 받을수있는 처리
		//버전을 관리 하기 위함
		//관리자 인지 일반 사용자인지를 구별하기 위함
		//args= "S"  if(args[0]) { ----관리자모드로 실행  }else{ 일반 사용자 모드로 실행 }
		//javafx , swing 
		//System.out.println(args[0]);
		int afd = 0 ;
		int bad = 0 ;
		getSum1(afd, bad);
		getSum2(1, 3);
	}
	
	public static void getSum1(int a , int b) {
		int sum = a + b;
		System.out.println("첫 번째 정수 : " + a);
		System.out.println("두 번째 정수 : " + b);
		System.out.println("두 정수의 합 : " + sum);
		//void 형태에서는 사용불가 return sum;
	}
	
	private static void getSum2(int a , int b) {
		int sum = a + b;
		System.out.println("첫 번째 정수 : " + a);
		System.out.println("두 번째 정수 : " + b);
		System.out.println("두 정수의 합 : " + sum);
	}
	
	//메소드
	//-클래스가 가지고 있는 행위정보(동작,기능,기술)를 표현하는것 ->함수(function)
	//-동작(행위,기능)을 만들어 놓고 필요할 때 사용하기 위해서 호출(Calling)
	//-캡슐화의 원칙 : 클래스안에 메소드를 구현 , 하나의 클래스안에는 여러개의 메소드가 존재
	
	//클래스 안에는 무엇이 들어가는가?
	//	- 상태정보 : 멤버 변수(필드) ▶ DTO (Data Transfer Object) Class , VO(Value Object) -생성자가 없음
	//		//생성자와 상태정보를 가지는 변수 외에는 다른 메소드를 가지지 않음
			//ex)HumanDTO=> String name , int age , int height ... + 생성자 
	//	- 행위정보 : 멤버 메소드 ▶ DAO (Data Acesess Object) 기능을 담당하는 메소드들을
	//			따로 정의해서 분류 해놓음
			//ex)eat() 먹는다 , sleep() 잔다
	// 메소드의 형식(메소드를 만드는 방법)
	//①		②   ③     ④         ⑤ 	 
	//public static void getSum(int a , int b ) { ▶프로토타입 : 머리 , 선언
	//	~메소드의 동작 구현 ~ ▶바디 : 구현
	// ⑥
	// return;
	//}
	//① 접근 제어자 : public(접근허용) , private(정보 은닉 : 내부에서만 허용)
	//	, 아무것도 안쓰면 default , protected(보류)
	//② 한정자 : static(자동으로 메모리에 생성) , 생략(객체를 생성해서 접근) ,final(재정의 불가)
	//③ 리턴타입(반환값) : 메소드가 동작후에 최종적으로 만들어낸 결과값의 데이터 타입
	//		- 리턴을 하지 않을 경우 : void ▶ 메소드 내부에 return 문이 올 수 없음
	//		- 리턴을 하는 경우 : 리턴되는 데이터 타입 ▶ 메소드 내부에 return 문이 반드시 와야함
	//		※(리턴타입과 반환값은 반드시 일치 되어야함) ex)int getSum(){ return int ; }
	//④ 메소드 명(이름) : 소문자로 시작 , 키워드는 사용불가(if,break 등등) ,의미 있게 작성
	//						변수명 작성규칙과 동일 
	//⑤ 매개변수 리스트
	//		- 메소드가 동작하기 위해서 외부로부터 입력(전달)되는 데이터
	//		- 인수 , 인자 , parameter 
	//⑥ return 문 : 메소드가 동작을 완료한 후 , 결과값을 호출한 쪽으로 넘기는 키워드
	//실인수(호출,메소드를 사용하는 부분)와 기인수(정의,실제 메소드 부분) 매개변수 전달 규칙
	// Parameter Passing Rule
	//	-실인수와 가인수의 매개변수 개수가 같아야 한다.※
	//	-실인수와 가인수의 매개변수 타입이 같아야 한다.※
	//	-실인수와 가인수의 이름은 같아도 되고 달라도 된다.
	
	

}


