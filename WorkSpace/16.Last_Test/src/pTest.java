
public class pTest {
	public static void main(String[] args) {
//		Car car = new Car();
//		//객체화 시키는 방법은 new 라는 키워드를 통해서..
//		String[] arr = new String[3];
//		pTest pt = new pTest();
		//Calculator cl = new Calculator();
		System.out.println("3+5 = " + Calculator.add(3, 5));
		System.out.println("9-7 = " +Calculator.minus(9, 7));
		System.out.println("8*4 = " +Calculator.mul(8, 8));
		System.out.println("12/6 = " +Calculator.div(12, 3));
		
	}
	//오버로딩 = 같은 메소드의 이름을 가지고
	//여러개를 정의해서 사용하는것
	//파라메터의 갯수나 파라메터의 타입이 달라야만
	//오버로딩이 성립된다.
//	public void getString() {
//		
//	}
	public void getString(String a) {
		
	}
	public void getString(int a) {
		
	}
	// void == 리턴 필요없음
	// void != 리턴 반드시 필요함
	public String getString() {
		String a = "";
		return null;
		//return DataType
	}
	
	
}
