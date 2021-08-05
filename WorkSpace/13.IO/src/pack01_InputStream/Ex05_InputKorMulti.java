package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05_InputKorMulti {
	public static void main(String[] args) throws IOException {
		//1.한글 여러글자를 입력받아서 콘솔창에 출력해보세요.
		//while문을 사용하시면 되고 Ex03 예제를 참고해서 만들어보세요.
		
		//2.엔터키 (CR , LF ) 는 출력이 안되게 막아보세요.
		//if        13 , 10
		//InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("한글을 여러글자 입력해주세요.");
		int data;
		while( (data = isr.read()) != -1   ) {
			if(data != 13 && data != 10) {//& == *  |== +
				System.out.println("입력하신 글자는 " + (char)data + "입니다.");
			}
		}
	}
}
