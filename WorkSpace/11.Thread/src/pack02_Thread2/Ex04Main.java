package pack02_Thread2;

public class Ex04Main {
	public static void main(String[] args) {
		//메인 쓰레드의 이름을 출력해보기
		Thread mainThread = Thread.currentThread(); //지금 동작중인 쓰레드
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		Ex04_ThreadA threadA = new Ex04_ThreadA();
		threadA.setName("ThreadNameChange");
		System.out.println("작업 할 스레드 이름 : " + threadA.getName());
		threadA.start();//작업  시작 
		
		Ex04_ThreadB threadB = new Ex04_ThreadB();
		System.out.println("작업 할 스레드 이름 : " + threadB.getName());
		threadB.start();//작업  시작 
	}
}
