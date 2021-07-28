package pack04_while;

public class Ex01_While1 {
	public static void main(String[] args) {
		//무한루프
		//반복문에는 반드시 증감식이 있어야함 
		//for(초기값 ; 조건식 ; 증감식 ; )
		
		int i = 1 ; 
		while(i<10) { // true
			System.out.println("a   " + i);
			i ++ ;
		}
		int i2 = 1 ;
		while(i2<10) {
			System.out.println("2 * " + i2 + " = " + (i2 * 2) );
		}
		//while 문으로 구구단 2단 출력하기 
		
	}
}
