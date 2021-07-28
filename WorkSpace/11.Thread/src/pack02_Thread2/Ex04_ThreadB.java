package pack02_Thread2;

public class Ex04_ThreadB  extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "에서 작업한 내용");
		}
	}
}
