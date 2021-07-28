package pack03_Interface;

public class MyClass {
	//
	//멤버로 만듬
	RemoteControl rc = new Television();
	int aaa ; 
	public MyClass() {

	}
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//오디오에 있는 기능을 사용
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		System.out.println("MethodB");
		rc.turnOff();
		rc.turnOn();
	}
	
}
