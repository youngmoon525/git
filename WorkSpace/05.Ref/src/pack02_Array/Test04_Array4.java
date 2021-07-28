package pack02_Array;

import java.util.Arrays;

public class Test04_Array4 {
	public static void main(String[] args) {
		//정수형 배열 arr[]이있다.
		//arr의 순서를 작은 수부터 순차적으로 정렬하여 
		//arr2에 담아서 출력하시오.
		int[] arr = { 5 , 4 , 1 , 10 ,9, 10 , 40 };
	   //배열을 하나만 이용해서 
		for (int i = 0; i < arr.length; i++) { //배열의 크기만큼 루프를하는 for
			for (int j = 0; j < arr.length-1; j++) {//자신의 크기보다 +1되는 값을비교하기위해
				
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	    
	    
	}
}
