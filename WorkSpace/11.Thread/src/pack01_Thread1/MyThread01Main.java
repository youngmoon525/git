package pack01_Thread1;

public class MyThread01Main {
	public static void main(String[] args) {
		//객체 생성 
		//우선순위를 부여하지 않았기때문에 작업을 실행을 하고
		//그결과가 어떤 쓰레드가 먼저 끝날지는 알수가 없음
		MyThread01 myThread01 = new MyThread01();
		MyThread03 mThread02 = new MyThread03();
		myThread01.start();
		mThread02.start();
	}
}
