package pack02_Array;

public class Test01_Array1 {
	public static void main(String[] args) {
		//1.정수 3개를 저장할 배열(arr1)을 선언 및 크기 할당을 하시고(생성)
		//모든 요소에 값(10)을 할당하고 출력을 하는데 for문을 이용
		//------- 생성   0 10 , 1 10  , 2 10
		int[] arr1 = new int[3];
		//[0] [1] [2]
		for(int i = 0 ; i<arr1.length; i++) {
			//i=0;//i=1 // i=2
			arr1[i] = 10;
		}
		//for {
			// 값을 할당하고 출력하시오 
		//}
		
		//============================
		
		//2.정수 3개를 저장할 배열(arr2)을 선언 및 생성 
		//각각의 요소에 값(10,20,30)을 할당하고 출력하시오
		//------- 생성
		int[] arr2 = new int[3]; // 0 10 , 1 20  , 2 30
		//[0] [1] [2]
		for(int i = 0 ; i < arr2.length; i++) {
			arr2[i] = (i+1) * 10 ;
			System.out.println(arr2[i]);
		}
		//for {
					// 값을 할당하고 출력하시오 
		//}
	}
}
