package pack02_Array;

public class Ex03_Array3d {
	public static void main(String[] args) {
		//2차원배열 
		//배열 (Array) 
		//변수는 하나의 정보만 담을수 있지만 (String a = "A" ,int a = 0 )
		//배열은 연관(같은 타입)된 정보들을 그룹핑해서 여러 데이터를 담을수 있다.
		//String[] aa ; 배열을 선언한 경우 
		//1차원 배열의 경우에는 x또는 y축 행또는열밖에 없는구조 
		// [] [] [] [] [] [] [] [] [] [] [] [] [][]
		//2차원 배열은 x축과y축이 존재 ( 배열안에 배열을 담은 구조다)
		// [] [] [] [] [] [] [] []
		// [] [] [] [] [] [] [] []
		//배열의 인덱스의 접근은 0부터다 (배열크기 -1  까지 접근 가능)
		//다차원 배열
		//즉 ,1차원 배열은 요소(엘리먼트,원자,데이터)로 변수를 가지는 배열
		//	2차원 배열은 1차원 배열을 가지는 배열
		// 3차원 배열은 2차원 배열을 배열로 가지는 배열 
		//3차원 , 4차원 배열은 많이 사용을 안하고 더 사용하기 편한 ArrayList
		//라는 클래쓰를 사용
		
		
		//2차원 배열의 기본사용법 
		//데이터 타입 [][] 배열의이름 ; //선언
		int[] arr ;
		int[][] arr2 ;
		arr2 = new int[2][3]; // 2행 3열을 가지는 배열(크기가 할당이됨)
		System.out.println(arr2.length);//행의 크기를 조회함
		System.out.println(arr2[0].length);//몇번째 행의 열의크기를 조회할껀지
		//정방형 , 비정방형
		//int의 초기값은 0이다. String(클래스) = null
		System.out.println(arr2[0][0]); 
		//값을 할당
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
//		System.out.println(arr2[0][0]);
//		System.out.println(arr2[0][1]);// 열이 1증가
//		System.out.println(arr2[0][2]);// 열이 1증가
//		System.out.println(arr2[1][0]);//행이 1증가 열은 0부터
//		System.out.println(arr2[1][1]);//열이 1증가
//		System.out.println(arr2[1][2]);//열이 1증가
		//2차원 배열의 규칙 행 x 열 = 최대 담을수있는 크기 2행 x 3열 = 6
		//for문은 이용하여 출력을 해보세요.
		//arr2 = new int[2][3]; // 2행 3열을 가지는 배열(크기가 할당이됨)
		System.out.println(arr2.length);//행의 크기를 조회함
		System.out.println(arr2[0].length);//몇번째 행의 열의크기를 조회할껀지
		int sum = 0 ;
		for (int i = 0; i < arr2.length; i++) {
		
			sum = sum + i;
			
		}// for i // i는 메모리에서 제거됨
	
		System.out.println(sum);
	
	}//sum 
}
