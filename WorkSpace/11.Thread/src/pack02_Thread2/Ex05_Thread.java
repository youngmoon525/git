package pack02_Thread2;

public class Ex05_Thread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			//getter & setter 
			System.out.println(getName() + "우선 순위 : " + getPriority());
		}
	}
}
