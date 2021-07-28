package pack07_Protected1;

public class B {
	public void method() {
		A a = new A();//인스턴스화 됨
		a.field = "value"; //필드 접근도 됨
		a.method(); //메소드 접근 됨
		//protected 같은 패키지 내에 있으면 자유롭게 접근이 가능함
		//다른 패키지에서 해당 클래스에 접근 하고 싶으면 상속을 강제 한다.
	}
}
