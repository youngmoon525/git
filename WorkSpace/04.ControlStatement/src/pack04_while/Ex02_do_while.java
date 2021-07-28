package pack04_while;

public class Ex02_do_while {
	public static void main(String[] args) {
		int evenSum = 0; // 짝수(even)의 합 //odd(홀수)
		int i = 1; //while문의 증감식 처리를 위한 변수
		do {
			if(i % 2 == 0) {
				evenSum += i;
			}
			i++;
		}while(i<=100);
		System.out.println("do While을 이용한 짝수의 합 : " + evenSum);
	}
}
