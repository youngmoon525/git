package pack03_Horse;

public class Main {
	public static void main(String[] args) {
		Thread thread = null;
		for (int i = 0; i <= 5; i++) {
			thread = new Horse(i + "번" , new Rank());
			thread.start();
		}
	}
}
