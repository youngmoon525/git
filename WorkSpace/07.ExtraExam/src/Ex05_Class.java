
//Class = 설계도
//설계도를 이용해서 객체를 만든다.
//생성자 메소드를 별도로 만들지 않으면 자동으로 생성자 메소드 (빈깡통)은 이클립스에서 지원해줌
public class Ex05_Class {
	//iv (객체의 상태 정보를 담을수있는 변수)
	// 객체 내부에서는 인스턴스템버끼리만 접근이 가능
	//static 키워드가  들어갔는지 여부에 따라서 정적멤버와 인스턴스 멤버를 나눈다.
	int version = 1; //iv의 초기화 (iv를 선언과 동시에 값을 할당하여 사용할 준비가 완료됨)
	static int  version2 = 2 ; 
	public static void main(String[] args) {
		//객체생성(인스턴스화) 
		//객체의클래스 타입(클래스명) 객체 이름 = ※ new 객체 클래스 타입();
		//인스턴스화를 하는 궁극적인 이유는 iv를 사용하기위해서 (클래스의 멤버에 접근이하기위함)
		//version = 2;
		Ex05_Class ec = new Ex05_Class();
		ec.version = 2;
		version2 = 3;
		System.out.println(version2);
		System.out.println(ec.version);
	}//main
	
	public void aaa() {
		int aaa2 = 0 ; //<lv
		version2 = 0;
	}
	
	
}
