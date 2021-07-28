package pack03;

public class B {
	//필드 
	A a1 = new A(true);//A클래스에 생성자 메소드의 접근 제한자가 public 
	A a2 = new A(0); //A클레스에 생성자 메소드의 접근 제한자가 default (같은 패키지 내에서는 접근이 가능)
	//A a3 = new A("문자열"); //접근이 불가능 private 접근 제한자를 사용하여 외부에서는 접근이 불가능하다.
							//getter & setter 를 사용함
}
