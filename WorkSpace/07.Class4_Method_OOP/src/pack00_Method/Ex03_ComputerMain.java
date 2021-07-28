package pack00_Method;

import java.util.Scanner;

public class Ex03_ComputerMain {
	public static void main(String[] args) {
		Ex03_Computer ec = new Ex03_Computer();
		
		int[] arr = {1 , 2, 3, 4, 5 , 6 , 7 , 8 , 9 , 10};
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); // 안녕 
		//inputData 
		//-> ec.rtnStr(inputData);
		//  inputData  + "자신의이름"
		//ctrl + click
		//ec.rtnStr();
		System.out.println(ec.sum1(arr) );
		System.out.println();
		//ec.sum1(arr) == int 
	}
}
