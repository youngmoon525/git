package pack03_OOP1;
//상품 정보를 저장하기 위한 Class(설계도)

public class ProductDTO {
	//멤버변수(필드 , 인스턴스 변수) 선언 : 상태정보 ▶ DTO Class , VO Class
	int num ; //상품 번호
	String name ; //상품명
	int price ; //상품 가격
	
	public ProductDTO() {
		//어떤 인자값도 입력 받지 않는 생성자 메소드 
	}
	
	public ProductDTO(int num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	
}
