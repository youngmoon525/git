
//상태 정보만 가지고 있는 클래스 
//
public class DrinkDTO {
	int price ; //가격을 담아놓을 필드
	String name ; // 이름을 담아놓을 필드
	//생성자를 따로 만들지 않으면 java에서 빈 깡통 생성자를 지원해줌 else 직접 빈깡통 만들어야함
//	String company ;
//	String yymmdd ; 
	public DrinkDTO() {
		//다른 생성자 메소드를 정의하게 되면 개발자가 빈깡통을 만들어야함 
	}
	
	public DrinkDTO(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	
}
