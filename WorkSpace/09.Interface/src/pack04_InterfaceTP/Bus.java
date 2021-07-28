package pack04_InterfaceTP;

public class Bus implements Vehicle{
	//인터페이스에서 강제 된 메소드를 재정의 한곳
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	//버스에서 필요한 메소드를 만든 부분
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
}
