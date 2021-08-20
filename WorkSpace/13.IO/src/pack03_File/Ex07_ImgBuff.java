package pack03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07_ImgBuff {
	// 버퍼를 이용한 이미지 파일 복사 : 압출력의 효율화
	// BufferdInputStream, BuffOutputStream
	// FileInput->BufferInput
	// FileOutput->bufferOutput
	// 버퍼의 기본크기 : 1024byte
	// 마지막 버퍼에는 기본크기보다 작은 용량이 버퍼에 남아 있다.
	// 마지막 버퍼에 남아 있는 내용을 강제전송(flush())후 종료

	public static void main(String[] args) throws IOException {
		String inPath = "D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg.jpg"; // 원본 파일
		// 원본 이미지를 담을 String변수
		String outPath = "D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg_Buff.jpg";// 사본 파일
		// 원본 이미지를 복사 후 사본이 될 경로
		// FileInputStream fis = new FileInputStream(inPath);//들어오는 원본 파일
		// FileOutputStream fos = new FileOutputStream(outPath);//복사 될 파일

		// BufferedInputStream bis = new BufferedInputStream(fis);
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		/// 2.번 방법
		BufferedInputStream bis = new BufferedInputStream( // 입력 버퍼
				new FileInputStream(inPath));

		BufferedOutputStream bos = new BufferedOutputStream( // 출력 버퍼
				new FileOutputStream(outPath));
		
		int data , cnt = 0;
		while ( (data = bis.read()) != -1) {
			cnt ++ ;
			System.out.println(data);
			bos.write(data);
		}
		
		bos.flush();
		bos.close();
		bis.close();
		System.out.println("접근 횟수 : " + cnt);
		

	}
}
