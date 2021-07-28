
public class Ex01_If {
	//iv 
	//인스턴스변수
	public static void main(String[] args) {
		int score = 93 ; //<- 로컬변수
		//if(boolean) {          실행할 문장       }
		if(score == 93) { // true 
			System.out.println("if문 실행할 문장에 접근함");
		}else {
			System.out.println("else문 실행할 문장에 접근함");
		}
		
		int score2 = 87;
		if(score2 >= 90) {
			System.out.println("A학점");
		}else if(score2 >= 80) {
			System.out.println("B학점");
		}else if(score2 >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
	
	}//main
}
