package pack01_Interface;

public interface TestInterface {
	void test1();
	void test2();
	void test3();
	void test4();
	
	//default라는 키워드를 앞에 붙이면 abstract 강제성이 없어짐.(사용빈도 10%미만)
//	default void test6() {
//		
//	}
	public abstract void turnOff();
	public void turnOn();
}
