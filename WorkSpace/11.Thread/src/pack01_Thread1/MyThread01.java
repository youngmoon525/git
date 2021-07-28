package pack01_Thread1;
//Thread(쓰레드) : 동시작업
//▶Thread 클래스를 상속받아 run()이라는 메소드를 재정의(Override)해서 사용
public class MyThread01 extends Thread{
	@Override
	public void run() {
		//쓰레드가 동작을 하면서 실행을 하는 부분
		for (int i = 0; i <= 30; i++) {
			System.out.print(i +  ", ");
		}
		System.out.println();
	}
} //class

//outerClass 중첩 클래스 클래스 밖에 선언 default로만 만들수있음

class MyThread02 extends Thread{
	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
