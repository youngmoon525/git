package pack06_Override;
//비행기의 기본 기능을 가진 비행기 부모 클래스
public class Airplane {
	public void land() {
		System.out.println("착륙 합니다 .");
	}
	public void fly() {
		System.out.println("일반 비행을 합니다.");
	}
	public void takeOff() {
		System.out.println("이륙을 합니다.");
	}
}
