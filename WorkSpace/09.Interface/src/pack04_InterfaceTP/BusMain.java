package pack04_InterfaceTP;

public class BusMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //버스라는 하위 클래스에서 상위 인터페이스로 
		vehicle.run(); //버스에서 재정의 된 메소드를 실행함
		
		//
		Bus bus = (Bus) vehicle; //작은것->큰것 (자동 형변환)  //큰것 -> 작은것 (강제 형변환 ) 
		
		bus.run();
		bus.checkFare();
	} 
}
