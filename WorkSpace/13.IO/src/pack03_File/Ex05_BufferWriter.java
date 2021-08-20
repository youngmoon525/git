package pack03_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex05_BufferWriter {
	public static void main(String[] args) throws IOException {
		//OutputStream =======> Writer===> BufferedWriter
	//	Writer out = new FileWriter("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex05_BufferW.txt");
	//	BufferedWriter bw = new BufferedWriter(out);
		
		//
		BufferedWriter bw = new BufferedWriter(
					new FileWriter("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex05_BufferW.txt")
				);
		
		String str = "긴 문자열을 저장을 해봅시다. \n 긴 문자열을 저장합시다.";
		str += "긴 문자열을 저장합시다 \n 긴 문자열을 저장합시다.";
		
		bw.write(str);
		bw.flush();
		bw.close();
	}
}
