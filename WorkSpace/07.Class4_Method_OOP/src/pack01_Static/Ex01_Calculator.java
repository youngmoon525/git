package pack01_Static;

public class Ex01_Calculator {
		 static double pi = 3.14 ;
	public static void main(String[] args) {
		//static Class에 접근하면 무조건 메모리에 먼저 올라가는 형태
		//static <-> static 
		//객체를 생성 후 접근 가능
		//static을 남발하면 메모리의 소모가 커져서 프로그램 자체가 느려짐
		//a= 0 ;
		///run();
		//stop();
		System.out.println(plus(5 , 2));
	
	}
	
	static int plus(int x , int y) {
		System.out.println("plus 메소드 호출 됨");
		int result = x + y; 
		return result ;
		
	}
	
	static int minus(int x , int y) {
		System.out.println("minus 메소드 호출 됨");
		int result = x - y; 
		return result ;
	}
	 void run() {
		System.out.println("차가 달립니다.");
	}
	 void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
}
