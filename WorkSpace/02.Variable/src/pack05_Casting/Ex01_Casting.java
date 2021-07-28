package pack05_Casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int a = 10; //정수형 변수를 선언과 동시에 값을 할당 초기화(리터럴)
		double b ;//실수형 변수 b를 선언만 한 상태
		//자동형변환 data범위가 큰 <  - data작은
		b = a; //int -> double
		//자동형변환이 발생함 작은 타입 (int) 큰 타입 (double)로 자동 변환
		//▶ 묵시적 형변환 , Upcasting
		System.out.println("변수 a의값 : " + a);
		System.out.println("변수 b의값 : " + b);
		
		int c ; //정수형 변수를 선언만 함
		double d = 45.5; //실수형 데이터를 선언과 동시에 값을 할당 초기화
		c =(int) d; // 강제 형변환  큰타입을 작은 타입으로 강제 변환
		//명시적형변환(DownCasting) Casting의 일반적인 의미
		System.out.println("변수 c의 값 : " + c);
		System.out.println("변수 d의 값 : " + d);
		 
		int x = 128;
		byte y =(byte) x;
		System.out.println("변수 x의 값 : " + x);
		System.out.println("변수 y의 값 : " + y);
		//강제 형변환의 단점 데이터 유실이 일어날 가능성이 농후
		
		
		char i = 35;//유니코드 문자 , 숫자 ''
		int j = i;
		//자동 형변환
		System.out.println("변수 i의 값 " + i);//Class
		System.out.println("변수 j의 값 " + j); //ASCII 아스키 코드 (Device)
		System.out.println("변수 j의 값 " + (char)j); //ASCII 아스키 코드 (Device)
		
		
		
	}
}
