package pack01_Thread1;

public class MyThread04Main {
	public static void main(String[] args) {
		MyThread04 myThread04 = new MyThread04();
		MyThread05 myThread05 = new MyThread05();
		//!=Thread
		//myThread04.run();
		//myThread05.run(); // run이라는 메소드를 실행 
						    // 8번째줄의 작업이 끝나면 (한스택이 끝나고)
							// 9번째줄의 작업을 시작
		Thread thread01 = new Thread(myThread04);
		Thread thread02 = new Thread(myThread05);
		
		thread01.start();
		thread02.start();
	}
}
