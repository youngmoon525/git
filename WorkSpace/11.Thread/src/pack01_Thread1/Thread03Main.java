package pack01_Thread1;
//하나의 작업 (MyThread03.java)라는 작업을 동시에 실행되게 함
//Thread 내부에는 run메소드 하나만 이용해서 Start를 이용해 접근함
//Thread의 결과는 알수가없다.
//같은 동작을 하는 쓰레드를 여러개 사용하고싶다면 같은 객체를 여러개 다른이름으로
//생성을 한 후 각각 시작을 해주면 된다.
public class Thread03Main {
	public static void main(String[] args) {
		MyThread03 thread01 = new MyThread03();
		MyThread03 thread02 = new MyThread03();
		MyThread03 thread03 = new MyThread03();
		
		thread01.start();
		thread02.start();
		thread03.start();
		//크롬 어떤 작업이 먼저 끝나든 다른 작업과 상관이 없는 경우
	}
}
