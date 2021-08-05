package pack01_InputStream;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_InputKorSingle {
	public static void main(String[] args) {
		//IO중 Input 먼저 키보드나 파일등을 통해 프로그램으로 입력 되는
		//데이터를 처리
		//System.out.println("콘솔에 출력") <-out=>OutputStream
		//Scanner sc = new Scanner(System.in) <-in=>InputStream
		//자바에서 지원해주는 API<- 오픈 소스 
		//InputStreamReader : 문자 데이터(Unicode)를 입력받는 스트림
		InputStream is = System.in;//바이트 데이터 : 아스키, 이미지 , 영상 , 음원 등
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("한글 1글자를 입력 해주세요.");
		try {
			int data = isr.read();
			System.out.println("입력 하신 글자는 :" + data + "입니다,");
			System.out.println("입력 하신 글자는 :" + (char)data + "임");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
