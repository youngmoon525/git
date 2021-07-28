package pack02_Array;

import java.util.Arrays;

public class Ex04_Array4d {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		//2차원 배열의 비정방형 생성 방법
		//1차원 배열을 생성할때 어떤값을 { } 중괄호를 이용해서
		//값을 바로주면 크기가 생성되듯이 2차원 배열도 값을 바로주고 생성가능
		int[][] arr2 = {
				 { 1 , 2, 3 }   , // 3개 index = n -1 = 3 - 1 = 0 , 1 , 2
				 { 1 , 2, 3 , 4, 5 },// 5개 index = n - 1 = 5 - 1 = 0 , 1, 2, 3 ,4
				 { 11 , 12 , 13 , 14} // 4개 
		} ;//arr2
		//1차원 배열은 대부분 = for문 1
		//2차원 배열은 대부분 = for문 2
		System.out.println(arr2.length);
		System.out.println("arr[0] : " + arr2[0].length);
		System.out.println("arr[1] : " +arr2[1].length);
		System.out.println("arr[2] : " +arr2[2].length);
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.println(arr2[i][j]);
//			}
//		}
		//행 크기만 할당
		// [ [] [] [] []   ] 
		// [  [] [] [] [] [] [] [] [] [] [] []   ]
		// [ [] [] [] [] []  ]
		//열크기를 따로 할당하는 방법
		int[][] array = new int[3][]; 
		array[0] = new int[5];
		array[1] = new int[10];
		array[2] = new int[4];
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
		//Arrays를 이용하여 1차원 배열의 값을 전부 출력
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		
		//1차원 배열을 만들고 그 배열을 2차원배열에 할당
		String[] dog = {"치와와" , "진돗개" , "삽살개" , "불독"};
		String[] cat = {"페르시안" , "노르웨이" , "고양이" } ;
		String[][] animal = new String[2][];
		animal[0] = dog;
		animal[1] = cat;
		//animal이라는 2차원 배열의 모든 값을 for문을 통해 출력해보세요.
		for (int i = 0; i < animal.length; i++) {
			for (int j = 0; j < animal[i].length; j++) {
				System.out.print(animal[i][j] + ",");
			}
			System.out.println();
		}
		
	}
}
