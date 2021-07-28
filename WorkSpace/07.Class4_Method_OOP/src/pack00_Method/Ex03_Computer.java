package pack00_Method;

import java.util.Arrays;

public class Ex03_Computer {
	//클래스 -> 설계도(붕어빵 틀)
	//new -> 객체 (붕어빵)
	String ivs ; //iv
	//Method 클래스 내부에 있다.
	//인자값으로 int[] 배열을 입력받아 
	//배열의 총합을 구하는 메소드를 작성하시오.
	//return int
	//출력은 Ex03_ComputerMain
	//void sum() {
	//	System.out.println("sum메소드가 호출됨");
	//}
	//int[] arr ; <= int값 + int값 ............. = int값
//	int sum1(int[] arr) { //3.배열을 인자값으로 입력받는다.
//		//int[] arr = {1,2,3,4,5};  --- x
//		int sum = 0 ;// 2.배열의 모든값의 합을 누적시켜야함
//		System.out.println(Arrays.toString(arr)); //4.인자값에 어떤 값이 들어왔는지 체크
//													//5.main메소드에서 확인
//		//6.실제 기능 구현
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i]; // n - 1
//		}
//		return sum ; // 1.ruturn으로 sum시킨값을 줘야함 
//	}
//	
	//
	int sum1() {
		return 0;
	}
	int sum1(int[] arr) {
		int sum = 0 ;
		System.out.println(Arrays.toString(arr)); 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
		
	}
	
	
	//String 타입을 리턴하는 메소드 rtnStr()
	//사용자가 어떤값을 입력하고 메소드를 호출하면 입력된값에 자신의 이름이 결합되어 출력됨
	//ex ) Scanner로 String 형태의 데이터를 inputData를 통해서 받아옴
	// rtnStr(inputData)
	//입력된값 안녕 
	//rtnStr  안녕 + "김영문"
	String rtnStr(String inputData) {
		return  inputData + "  자신의이름";
	}
}//class

