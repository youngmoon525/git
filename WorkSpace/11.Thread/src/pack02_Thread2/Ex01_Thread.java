package pack02_Thread2;

import java.awt.Toolkit;

public class Ex01_Thread {
	public static void main(String[] args) {
		//윈도우의 소리를 Toolkit lib 사용할수가있다.
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		//툴킷을 getDefaultToolkit이라는 메소드를 이용해서 초기화시킴
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); //이어폰이 있는경우<
			System.out.println("띠로롱"); //없는 경우 <
			try {
				Thread.sleep(500); //프로그램의 진행을 0.5 딜레이 시킴 
									//Trhead를 0.5초 정도 재움
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //millis == 초 1 * 1000 = 1초
		}
		
	}
}
