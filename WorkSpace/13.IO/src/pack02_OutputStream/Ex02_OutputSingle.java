package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex02_OutputSingle {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out; //System.out <-Console
		os.write(65);  //콘솔에 입력 될 데이터를 정의 
		os.flush();    //강제 출력
	}
}
