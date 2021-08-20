package pack03_File;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02_Reader {
	public static void main(String[] args) throws IOException {
		//
		//? 
		Reader reader = new FileReader("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex02_Reader.txt");
		String str = ""; //txt파일을 읽어와서 저장할 변수 lv
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

	}//main()//
}
