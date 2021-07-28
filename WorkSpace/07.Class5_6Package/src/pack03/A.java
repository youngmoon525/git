package pack03;
	//같은 패키지 내에 같은 이름의 Class A가 존재 하지만.
	//패키지 경로가 다르기 때문에 고유한 A가 된다.
	//pack01.A != pack03.A 
public class A {
	A a1 = new A(true); // public
	A a2 = new A(0);	// default
	A a3 = new A("문자열"); // private
	//생성자	//
	public A(boolean b) {}
	A(int b){}
	//내부에서는 접근이 가능
	private A(String s) {}
}
