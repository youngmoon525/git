package pack06_Override;

//비행기의 기본 기능들을 상속 받음
public class SuperSonicAirplane extends Airplane {
	public static final int NOMAL = 1; // final 상수를 사용시 변수의
	// 이름은 전부 대문자로 한다(관례)
	public static final int SUPERSONIC = 2;// 비행기의 기능을
	// 일반 비행과 음속비행으로 나눔

	public int flyMode = NOMAL; // 초기에는 무조건 일반 비행을 시작함

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("음속으로 비행");
		} else {
			super.fly();
		}

	}
}
