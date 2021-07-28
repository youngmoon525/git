package japangi;

public class Jmain {
	public static void main(String[] args) {
		System.out.println("음료를 선택하세요");
		System.out.println("콜라(800) 사이다(500) 물"); //초보자 
		//int , String 한계 한가지 타입밖에 못담는다 .
		//int , String , int 를 한번에 담을수있게 객체를 만든다.
		//Class(설계도) 음료라는 객체를 만들수있는 설계도
		//음료라는 객체를 만듬
		
//		DrinkDTO cola = new DrinkDTO(); // DrinkDTO라는 설계도를 이용해서 일단 객체를 만듬
//		cola.price = 800;
//		cola.name = "콜라";
//		cola.company = "코카코라";
//		cola.color = "껌정색";
//		System.out.println(cola.price + cola.name);
		//생성자 메소드에 파라메타를 입력받아서 세팅하지 않은 경우
	
		//water.company = "삼다수";
		//생성자 메소드는 객체를 생성하기 위한 메소드 
		//System.out.println(water.name + water.company);
		//String[] strArr = new String[3]; //String이라는 클래스를 배열로 만듬 
		DrinkDTO[] drinks = setDto();
		DrinkDTO[] drinks = setDto();
		DrinkDTO[] drinks = setDto();
		for (int i = 0; i < drinks.length; i++) {
			//i < for문 자체가 배열의 크기만큼 루프하기 때문이다.
			System.out.println(drinks[i].name + drinks[i].price);
		}
	}//main () 콘솔창에 뭔가 출력을 보기위한 메소드
	
	//메소드의 사용 목적 코드의 재사용을 하기 위함
	public static DrinkDTO[] setDto() {
		DrinkDTO cola = new DrinkDTO(800, "콜라", "코카콜라", "껌정색");
		DrinkDTO water = new DrinkDTO(500, "물");
		DrinkDTO soda = new DrinkDTO(500, "사이다");
		DrinkDTO[] drinks = new DrinkDTO[4]; //DrinkDTO라는 클래스를 배열로 만듬
		drinks[0] = cola; //cola라는 DrinkDTO가 drinks배열의 0번방에 들어옴
		drinks[1] = water;
		drinks[2] = soda;
		drinks[3] = new DrinkDTO(1000, "이름없음", "코카콜라", "껌정색");
		
		return drinks;
	}
}
