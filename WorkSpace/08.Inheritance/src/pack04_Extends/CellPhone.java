package pack04_Extends;

public class CellPhone {
	// 필드
	String model; // 휴대폰의 기종
	String color; // 색상

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다. 테스트중입니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
