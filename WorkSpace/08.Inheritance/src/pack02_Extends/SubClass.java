package pack02_Extends;


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
}
