package pack02_Method2;

public class Ex03_MethodReturn {
	public static void main(String[] args) {
		outText();
		outText("");
		System.out.println(outText2("Text").toUpperCase());//String ==  outText2("Text")
	}
	//static o = 정적 멤버	(메모리에 자동으로 올라가기 때문에 접근이 그냥 가능)
	//static x = 인스턴스 멤버 ( 인스턴스화(객체화)를 통해서 접근)
	
	
	//1.리턴 타입이 없이 객체 생성을 하지않고 (= 정적멤버)
	// Text를 출력하는 메소드를 만드시오 메소드 이름은 outText()
	//외부에서 접근이 가능한지에 대한 여부
	public static void outText() {
		System.out.println("Text");
	}
	//2.리턴 타입이 없고(=void) 매개변수를 String으로 입력받아(인자값o)
	// Text를 출력하는 메소드를 만드시오 메소드 이름은 outText()
	public static void outText(String text) {
		System.out.println("Text");
	}
	//메소드 오버로딩 
	
	//3.리턴 타입이 있고(!=void) 매개변수를  입력 받지 않는(인자값x)
	// 매개변수를 리턴해주는 메소드를 만드시오 이름은 outText(); - x
	// return 값은 "Text" 
	// 출력은 리턴을 받은 후 main메소드에서 한다. 잘못된 프로그램이다.(설계 NG)
/*	public static String outText2() {
		
		return "Text";
	}*/
	//메소드 오버로딩 룰 x
	//4.리턴 타입이 있고(!=void) 매개변수를 입력 받는 (String , 인자값 o)
	// 메소드를 만드시오 . 
	// 메소드의 기능은 입력받은 매개변수를 출력하고 
	// return 값은 입력받은 매개변수 + "자신의 이름"
	// main메소드에서 리턴값을 출력한다.
	public static String outText2(String inputData) {
		System.out.println(inputData);
		return inputData + "자신의 이름";
	}
}
