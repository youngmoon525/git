package pack03_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04_BufferReader {
	public static void main(String[] args) throws IOException {
	
		//Reader reader = new FileReader("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex04_Buffer.txt");
		//char[] x 
		//BufferedReader br = new BufferedReader(reader);
		//1.번째 방법
		BufferedReader br = new BufferedReader(
					new FileReader("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\Ex04_Buffer.txt")
				);
		
		//한줄씩 데이터를 읽어온다.
		//String data = br.readLine();//읽어온 데이터가 없으면 null을 반환 함.
		//System.out.println(data);
		//반복을 해야하는 횟수를 모름.
		while (true) {
			String data = br.readLine(); //
			if(data == null) {break;}
			System.out.println(data);
		}
		br.close();
		
		//Ex04_Buffer에는 여러줄의 데이터가 존재 한다.
		//데이터 전부를 읽어와서 출력 할수있게 처리하시오.
		//for<정해진 크기를 아는 상태  while<정해진 크기를 모르는 상태
		//11:52 
		
	
	}
}
