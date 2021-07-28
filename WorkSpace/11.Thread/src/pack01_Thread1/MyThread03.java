package pack01_Thread1;

public class MyThread03 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(getName() + "[" + i + "]");
		}

	}
}
