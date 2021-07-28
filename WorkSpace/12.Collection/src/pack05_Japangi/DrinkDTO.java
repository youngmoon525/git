package pack05_Japangi;
//DTO라는 대문자 네이밍을 주는 이유는
//데이터의 속성들을 저장하는 클래스 이다. 라는것을 개발자끼리 서로 알아볼수있게 
//이름을 주는 관례이다.

public class DrinkDTO {
	private String name ; //실제 사용 할 필드 (객체의 속성들) 
	private int price ; 
	private String company;
	
	public DrinkDTO() {//빈깡통을 생성
	}
	
	public DrinkDTO(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	//private 상태이기 때문에 외부에서의 접근이 불가능함
	//public 
	//getter & setter 메소드를 이용하는 방법이 있다.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
