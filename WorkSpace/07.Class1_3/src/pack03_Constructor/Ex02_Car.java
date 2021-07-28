package pack03_Constructor;

public class Ex02_Car {
	//String company , model , color;
	//int maxSpeed 를 필드로 가지는 객체를 만들어 보세요.
	//그리고 생성자 메소드를 통해 Ex02_CarMain에서 생성 후 출력하세요.
	//company
	//model
	String company , model , color;
	int maxSpeed;
	
	
	
	public Ex02_Car(String company, String model, String color) {
		//4개의 필드에 전체 값을 줘야함
		this(company, model , color, 0);
	}


	public Ex02_Car(String company2, String model, String color, int maxSpeed) {
		this.company = company2;//iv(field,전역변수,인스턴스 변수) = lv(변수,지역변수,로컬변수) ;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}//lv 수명 끝
	
	
	
	
	
}
