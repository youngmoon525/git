package pack02_Array;

public class Ex00_Array0 {
	public static void main(String[] args) {
		//데이터 타입 [] 명칭(변수명) ;//선언
		//int i = 0; 변수를 초기화 
		//int i ; //선언
		//int[] i // 선언
		//int[] i = {10,20,30,40,50,60,70,80,90} ; 사용빈도 낮음
		//int[] i = new int[3]//크기를 할당
		//배열의 메모리(크기가 3으로 할당된) = > [0][1][2]  ?[3]
		//배열의 규칙 1.0부터 시작한다. 
		//			  2.3개의 크기를 할당하면 우리가 접근할수있는 메모리는
		//				3-1 = n-1 이다 0 , 1 , 2 
		//            3.index (인덱스) 주소부(일련번호)라고한다.
		//			  4.데이터 타입을 한가지만 사용이 가능하다.
		//int[] arr = {10,20,30}; // -1
		//System.out.println(arr[3-1]);
		int[] arr2 = new int[3];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		//그냥 array(배열) 자체를 출력을 해보면 메모리 값이 나오게됨
		//크기를 할당한 array는 자동적으로 데이터타입이 가질수있는
		//기본값을 가짐
		String[] arr3 = new String[10];
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3.length);
		//for문은 개발자가 증감식을 조절해서 1씩증가할수가있음
		//배열도 열거형 데이터타입이기 때문에 규칙적으로 인덱스가 1씩증가하는구조
		for(int i = 0 ; i < arr3.length; i++ ) {
			//배열 크기만큼 루핑이 되는 for문 
			arr3[i] = "arr3[ " + i + "] ";
			System.out.println(arr3[i]);
		}
		
	}
}
