package pack01_Extends;

//extends아직 사용하지 않았기 때문에 자식 클래스가 아니라 Child_Class
//public class Child_Class <-이부분에 상속을 선언함 -> {
//상속의 키워드는 크게 impleaments 와 extends가 있다.
//extends 키워드를 사용하게 되면 부모클래스를 상속받는 다는것을 의미함.
//public class Child_Class <-extends 물려받을 부모 클래스 -> {
//public class Child_Class <-extends Prent_Class -> {
//Child_Class 는 Prent_Class를 상속 받는 다는 것을 의미함.
public class Child_Class extends Prent_Class {
	String child_field = "자식 클래스의 필드입니다.";
	public void childMethod1() {
		System.out.println("자식 클래스의 메소드1");
	}
	public void childMethod2() {
		System.out.println("자식 클래스의 메소드2");
	}
}
