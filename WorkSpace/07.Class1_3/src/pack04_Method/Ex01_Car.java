package pack04_Method;

public class Ex01_Car {
	int speed; // iv
	//return 타입 
	//1.void - 아무런 return이 없는 경우 사용
	//2.그외 - 어떠한 return값이 있는 경우 사용 (ex.int , double 모든 데이터타입을
	//리턴 받을 수 있음)
	//메소드의 기본 형태 - 리턴타입 메소드이름 (String inpudData , ) { 메소드에서 실행할 내용}
	//메소드의 호출 = 메소드이름(inputData )
	//메소드의 접근은 일반적으로 객체를 생성 한 후 객체 내부의 있는 메소드를 실행하는 형태
	//메소드는 일반적으로 메소드 내부에 메소드를 생성하거나 선언할수 없음.
	//메소드는 클래스 내부에 있는 것
	//리턴타입이 없는경우 void 메소드이름 run (인자값이 필요하다면 인자값 추가)
	//{
	//		메소드의 실행부 (개발자가 실제 메소드가 호출되었을때 작성할 코드부)
	//}
	void run() {
		//메소드 실행블럭
		speed = 100 ;
		System.out.println(speed + "run 메소드가 실행됨");
	}//run
	//
	void breakCar() {
		//50%
		//String aa = "stop";
		speed = 0;
		System.out.println(speed + "stop");
	}
	void boost(int plusSpeed) {
		speed =speed + plusSpeed;
		System.out.println(speed + " 속도가 올라감 ");
	}
	//리턴타입 메소드명 () {
	//		메소드 실행부 (코드작성)
	//}

	void speedDown(int downSpeed) {
		if(downSpeed > 0 ) {
			speed = speed - downSpeed;
		}else {
			speed = speed - 30;
		}
	
		System.out.println(speed + " 속도 줄어드는 메소드");
	}
	//			 boost(int plusSpeed)
	//호출 	     boost(500);
	public static void main(String[] args) {
		Ex01_Car myCar = new Ex01_Car();//인스턴스화
		myCar.run();
		myCar.breakCar();
		myCar.boost(500);
		myCar.speedDown(50);
		//1.myCar라는 객체에 breakCar라는 메소드를 만들고 
		//	breakCar라는 메소드를 호출 시 stop이라는 문자열이 출력되고 speed가 0
		//2.speedDown이라는 void형태의 메소드를 만들고
		//	2-1.해당 메소드를 호출 시 지금 속도(Speed)에서 -30만큼이 
		//되고 현재속도를 출력하는 메소드를 작성.
		//	2-2. 단 사용자가 어떤 값을 입력하면 그값이 -되는 메소드를 만드세요.
		
	}//main
}//Ex01_Car Class
