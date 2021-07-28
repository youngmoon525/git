import java.util.Arrays;

public class Ex04_Array2 {
	public static void main(String[] args) {
		// 1차원 배열 = 행 또는 열만 가지고있는 구조라면.
		// 2차원 배열 = 행 과 열을 가지는 구조(=2차원 배열은 1차원 배열을 원소로가짐)
		// 1차원 배열 [1] [2] [3] [4] [5]
		// 2차원 배열
		// [ [1] [2] [3] [4] [5] ]
		// [ [6] [7] [8] ]
		// [ [1] [2] [3] [4] [5] [3] [4] [5] ] // 비정방형
		// ......
		int[][] arr = new int[2][3];// 배열을 선언과 동시에 크기를 할당
		// 5x5 (정방형) 행과열의 크기가 똑같은 형태
		// 1 , 2 , 3 , 4 (비정방형) 행과열의 크기가 모두 다름 (사용빈도는 낮음)
		System.out.println(arr.length);// 배열의 크기를 조회 ,행크기를 조회 row
		System.out.println(arr[1].length); // 2차원 배열 내부에 1차원 배열의 크기를 조회 열 column
		// 2차원 배열의 규칙은 행 x 열 최대 담을수있는 데이터 갯수 6
		// [0 [1 0 ] [2 1 ] [3 2]] 0행 2행
		// [1 [4 0 ] [5 1 ] [6 1]] 1행
		// 3열 (1차원 배열의 크기)
		System.out.println(arr[0][0]); // 값 세팅을 안했다면 int형은 초기값 0을 가짐
		// 행과 열을 만들었으면 1차원 배열의 규칙처럼
		// 접근 할수있는 index x= x-1 , y-1
		// x=2 , x-1 , 0~1 2개
		// y=3 , y-1 , 0~2 3개
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println("===========구분선==============");

		// 1차원 배열을 원소로 가지기 때문에 비정방형이라는 불규칙적인 배열이 존재함
		// 1차원 배열을 int[] intArr = { 1, 2 , 3 , 4 , 5} 식으로 초기화를 한다면
		// 2차원 배열은 1차원 배열을 안에 담을수있는 중괄호가 더 들어간다.
		int[][] intArr2 = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };// int[][] intArr2 = new int[3][?]
		System.out.println(intArr2.length); // 행크기 =2차원 배열이 가지고 있는 1차원 배열의 갯수
		System.out.println(intArr2[0].length);// 2차원 배열이 가지고있는 1차원배열의 크기
		System.out.println(intArr2[1].length);// 2차원 배열이 가지고있는 1차원배열의 크기
		System.out.println(intArr2[2].length);// 2차원 배열이 가지고있는 1차원배열의 크기
		// 2차원 배열은 중첩 for문이 사용됨=for문이 1개 이상 사용이 된다.
		for (int i = 0; i < intArr2.length; i++) {
			// 0 , 1 , 2 == 세번 동작하는 for문 모든 행에 일단 접근이 가능함
			//System.out.println(intArr2[i][0]);
			// 행에만 접근이 가능함 하지만 열까지 접근을 해야 되기 때문에
			// for문이 하나 더 필요하다.
			for (int j = 0; j < intArr2[i].length; j++) {
				System.out.println(i + "--" + j + "arr값 출력" +intArr2[i][j]);
			}
	
		} // for
		int[][] intArr3 = new int[10][];//10개의 1차원 배열을 담을수있는 2차원배열을 생성
		int[] arr11 = {1 , 2};
		intArr3[0] = arr11; 
		intArr3[1] = arr11; 
		intArr3[2] = arr11; 
		intArr3[3] = arr11; 
		intArr3[4] = arr11; 
		intArr3[5] = arr11; 
		
	}
}
