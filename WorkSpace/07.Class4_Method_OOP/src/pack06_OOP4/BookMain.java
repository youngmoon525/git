package pack06_OOP4;

public class BookMain {
	public static void main(String[] args) {
		//객체를 인스턴스화 (객체화)
		//BookDTO dto = new BookDTO();
		//private으로 정보은닉을 하고 외부에서 접근을 허용을 안할때는
		//빈 깡통 만으로는 객체에 상태정보를 세팅할수가없음.
		//setter를 이용해서 정보를 세팅해야함.
		//dto.setTt("aaaaaaaaaaaaaaaaaaaaa");
		//System.out.println(dto.getTt());
		//BookDTO dto = new BookDTO("혼공자", 30000, "신용권", "한빛");
		//dto.cnt = 30;
		
		BookDTO[] book ; //크기를 아직 모를때는 선언만 해둠
		//3권정도의 데이터를 넣어야 겠다. == 크기를 할당할수있음
		book = new BookDTO[3]; // 생성 
		int[] arr = new int[3];

		for (int i = 0; i < book.length; i++) {
			book[i] = new BookDTO("혼공자", (30000+i), "신용권", "한빛");
			System.out.println(book[i].getPrice());//바로 값을 사용할수가 없으니 getter&setter 
			//두가지 방법중에 한가지 방법을 선택해서 for문에서 바로 출력되게끔 코드를 작성하시오.
			//첫번째 방법 . private을 제거한후 iv에 바로 접근
			//두번째 방법 . private을 유지한후 getter & setter를 이용
			//출력은 book[i].price 
			
		}
//		BookDTO dto = new BookDTO("혼공자", 30000, "신용권", "한빛");
//		book[0] = dto;
		//BookDTO[] book = new BookDTO[3];//객체 선언 및 생성 초기화
	}
}
