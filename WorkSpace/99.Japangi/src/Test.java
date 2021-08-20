import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		rtnInt("음료를 선택해 주세요.");//음료를 선택할때 , 금액을 입력할때 
		rtnInt("금액을 입력해주세요.");//음료를 선택할때 , 금액을 입력할때 
		rtnInt(3);
		Test tes = new Test();
	
	}
	//접근제한자
	//메소드 오버로딩 
	
	//인스턴스 멤버
	//접
	public void aa() {
		
	}
	//만들수 없는 메소드 
	//리턴타입이 있는지 없는지를 작성을 안함
	public static int rtnInt(int msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int inputData = 0;
		try {
			inputData = Integer.parseInt( sc.nextLine() );
			
		}catch (Exception e) {
			System.out.println("잘못 된 입력 입니다.");
		}
		return inputData;
	}
	public static int rtnInt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int inputData = 0;
		try {
			inputData = Integer.parseInt( sc.nextLine() );
			
		}catch (Exception e) {
			System.out.println("잘못 된 입력 입니다.");
		}
		return inputData;
	}
	public static int rtnInt() {
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		try {
			inputData = Integer.parseInt( sc.nextLine() );
			
		}catch (Exception e) {
			System.out.println("잘못 된 입력 입니다.");
		}
		return inputData;
	}
}
