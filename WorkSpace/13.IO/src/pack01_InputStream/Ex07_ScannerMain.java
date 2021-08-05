package pack01_InputStream;

import java.util.Scanner;

public class Ex07_ScannerMain {
	public static void main(String[] args) {
		KymScanner sc = new KymScanner();
		//InputStreamReader를 사용할 준비를함 -> InputStream을 파라메터로
		//넘겨서 
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		//sc.nextInt() < int를 리턴하는 메소드 
		//Scanner sc2 = new Scanner(System.in);
		//System.out.println(sc2.nextInt());
	}
}
