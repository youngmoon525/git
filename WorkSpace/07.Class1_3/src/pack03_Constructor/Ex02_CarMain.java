package pack03_Constructor;

public class Ex02_CarMain {
	String a = "ababab"; // iv
	String b = ""; // iv field
	public static void main(String[] args) {
		//값을 정확하게 입력 받기 위해서
		Ex02_CarMain ec = new Ex02_CarMain();
		System.out.println(ec.a);
		ec.a= "aaaa";
		System.out.println(ec.a);
		String model = "모델";
		Ex02_Car car = new Ex02_Car("현대 자동차" , "그렌저" , "빨강" , 200);
		//Spring 초기 
		//중기 생성자 메소드 사용 x
		System.out.println(car.color);
	}

}
