package pack02_OutputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex05_OutputBuffer {
	public static void main(String[] args) {
		//OutputStream os = System.out;
		//OutputStreamWriter osw = new OutputStreamWriter(os);
		//BufferWriter
		//BufferedWriter bw = new BufferedWriter(osw); //OutputStreamWriter
		BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(System.out)
				);
		try {
			bw.write("이것은 문자열의 데이터입니다 \n 줄바꿈을 해보고있습니다.");
			bw.newLine();
			bw.write("데이터 뉴라인");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		
	}
}
