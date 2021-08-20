package pack03_File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex03_Writer {
	public static void main(String[] args) throws IOException  {
		//Reader <= 파일을 읽어옴	InputStream
		//Writer => 파일을 만듬(데이터를 씀) OutputStream
		Writer writer = new FileWriter("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex03_Writer.txt");
		String str = "kym555";
		
		writer.write(str);
		writer.flush();
		writer.close();
		//방금 생성한 파일을 Reader를 이용해서 읽은 다음 출력하기 11:31
		//Log를 남길때 많이 사용함.
		Reader reader = new FileReader("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex03_Writer.txt");
		str = ""; //txt파일을 읽어와서 저장할 변수 lv
		char[] buffer = new char[5];
		int readCharNum = reader.read(buffer);
		System.out.println(readCharNum);
		if(readCharNum != -1) { // -1 아무 정보도 못 얻어 왔을때.
			for (int i = 0; i < buffer.length; i++) {
				str += buffer[i];
			}
		}
		System.out.println(str);
		reader.close();
	}
}
