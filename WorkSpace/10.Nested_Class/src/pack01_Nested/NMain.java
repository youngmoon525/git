package pack01_Nested;

public class NMain {
	public static void main(String[] args) {
		A a = new A(); //인스턴스화
		a.afield = 10; //필드
		System.out.println(a.afield);
		//----일반적인 객체 사용 방법
		//인스턴스 멤버 객체(클래스) 생성
		//인스턴스 멤버에 접근 하기 위해서는 인스턴스화가 필요하다.
		A.B b = a.new B(); //A라는 클래스가 객체화 되어있지않으면 B에 접근을 할수가없음
		b.bfield = 20;
		System.out.println(b.bfield);
		b.method1();
		
		//정적 멤버 클래스 생성 (메모리에 먼저 있기때문에 별도의 인스턴스화가 필요없다)
		A.C c = new A.C(); // static이기때문에 A에 접근하면 반드시 있는 class
		c.cfield = 30;
		c.method1();
		System.out.println(c.cfield);
		
		a.method();
	}
}
