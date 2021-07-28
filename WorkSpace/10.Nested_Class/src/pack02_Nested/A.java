package pack02_Nested;

public class A {
//	void method() {
//		String field2 ; //lv 메소드 안에 있기때문
//	}
	
	String field = "A의 필드 입니다."; //iv Class의 블럭킹 내부에서 선언됨
	void method() {
		System.out.println("A에 있는 메소드입니다.");
		int a; //method의 lv---->지역변수
	}
	//---------------------인스턴스 멤버-------------------A가 객체화 되어야만 접근이 가능//
	
	static String field2 = "A의 필드2 입니다.";
	static void method2() {
		System.out.println("A에 있는 메소드2입니다.");
		int a ; //method2의 lv---->지역(블럭킹)변수
	}
	//---------------------정적(static) 멤버-------A가 객체화 되지 않아도 A에 접근해서 사용이 가능//
	
	//인스턴스 객체(Class)
	class Nested{
		String field3 = "이너클래스의 필드 입니다.";
		String field ;
		void method() {
			System.out.println(field3);
			System.out.println(field);
		}
		void print() {
			System.out.println(this.field + "this.field");//?
			this.method();//?
			System.out.println(A.this.field + "A.this.field");//?
			A.this.method();//?
		}
		
	}//Class Nes
	
}//Class A
