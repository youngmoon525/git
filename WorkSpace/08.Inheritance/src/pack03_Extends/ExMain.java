package pack03_Extends;

public class ExMain {
	public static void main(String[] args) {
		//객체 생성을 하나만 해서.
		//뺄셈,덧셈(SuperClass) => 곱셈,나누기 등 등의 기능(SubClass)을 모두 할수있게 구현을 하세요.
//		SuperClass sc = new SuperClass();
//		sc.sum(10, 20);
//		sc.minus(10, 20);
		SubClass scc = new SubClass();//슈퍼 클래스에서 이미 상속을 받음(sum,minus)기능을 상속받음
		//상속을 받았다 = SubClass(기능) + SuperClass(기능)
		System.out.println(scc.div(10, 20));
		System.out.println(scc.div_re(20, 30));
		System.out.println(scc.mul(10, 20));
		System.out.println(scc.sum(10, 10)); // 10 + 10 + 3
		System.out.println(scc.minus(10, 10));
		//1. 상속 방법 : class 클래스(자식) extends 클래스(부모) ex) SubClass extends SuperClass
		//2. 자식 클래스는 부모 클래스로부터 메소드와 필드를 물려받아 사용한다.(멤버)
		//※(부모클래스는 자식클래스의 기능을 사용할수없다. )
		//3. 서로 상속을 하지 않는것을 관례로 한다. (SuperClass + SubClass) = Sub
		//4.※ 자식 클래스는 여러 부모 클래스로부터 상속 받지 못한다. 즉 , 단일 상속만 가능하다.
		//5. 자식 클래스가 더 다양한 기능이 가능하므로 자식 클래스로 인스터스를 생성하는 것이 가장 효율적이다.
		//Super의 기능 + Sub의 기능 = Sub클래스만 인스턴스화 하는게 효율적
	}
}
