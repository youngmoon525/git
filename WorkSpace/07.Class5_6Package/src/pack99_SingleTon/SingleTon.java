package pack99_SingleTon;

public class SingleTon {
	//객체를 생성을 내부에서 알아서 하게끔 만듬
	private static SingleTon singleTon = new SingleTon();
	//객체 생성을 내부에서 미리 함(메모리에 올려둠)
	
	private SingleTon() {}//내부에서만 사용 가능함
	
	//같은 패키지에서만 사용가능 // defalut
	static SingleTon getInstance() {
		return singleTon;
	}
}
