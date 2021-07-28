package pack02_Array;

public class Test03_Array3 {
	public static void main(String[] args) {
		//정수형 배열 arr[]의 원소값 (int형) 의 누적합(sum)을 구하여 출력
		int[] arr = {4 ,6 , 7 ,9 , 10 ,15 , 20 , 30 };
		int sum = 0; //sum 원소의 누적합(4 + 6 + 7 + 9 ...+ 30 )
		int evensum = 0;
		int oddsum = 0;
		//홀수의 합 (oddsum) , 짝수의 합 (evensum)을 구해서 출력
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			//짝수를 구하려면 어떻게 해야하는지 ?
			//만약에 ㅇㅇ 이면 {  }
			//if (   짝수  )
			//if ( 어떤값 % 2 == 0 )
			if(arr[i] % 2 == 0) {
				evensum = evensum + arr[i];
			}else {
				oddsum = oddsum + arr[i];
			}
		}
		System.out.println(sum);
		//
		
	}
}
