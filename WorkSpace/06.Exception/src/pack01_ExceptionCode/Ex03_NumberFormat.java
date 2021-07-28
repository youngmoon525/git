package pack01_ExceptionCode;

import java.util.Scanner;

public class Ex03_NumberFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		int number = Integer.parseInt(data);
		System.out.println(number);
	}
}
