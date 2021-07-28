package pack01_if1;

public class Ex03_if_if {
	public static void main(String[] args) {
		//중첩 if문 : if문 안에 다른 if문이 있는 문장
		//if(조건식A){
		// 조건식 A를 만족할때(true) 실행되는 부분 (내용부)
		//	if(조건식 B){
		//	조건식 A를 만족하고 조건식 B도 만족하면(true) 실행되는 부분(내용부)
		// }
		//}else{
		//조건식 A를 만족하지 못할때(false) 실행되는 부분 (내용부)
			//if(조건식 C) {
				//조건식 A를 만족하지 못하고 조건식 C는 만족했을때 실행되는 부분
				//조건식 A= false 조건식 C가 true
			//}
		//}
		int a = 10 ;
		if (a % 2 == 0) {//조건식 A
			System.out.println("짝수입니다.");
			//중첩if문은 if문 내부에 if문이 들어간다.
			//블럭킹을 기준으로 블럭킹 내부에 있는지 없는지가 중요
		}else { // 홀수부분 조건식A를 만족하지 못하는 
			System.out.println("홀수입니다.");
		}
		
		if(a >= 10) {
			System.out.println("a는 10이상입니다.");
		}
		//홀수일때. a의 값이 10보다 크면 a는 10이상이라고 출력하는 프로그램을
		//작성해보세요.
		//현재 작성 된 프로그램은 if문이 2개사용됨(a는 10이상입니다)
		//프로그램을 수정하여 if문이 하나만 사용되게끔 바꿔보세요.
		
		
		
		
		
		
		
	}//main
}//class
