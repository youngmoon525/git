package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex06_InputBuffer {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in; //바이트 스트림
		InputStreamReader isr = new InputStreamReader(is);//문자 스트림
		BufferedReader br = new BufferedReader(isr); //버퍼 활용 String
		//키보드에서 여러 글자를 입력받아 출력 : 버퍼(buffer)를 활용
		System.out.println("여러 글자를 입력하세요 : ");
		
		String msg = br.readLine(); // readLine() : Enter앞까지의 모든 문자를 입력받음
		System.out.println("입력하신 글자는 " + msg + "입니다.");
		br.close();//buffer를 사용 완료 시 close를 써주는게 관례
	}
}
