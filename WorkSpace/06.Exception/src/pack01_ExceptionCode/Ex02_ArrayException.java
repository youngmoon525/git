package pack01_ExceptionCode;

public class Ex02_ArrayException {
	public static void main(String[] args) {
		int[] arr = {1 , 2, 3 };
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		//ArrayIndexOutOfBoundsException: 3
		//Array크기를 넘어선 index를 접근하는 경우
	}
}
