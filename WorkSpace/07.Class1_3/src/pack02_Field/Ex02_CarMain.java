package pack02_Field;

public class Ex02_CarMain {
	public static void main(String[] args) {
		//객체 생성
		Ex02_Car myCar = new Ex02_Car();
		//메모리에 올라와서 new라는 키워드를 통해 생성이 완료됨
		//iv도 같이 올라감
		//iv(인스턴스 변수 ) , 객체를 만드는행위 = 인스턴스화 
		
		//필드 값 읽기 ---
		System.out.println("제조회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		//---------------------------
		
		//필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
	}
}
