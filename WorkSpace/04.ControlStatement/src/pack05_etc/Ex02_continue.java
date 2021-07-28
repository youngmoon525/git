package pack05_etc;

public class Ex02_continue {
	public static void main(String[] args) {
		//짝수의 합
		int evenSum = 0;
		int oddSum = 0;
//		for(int i = 1 ; i <=10 ; i++) {
//			if(i % 2 == 0) {
//				evenSum = evenSum +  i;
//			}else {
//				oddSum = oddSum + i;
//			}
//		}
//		System.out.println("짝수의합 = " + evenSum);
//		System.out.println("홀수의합 = " + oddSum);
		for(int i = 1 ; i<=10 ; i++) {
			if(i % 2 == 0 ) {
				continue;// 블럭킹 내부의 (for) 조건부로 이동
			}
			oddSum += i;//== oddSum = oddSum + i ;
		}
		System.out.println("홀수의합 = " + oddSum);
	}
}
