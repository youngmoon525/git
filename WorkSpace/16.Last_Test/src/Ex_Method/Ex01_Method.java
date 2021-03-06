package Ex_Method;

import java.util.ArrayList;

public class Ex01_Method {

	public static void main(String[] args) {
//		Ex01_Method em = new Ex01_Method();
//		em.testMethod();
//		String data333 = "testMethod로 넘겨줄 StringData";
//		em.testMethod(data333);
//		
//		           //Method타입이 주어지게 되면 해당하는 메소드는 
//					//return타입과 같은 변수라고 생각해도됨
//		System.out.println(em.rtnTen()  +  10);
		//인스턴스 멤버 메소드 사용 ↑
		testMethod2();
		System.out.println(rtnString() + " String + String = String");
		
		//main메소드 안에 a와 b가 있는지 
		//파라메터의 타입이 무엇인지 
		String a = "mainLV"; 
		int b = 1; 
		System.out.println( rtnString(a, b) ) ; // rtnString(String , int) ;
		System.out.println( rtnString("스트링값" , 10) );
	}

	// 메소드의 형태가 void인것은 return값 (반환값이 없다)
	public void testMethod() {
		System.out.println("testMethod가 실행이 됨");
	}

	public void testMethod(String data) {
		System.out.println("testMethod가 실행이 됨" + data);
	}
	
	//메소드의 형태가 void가 아닐때 (무조건 반환값이 있다)
	//ex)자판기의 음료를 선택후 마지막에 잔돈을 반환 하기위한 메소드
	public int rtnTen() {
		return 10;
	}
	//static == 인스턴스화 하지 않아도 접근이 가능한 멤버(=static)
	public static void testMethod2() {
		System.out.println("testMethod2가 실행 됨");
	}
	public static String rtnString() {
		//String a = "";
		//return "";< return null
		return "KYM";
	}
	
	public static String rtnString(String a , int b) {
		
		//1.return a ;//a==String
		//2.return null;
		//3.return "문자열값";
		//4.return b+""; 
		//========String형태에 담을수있는 = String형태만 return할수있다.
		return a + b; // String + int = String
	}
	//rtnString() 메소드를 static멤버로 만드는데
	//파라메터를 아무타입이나 두개받게끔 만드시고 호출을 해보세요.
}
