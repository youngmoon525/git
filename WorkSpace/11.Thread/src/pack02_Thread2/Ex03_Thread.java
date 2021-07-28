package pack02_Thread2;

public class Ex03_Thread {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("윈도우의 소리 Thread");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("메인 메소드가 고장났습니다.");
						e.printStackTrace();
					}
				}
			}
		});//Thread
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("윈도우의 소리 Main");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
