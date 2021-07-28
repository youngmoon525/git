package pack01_Static;

public class Ex03_Static1 {
	int iv1 = 0;
	public static void main(String[] args) {
		display01();
		//인스턴스화 객체화 객체를 만드는 행위
		Ex03_Static1 es = new Ex03_Static1();
		es.display02();
		//클래스 내부를 멤버라고 하는데 멤버도 두개의 종류로 나누어짐.
		//1.인스턴스 멤버
		//	-인스턴스 멤버는 클래스를 객체화 (인스턴스화) 시켜야만 사용할수있는 멤버
		//2.정적 멤버(static)
		//	-메소드나 변수(필드) 앞에 static이라는 키워드가 붙으면 정적 멤버로 써
		//	-인스턴스화 하지 않고 객체에 접근만 하면 바로 사용 가능함.
		// 인스턴스 멤버 vs 정적 멤버
		// 인스턴스 멤버는 프로그램이 시작 되고 해당하는 스택에 이동을 해야 사용을 할수있음(인스턴스화)
		//	정적 멤버는 프로그램 시작전에 먼저 메모리에 할당 , 프로그램 종료 시 소멸
		
		
	}//main
	//접근 제어자 
	public static void display01() {
		System.out.println("display01 이 호출됨");
	}
	public void display02() {
		System.out.println("display02 호출됨");
	}
	static {
		System.out.println("static이 초기화 됨");
	}
	
}//Class
