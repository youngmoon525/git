package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex03_OutputMulti {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		char a = '안';//한글데이터 
		char b = 'B' ;//영어데이터
		char c = 'C' ;
		
		os.write(a); //OutputStrem, InputStream 기능을 사용시에는 반드시 예외처리 
		os.write(b);
		os.write(c);
		
		os.flush();//강제 출력 
		os.close();//사용이 종료 후 클로즈를 해준다.
	}
}
