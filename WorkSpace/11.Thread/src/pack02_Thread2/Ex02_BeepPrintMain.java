package pack02_Thread2;

public class Ex02_BeepPrintMain {
	public static void main(String[] args) {
		//Ex02_BeepTask bt = new Ex02_BeepTask();
		//bt.run();
		//BeepTask -> Thread로 만들어서 Start();
		//Thread thread = new Thread(bt);
		Runnable beepTask = new Ex02_BeepTask(); // 
		Thread thread = new Thread(beepTask); 
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main 윈도우 소리");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
