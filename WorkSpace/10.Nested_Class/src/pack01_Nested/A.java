package pack01_Nested;

public class A {
	//생성자 메소드 A의 
	int afield ;  //iv
	static int afield2; //정적 멤버
	public A() {
		int aa ; //lv
		System.out.println("A라는 객체가 생성됨");
	}
	//인스턴스 멤버 클래스 
	public class B{
		int bfield ; //B의 iv 
		//B의 생성자 메소드
		public B() {
			System.out.println("B 객체가 생성됨");
		}
		void method1() {System.out.println("BClass의 메소드 입니다."); }
	}//class B
	
	//정적 멤버 클래스 (static 키워드가 붙었기 때문에 정적 멤버임)
	public static class C{
		
		int cfield; // C의 iv
		public C() { //C의 생성자 메소드
			System.out.println("C 객체가 생성 됨");
		}
		//C의 인스턴스 메소드
		void method1() { System.out.println("CClass의 메소드 입니다.");}
	}//class C
	
	//로컬 클래스 //
	//A의 인스턴스 메소드
	void method() {
		//메소드 //lv (메소드안에서만 사용이가능)
		//int a ; 
		class D{
			int dfield;
			public D() {
				System.out.println("D객체가 생성됨");
				
			}
			void method1() {System.out.println("DClass의 메소드 입니다.");}
		}
		D d = new D(); //로컬 클래스이기때문에 메소드 내부에서 생성
		d.dfield = 20;
		System.out.println(d.dfield);
		d.method1();
	}//d라는 클래스는 블럭킹이 끝남과 동시에 소멸
	
}//class A
