package pack02_Nested;

public class Amain {
	public static void main(String[] args) {
//		//인스턴스 맴버의 접근
//		A a = new A(); //객체 생성
//		System.out.println(a.field);
//		a.method();
		
		//정적 멤버의 접근
		//System.out.println(A.field2);
		//A.method2();
		
		A a = new A();//인스턴스 객체(이너클래스)를 사용하기 위한 객체 생성
		A.Nested nested = a.new Nested();
		//nested.method();
		nested.print();
		
		
	}
}
