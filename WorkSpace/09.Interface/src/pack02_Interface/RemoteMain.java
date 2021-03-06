package pack02_Interface;

public class RemoteMain {
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.turnOff();
		audio.turnOn();
		audio.setVolume(20); // 설계도를 벗어난 개발 MAX_VOLUME = 10 , MIN = 0 
		
		//인터페이스의 장점 ( 다형성 )
		RemoteControl rc ; //선언만 해둠 
		rc = new Television(); //형 변 환 
		rc.turnOff();
		rc.turnOn();
		rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(10);

		
		//인터페이스를 이용해서 (implements) 만든 객체는 다시 인터페이스에 담아서 사용할수있다.(형변환)
		//※인터페이스에 구현 해놓지 않은 메소드(기능)들은 사용할수없음(다운캐스팅)
	}
}
