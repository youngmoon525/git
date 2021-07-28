import java.util.Arrays;
import java.util.Scanner;

public class Ex09_Method3 {
	int size = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); //사용자가 입력한 값을 받는다.
		//정수 값만 받아야함
		int arrSize = 0;
		try {
			arrSize = Integer.parseInt(inputData); // String타입에 데이터를 -> int형 데이터로 만드려는 시도
			int[] intArr = rtnArr(arrSize); // rtnArr()라는 메소드를 호출하는데 인자값이 int형이 필요하기때문에 arrSize라는
			arrSize = Integer.parseInt(inputData);
			String[] strArr = rtnStrArr(arrSize);								// int값을 인자값으로 넘겨주고 호출함
			System.out.println(Arrays.toString(intArr));
			System.out.println(Arrays.toString(strArr));
		}catch (Exception e) {
			System.out.println("정수값이 아님");
		}
	}//main
	//String[] 배열을 리턴하는 메소드를 만들고 . 
	//메소드는 size값을 int로 입력받는다. 
	//String[] 배열을 리턴받아서 출력해보기 .
	
	
	public static int[] rtnArr(int arrSize) {
		int[] intArr = new int[arrSize];
		return intArr;
	}
	public static String[] rtnStrArr(int arrSize) {
		String[] strArr = new String[arrSize];
		return strArr;
	}
	
}//class
