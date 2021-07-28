package pack01_Extends;

public class Extends_Main {
	public static void main(String[] args) {
		Prent_Class pc = new Prent_Class();//인스턴스화(객체화) 객체 생성
		System.out.println("Parent : " + pc.prent_field);//부모클래스의 iv(필드)를 출력
		pc.prentMethod();
		
		Child_Class cc = new Child_Class();//인스턴스화(객체화) 객체 생성
		System.out.println("Child 1: " + cc.child_field); //자식 클래스에서 만들어놓은 필드
		System.out.println("Child 2: " + cc.prent_field); //부모 클래스에서 상속받은 field
		cc.childMethod1();//객체에 접근해서 childMethod1이라는 메소드를 호출함
		cc.childMethod2();//객체에 접근해서 childMethod2이라는 메소드를 호출함
		cc.prentMethod();//상속 ※ 부모클래스에서 미리 정의해놓은 기능을 전부 상속받아 사용이 가능함.
	}
}
