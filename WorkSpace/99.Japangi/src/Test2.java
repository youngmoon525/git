import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//rtnString()을 변수로 받아서 사용한 이유는
		//첫번째 if문의 조건을 만족못했을때
		//else if()문이 실행이 되는데 다시 sc.nextLine()메소드가 실행이되어
		//입력을 해야 되는 상황이 생김.
		//따라서 한번 입력한 값으로 if else if 문들을 처리하기 위함.
		String menu = rtnString();//?
		if(rtnString().equals("1")) {
			System.out.println("1번입력 책 추가");
		}else if(rtnString().equals("2")) {
			System.out.println("2번입력 책 수정");
		}else if(rtnString().equals("3")) {
			System.out.println("3번입력 책 삭제");
		}
	}
	
	public static String rtnString() {
		Scanner sc = new Scanner(System.in);
		String rtn_Data = sc.nextLine();
		return rtn_Data;
	}
	
}
