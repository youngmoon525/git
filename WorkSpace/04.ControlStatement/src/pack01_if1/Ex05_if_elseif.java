package pack01_if1;

public class Ex05_if_elseif {
	public static void main(String[] args) {
		//다중 if문 : 여러개의 조건을 판단하여,  해당 조건을 만족할 경우
		//실행
		//if(조건식A) {
		//내용부
		//}else if(조건식 B){
		//내용부
		//}else if(조건식 C){
		//.
		//.
		//.
		//.
		//}else{
		//모든 조건을 만족을 못했다면 else 처리 가능
		//}
//		int score = 90 ;
//		if(score > 100) {
//			System.out.println("에러");
//		}else if(score >= 90) {
//			System.out.println("A학점");
//		}else if(score >= 80) { 
//			System.out.println("B학점");
//		}else if(score >= 70) {
//			System.out.println("C학점");
//		}else if(score >= 60) {
//			System.out.println("D학점");
//		}else {
//			System.out.println("F학점");
//		}
		int a = 11; 
		//ex)a가8일때 1	 		*    0 = 0(false)
		//ex)a가10이상일때 1	 		*    1 = 1(true)
		
		//ex)a가11일때 0        +     1 = 1
		//ex)a가8일때  1       +      0 = 1
		if (a % 2 == 0 || a>=10) { 
			// 부울 연산은 and 또는 or를 연결시켜 여러가지 조건을 줄수있음
			// && and연산자 모든 조건을 만족해야 true
			// and == && == * (계산식이 곱임) 1 * 1 * 1 .... = 1 (하나의 false(0)이
			//있다면 그 결과는 false
			// || or 연산자 하나의 조건이라도 만족하면 true
			//a가 2로나눴을때 나머지가 0(짝수) 이면서 10보다 크냐 == true , false
			System.out.println("짝수이거나 10보다 큰수");
		}else {
			System.out.println("홀수");
		}
		
	}//main
}//class
