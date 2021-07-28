package pack02_Array;

import java.util.Arrays;

public class Test02_Array2 {
	public static void main(String[] args) {
		int[] arr = {   5, 2 , 1 ,10 , 17 , 20 , 0,  30 , 28 ,-1};
		//System.out.println(Arrays.toString(arr));
		//arr에 들어있는 1.최대값과 2.최소값을 출력해서 보여주세요.
		int max=arr[0]  , min=arr[0] ;
		//  max = ? , min = ? 
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max =arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
