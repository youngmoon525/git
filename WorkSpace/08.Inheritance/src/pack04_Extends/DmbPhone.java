package pack04_Extends;
//CellPhone의 모든 기본 기능들을 전부 상속을 받음
public class DmbPhone extends CellPhone{
	//SuperClass(부모클래스)의 iv(필드)를 사용
	public DmbPhone(String model , String color) {
		this.model = model;
		this.color = color;
	}
	
	void onDmb() {
		System.out.println("DMB시청함");
	}
	@Override
	void powerOn() {
		System.out.println("전원을 켭니다. (DMB 전원)");
		//super.powerOn(); //재정의 할필요가 없는데 재정의를 함
	}
	
}
