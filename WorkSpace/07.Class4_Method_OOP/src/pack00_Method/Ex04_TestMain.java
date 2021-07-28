package pack00_Method;

import java.util.Scanner;

public class Ex04_TestMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String inputData = 
		//사용자에게 정보를 입력받음.
		Ex04_Test et = new Ex04_Test();
		//객체생성 완료 , 인스턴스화
		while(true) {
			if(et.isInt(sc.nextLine())) {
				System.out.println("숫자임");
				//..................
			}else {
				System.out.println("숫자아님");
				//................
			}
		}
		//if(boolean){}
		//et.isInt()<리턴타입이 있는경우
		//et.isInt() == boolean
		
		
		//sc객체를 만들고 사용이끝나면 sc.close();
		
		
	}
}
