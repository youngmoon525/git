package pack03_Extends;


//extends를 사용 전에는 각각 SuperClass 와 SubClass 별도의 Class이다.
//extends를 사용해서 상속을 받게 되면 SuperClass에서 구현해놓은 기능들을
//전부 사용할수있게됨.
//부모클래스(더 많은 기능을 가진 클래스)를 다른 의미에서 SuperClass라고 한다.
public class SubClass extends SuperClass{
	
	public int mul(int a , int b) {
		return (a*b); 
	}
	public int div(int a , int b) {
		return (a/b); 
	}
	public int div_re(int a , int b) {
		return (a%b); 
	}
	//Override = 재정의
	//부모클래스로 부터 물려받은 메소드를 자식클래스에서 다른 기능으로 재정의 하는것을 의미함
	//@어노테이션 //자바에서 프로그램에서 인식하는 주석
	//@Override == 
	//
	@Override
	public int sum(int a, int b) {
		
		//return super.sum(a, b); super.sum < - 부모클래스에 있는 기능을 그냥 사용하겠다.
		return a + b + 3; //부모클래스에 기능을 그냥 사용하는것이아니라 다른 기능으로 사용하겠다.
	}
}
