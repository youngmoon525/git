package pack09_abs;
//abstract 키워를 사용한 경우 추상 클래스라고 인식이 된다.
// class 바로 앞에 붙어서 사용 됨
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
