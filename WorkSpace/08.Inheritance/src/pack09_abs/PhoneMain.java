package pack09_abs;

public class PhoneMain {
	public static void main(String[] args) {
//		Phone ph = new Phone() {
//		
//		};
		SmartPhone sp = new SmartPhone("홍길동"); //휴대폰이라는 단말기에는 반드시 주인이 있도록
												  //생성하게끔 강제했음 
		System.out.println(sp.owner);
//		sp.turnOn();
//		sp.turnOff();
		sp.internetOn();
	}
}
