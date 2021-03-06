package pack06_Override;

public class AirMain {
	public static void main(String[] args) {
		Airplane ap = new Airplane();
		ap.land();
		ap.fly();
		ap.takeOff();
		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.flyMode = SuperSonicAirplane.SUPERSONIC; //int flyMode = 2(SUPERSONIC)
		ssa.land();
		ssa.fly(); // flyMode를 SUPERSONIC으로 변경하였을경우 음속으로 비행을 합니다.가 출력되게하시오.
				   // flyMode를 NOMAL로 변경하였을경우 일반 비행을 합니다가 출력 되게하시오.
		ssa.takeOff();
		ssa.flyMode = SuperSonicAirplane.NOMAL;
		ssa.fly();
	}
}
