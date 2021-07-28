package pack03_OOP1;

public class ProductDAO {
	//행위 정보 ▶ DAO Class (기능 , 기술 , 등) 직접적인 기능들을 담당함
	
	public void display(ProductDTO dto) {
		System.out.println(" 상품 번호 :" + dto.num);
		System.out.println(" 상품 명 :" + dto.name);
		System.out.println(" 상품 가격 :" + dto.price + "원");
		System.out.println("================================");
	}
}
