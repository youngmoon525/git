package pack03_OOP1;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductDTO p1 = new ProductDTO();//ProductDTO(설계도)를 이용한 객체 p1을 생성
		p1.num = 1;
		p1.name = "컴퓨터";
		p1.price = 500000;
		dao.display(p1);
//		System.out.println(" 상품 번호 : " + p1.num);
//		System.out.println(" 상품 명 : " + p1.name);
//		System.out.println(" 상품 가격 : " + p1.price);
		
		ProductDTO p2 = new ProductDTO(2, "프린터", 300000);

		dao.display(p2);
		
		//세번째 상품을 추가 상품번호는 3 , 상품명은 게임기 , 가격은 900000
		//이라는 상태정보를 가진 객체를 생성하고 내용을 출력하시오.
		ProductDTO p3 = new ProductDTO(3, "게임기", 900000);//tab을 눌러서 다음 입력할 인자값부분으로 이동
		dao.display(p3);
		//DAO는 보통 1번만 생성함 ProductDAO dao = new ProductDAO();
		//DTO는 객체의 갯수에 따라서 여러번 생성함
		
		
	}
}
