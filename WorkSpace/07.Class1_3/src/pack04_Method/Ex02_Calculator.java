package pack04_Method;

public class Ex02_Calculator {
	//메소드를 만드 는 부분
	//메소드 = 클래스 내부에 존재함
	//리턴타입과 파라메터(인자)값이 없는 powerOn메소드 
	void powerOn() {
		System.out.println("계산기의 전원을 켭니다.");
	}
	//리턴타입이 있는 메소드
	//리턴타입이 있는 경우에는 리턴타입에 해당하는 값을 return이라는 키워드를 사용하여
	//값을 반환 해줘야함
	int plus(int x , int y) {
		int result = x + y ;
		return result;
		//return 0; 
		//반드시 리턴타입이 있는경우에는 리턴타입에 해당하는 값을 return
	}
	//리턴타입이 double인 divide 라는 메소드를 만들고
	//x / y 의 결과를 double형태로 출력하세요.
//	void divide() {
//		System.out.println("devide");
//	}
	//2.double divide(int x , int y){
	//	Casting?
	//}
	//
	//①리턴타입 ②메소드명 (③ 인자값 //인자값타입 인자값 명 int x , int y  )
	//임자값의 갯수는 제한이 없으나 여러개를 사용할때는 ,구분
	double divide (double x , double y) {
		double result = x / y ;
		return result;
	}
	//메소드 오버로딩
	double divide(int x , int y) {
		double result = (double) x / (double) y ; // 소숫점 강제 버림
		return result;
	}
	//최상위 Object  ..
	//Object return 
	//Android
	//Button buttonevent(){
	//	return button;
	//	?  }
	//Widget WidgetEvent(){
	
	//return Widget
	
	// body bodyevent(){
		//return body
	//}
}//class
