package pack03_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_ImgStream {
	//파일(그림,음원,영상)에서 바이트 단위로 입출력하는 스트림
	//FileInputStream , FileOutputStream
	//이미지 파일을 읽어서 출력하는 프로그램 : Copy & Paste
	//원본이미지 준비 : D:\Study_JAVA\WorkSpace\13_IOTEST\IOimg.jpg
	//FileInput<-원본이미지를 가져옴 copy
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg.jpg");//파일경로
		FileOutputStream fos = new FileOutputStream("D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg_5.jpg");
		
		int data , cnt = 0;
		while( (data = fis.read()) != -1  ) {
			cnt++; //파일의 바이트에 얼마나 접근하는지 (파일의크기)
			System.out.println(data); //이미지의 픽셀값(RGB)
			fos.write(data);          //
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("접근 횟수 : " + cnt);
	}
}
