package pack03_Interface;

public class MyClassMain {
	public static void main(String[] args) {
		System.out.println("1.case");
		//MyClass에 멤버에 RemoteControl rc = new Televison()으로 생성 해 놨기 때문에
		//rc에 접근해서 사용하면 RemoteControl에 있는 기능중 Television에 Override된 부분들을 사용 가능하다.
		MyClass myClass1 = new MyClass(); //생성자를 이용해서 생성함
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2.case");
		//new 라는 키워드를 통해서 Audio를 넘기게 되면
		//RemoteControl rc = new Audio();
		MyClass myClass2 = new MyClass(new Audio());
		
		//myClass2.rc
		//객체 
		//myClass1.aaa = 0;
		System.out.println("3.case");
		MyClass myClass3 = new MyClass();//rc = tv;
		myClass3.methodA();
		myClass3.rc.turnOn();
		System.out.println("4.case 사용 빈도가 그나마 높은편");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Audio());
		myClass4.methodB(new Television());
		//Interface에는 Interface를 이용해서 만든 객체를
		//담아서 사용할수가있다.
	}
}
