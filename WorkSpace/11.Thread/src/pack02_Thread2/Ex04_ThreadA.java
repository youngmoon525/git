package pack02_Thread2;

public class Ex04_ThreadA extends Thread {
	//
	//private String name ;
	//생성자 메소드 
	public Ex04_ThreadA() {
		//name < private == getter & setter 
		setName("ThreadA"); //Tread의 이름을 정의함(field에 있는 name을 우리가 원하는 이름으로 바꿈)
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용입니다.");
		}
	}
}
