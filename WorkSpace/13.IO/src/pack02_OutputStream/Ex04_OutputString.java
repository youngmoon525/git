package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04_OutputString {
	public static void main(String[] args) throws IOException {
		//OutputStream을 상속 받은 더 나은 기능이 있는 출력 Stream을 사용한다.
		//OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		//OutputStreamWriter는 반드시 생성할때 OutputStream을 인자값으로 넘겨줘야한다.
		String str = "문자열을 입력\n 줄바꿈을 입력";
		osw.write(str);
		osw.flush();
		osw.close();
	}
}
