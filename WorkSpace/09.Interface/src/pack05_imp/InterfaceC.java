package pack05_imp;

//interface에서의 implement기능상속은 extends를 사용함
//기본적으로 다중상속이 안되는 것은 자바의 class
public interface InterfaceC extends InterfaceA , InterfaceB {
	public void methodC();
}
