package pack02_Thread2;

public class Ex05Main {
	public static void main(String[] args) {
		Ex05_Thread thread01 = new Ex05_Thread();
		Ex05_Thread thread02 = new Ex05_Thread();
		Ex05_Thread thread03 = new Ex05_Thread();
		
		//thread01.setPriority(1); //우선순위 1~10 //1==최소
		//thread02.setPriority(5); //우선순위 1~10 //5==기본
		//thread03.setPriority(10); //우선순위 1~10 //10==최대
		//Thread.MIN_PRIORITY = 3;
		thread01.setPriority(Thread.MIN_PRIORITY);
		thread02.setPriority(Thread.NORM_PRIORITY);
		thread03.setPriority(Thread.MAX_PRIORITY);
		
		thread01.start();
		thread02.start();
		thread03.start();
		
		
	}
}
