package japangi;
//상태 정보를 가지고있는 객체 
public class DrinkDTO {
	int price;
	String name; //생성자가 별도로 없으면 깡통을 지원해줌 java
	String company;
	String color;
	//생성자 메소드
//	public DrinkDTO() {
//		// TODO Auto-generated constructor stub
//	}
	public DrinkDTO(int price, String name, String company, String color) {
		super();
		this.price = price;
		this.name = name;
		this.company = company;
		this.color = color;
	}
	public DrinkDTO(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	
}
