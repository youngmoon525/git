package pack02_Array;

import java.util.Scanner;

public class Ex02_Array2 {
	public static void main(String[] args) {
		//int[] score = {10,20,30}; 값을 선언과 동시에 할당 ▶초기화
		//배열의 총 크기 = 배열의이름.length
//		int[] score = {10,20,30};
//		System.out.println(score.length);
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		//배열을 선언하는데 "강아지" , "고양이" , "병아리"라는 값이 들어있는
//		//animal이라는 배열을 선언하고 출력하세요.(length = 3)
//		//DataType[] Name ;  
//		String[] animal = {"강아지" , "고양이" , "병아리"};
//		String[] animal2 = new String[3];
//		String[] animal3 ;
//		animal3 = new String[3];
//		animal2[0] = "강아지";
//		animal2[1] = "고양이";
//		animal2[2] = "병아리";
//		System.out.println(animal[0]+ animal2[0]);
//		System.out.println(animal[1]+ animal2[1]);
//		System.out.println(animal[2]+ animal2[2]);
//		//0 , 1 , 2        3-1
//		for(int i = 0 ; i < animal.length ; i++) {
//			System.out.println(animal[i]);
//		}
//		int[] arr = {10,20,30};
//		int sum = 0;
//		sum = arr[0] + arr[1] + arr[2];
//		System.out.println(sum);
		//Scanner로 값을 3개 입력 받음 (정수만) 배열
		//입력 받은 값의 합을 출력하세요
//코드가 반복 되고있다 = 반복문을 사용하면 처리가 편해진다.
//		String inputData1 = sc.nextLine();
//		String inputData2 = sc.nextLine();
//		String inputData3 = sc.nextLine();
//		System.out.println(Integer.parseInt(inputData1) + 
//				Integer.parseInt(inputData2) + 
//				Integer.parseInt(inputData3) 
//				);
//		
		Scanner sc = new Scanner(System.in);
		String[] arrs = new String[10];
		for(int i = 0 ; i < arrs.length ; i++) {
			//입력을 세번 받음 배열에 
			arrs[i] = sc.nextLine();
		}
		int sum = 0;
		for (int i = 0; i < arrs.length; i++) {
			sum = sum + Integer.parseInt(arrs[i]);
		}
		System.out.println(Integer.parseInt(arrs[0]) + 
		Integer.parseInt(arrs[1]) + 
		Integer.parseInt(arrs[2]) 
		);
		System.out.println(sum);
		//합계를 출력 
		
		//
		
		
		
	}
}
