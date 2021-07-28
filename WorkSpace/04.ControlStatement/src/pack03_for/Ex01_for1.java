package pack03_for;

public class Ex01_for1 {
	public static void main(String[] args) {
		// for (초기값 ; 조건식 ; 증감 ) {
		// 반복횟수만큼 실행되는 부분
		// }
		// 1~1000까지 한줄에 하나씩 출력을해보세
		// local
		// for문 초기값에 사용되는 변수는 for문 블럭킹이 끝나면 메모리에서 사라짐
		// for문 이전에 사용한 변수 이름을 사용할수가 없다.
		// if(i < 10 ) true
		// 조건식의 값이 true일 동안 반복함
		// 무한루프를 방지하기 위해서 조건식이 마지막에는 false
		// for문을 끝내기 위한 증감식
		// int sum2 = 0 ;
//		sum = sum + 1; // 1
//		sum = sum + 2; // 1 + 2
//		sum = sum + 3; // 1 + 2 + 3
//		sum = sum + 4; // 1 + 2 + 3 + 4
//		sum = sum + 5; // 1 + 2 + 3 + 4 + 5
		// System.out.println("1~5까지의 합 : " + sum);
		// 로컬 변수 (지역 변수) lv
		//
	/*	int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum = sum + i;
			System.out.println(sum);
		} // for
*/		// 1.1~10까지의 수중 짝수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		//배열 , index = 0 ;
/*		for (int i = 10; i == 0 ; i--) {
			
		}*/
/*		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}*/
		// 2.1~10까지의 수중 홀수만 출력
		for (int i = 1 ; i <= 10 ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}
}
