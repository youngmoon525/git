import java.util.Scanner;

public class A {
	//멤버{
	int a1 ;  //필드 , iv ,인스턴스 멤버
	int a2 ;
	//인스턴스(객체를 생성)화 멤버 //인스턴스화 해야지 사용할수있는부분
	
	static int a3;
	//정적멤버(객체를 생성하지 않고 접근이 가능한 영역)
	
	
	//void 사용하는 경우 return 값이 없는 경우
	//그냥 실행만 하면 되는 경우
	//인스턴스 멤버
	//실행을 하고 그 결과를 받지 않아도 되는 경우
	void voidmethod() {
		System.out.println("void 메소드 ");
	}
	
	//
	boolean boolMethod(int a) {
		if (a == 10) {
			return true;
		}
		return false;
	}
	boolean insertCoin() {
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt( sc.nextLine() );
		//while( 계속해서 반복)
		while (true) {
			if (inputNum == -1) {
				System.out.println("종료해라");
				return false;
			}else if(inputNum == 0) {
				System.out.println("금액 입력 완료");
				return true;
			}
			
		}
	}
	
	//} // 멤버
}
