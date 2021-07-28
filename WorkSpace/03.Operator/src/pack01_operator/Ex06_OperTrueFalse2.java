package pack01_operator;

import java.util.Scanner;

public class Ex06_OperTrueFalse2 {
	public static void main(String[] args) {
		//변수타입 변수명 ; //선언만 한상태
//		int a = 10;
//		String result = a == 10 ? "맞다" : "틀리다";
//		System.out.println(result);
//		//나중에는 if문을 더 많이 사용함
//		//조건  ? true일때의 반환값 : false일때의 반환값
//		
//		result = (a != 10) ? "맞다" : "틀리다";
//		System.out.println(result);
//		
//		
//		int score = 50; // 몇점이상일때 'A' , 'B' 
//		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' :
//			(score >= 70) ? 'C' :'D' ;
//		//70점보다 높은 점수는 C 그외에는 D를 전부 주게끔 수정을 하시오
//		//그리고 90 점부터=이상 A , 80점 부터 B , 70점 부터 C가 되게끔 수정을 하시오
//		System.out.println(grade);
		
		//1. Scanner를 통해서 입력받은값이 90이상일때 A
		//80이상일때 B 70이상일때 C 그외에는 D를 출력
		
		//2. 90 이상 'A'-Good , 80 이상 "B-Nomal" , 70 이상 C-NotBad , 그외 Bad
		System.out.println("점수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String inputScore = sc.nextLine();
		int intScore = Integer.parseInt(inputScore);
		String grade = (intScore >= 90) ? "A-Good" :	"Bad";
		
		//받을 변수타입 String = 조건식 "참일때" :  "Bad"
		System.out.println(grade);
		
		
		
	}//main
}//class
