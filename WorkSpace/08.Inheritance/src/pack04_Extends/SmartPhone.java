package pack04_Extends;

//핸드폰의 기본 기능을 가진 CellPhone이라는 부모클래스를 선택하여 기본기능들을 상속받자.
public class SmartPhone extends CellPhone {
	//부모클래스에서 가진 필드를 이용하여 생성자를 사용할수있다.
	String type ; //3g , 4g , 5g 
	
	public SmartPhone(String type ,String model , String color) {
		this.type = type;
		this.model = model;
		this.color = color;
	}
	
	public SmartPhone(String model , String color) {
		this.model = model;//부모필드에서 가지고있는 모델을 상속받았기때문에 자식클래스에서 this로 접근이가능
		this.color = color;
	}
	
	void onInternet() {
		System.out.println("인터넷에 연결함 ");
	}
	void onYoutube() {
		System.out.println("유튜브를 시청함");
	}
}
