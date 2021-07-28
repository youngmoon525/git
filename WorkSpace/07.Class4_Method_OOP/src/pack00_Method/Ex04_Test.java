package pack00_Method;

public class Ex04_Test {
	//test라는 객체는 인스턴스 메소드를 가진다.
	//인스턴스 메소드는 isInt() 라는 메소드인데
	//리턴타입이 boolean이다.
	//사용자가 어떤값을 입력하고 그값을 inInt()라는 메소드를 호출하면서 인자값으로 넘겨주면
	//그값이 int형인지 아닌지를 판단해서 true , false를 리턴해주는 메소드.
	
	//메소드의 실행은 Ex04_TestMain에서 한다.
	
//	void isInt() {
//		System.out.println("isInt호출됨");//< - TestMain에서 호출해볼것
//	}
	boolean isInt(String inputData) {
		try {
			Integer.parseInt(inputData);
			return true; // boolean
		}catch (Exception e) {

		}
		return false;
	}
	//예외 처리 
	//Integer.parseInt(StringData);
}
