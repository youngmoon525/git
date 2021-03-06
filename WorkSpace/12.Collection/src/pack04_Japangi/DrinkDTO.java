package pack04_Japangi;
//음료의 상태정보를 저장하기 위한 객체 
public class DrinkDTO {
	private String name ; //음료의 이름
	private int price ; //음료의 가격
	private String company ; //제조사 
	
	public DrinkDTO(String name, int price, String company) {
		if(price < 0) {
			price = 0;
			System.out.println("가격을 잘못 입력하여 0으로 세팅함 DrinkDTO생성자임");
			//가격에 마이너스 값을 줄수없게끔 작업을 해놓음
		}
		
		this.name = name;
		this.price = price;
		this.company = company;
	}

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
