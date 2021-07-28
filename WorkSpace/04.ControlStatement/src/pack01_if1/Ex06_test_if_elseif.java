package pack01_if1;

import java.util.Scanner;

public class Ex06_test_if_elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String inputData = sc.nextLine();
		int code = Integer.parseInt(inputData);
		//성별코드(code) 값이 (int) 1이면 '남자' 2이면 '여자' , 3이면'남자' 
		//4이면 '여자' 그외에 값은 오류
		//(&& == 모든 조건 만족) (|| == 하나의 조건이라도 만족)
		//변수타입 변수명 = 초기화
		if(code == 1 || code == 3) {
			System.out.println("남자");
		}else if(code == 2 || code == 4) {
			System.out.println("여자");
		}else {
			System.out.println("에러");
		}
		
	}
}
