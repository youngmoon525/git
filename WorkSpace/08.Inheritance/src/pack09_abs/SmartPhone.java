package pack09_abs;

//객체로 사용할 SmartPhone이라는 클래스 설계도 개념인 Phone을 Extends를 해서 사용
public class SmartPhone extends Phone {
	
	//클래스 앞에 abstract라는 키워드가 붙었기때문에 생성자를 강제한다.
	//Phone이라는 abstract . class 에서 강제 해놓았음 (=> class를 생성하는것을)
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetOn() {
		System.out.println("인터넷을 킴");
	}

	
}
