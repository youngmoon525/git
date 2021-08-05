package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputSingle {
	/*
	 * -사용자가 영문자를 입력-> Enter 입력
	 * -Enter를 입력한다는것은 문자열을 끝내겠다가 아니라 
	 * -CR(Carriage Return) : 커서를 줄의 맨압으로 이동
	 * -LF(Line Feed) : 커서를 한 줄 아래로 이동
	 */
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("영문자 1글자를 입력하세요 :  ");
		
		int data = is.read();
		System.out.println("ASCII CODE : " + data);	//65: 아스키코드	
		System.out.println("Character : " + (char)data); //A
		
		data = is.read();							//Enter : CR
		System.out.println("ASCII CODE : " + data);	//13
		System.out.println("Character : " + (char)data);//공백문자
		
		data = is.read();							//Enter : LF
		System.out.println("ASCII CODE : " + data); //10
		System.out.println("Character : " + (char)data);//공백문자 
	}
}
