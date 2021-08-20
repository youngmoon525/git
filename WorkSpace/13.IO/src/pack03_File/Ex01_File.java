package pack03_File;

import java.io.File;
import java.util.UUID;

public class Ex01_File {
	public static void main(String[] args) {
		//Java.io 패키지에서 지원하는 File
		//인자값으로 파일을 생성하거나 가져올 경로를 String형식으로 넘겨줘야함
		//생성자 메소드 강제 File (String path){ this.path = path }
		File file = new File("D:\\Study_JAVA\\WorkSpace\\13_IOTEST");
		//Escape
		//file이라는 객체가 생성 됨
		//경로의 존재 여부 확인-※필수
		if(file.exists()) { //경로의 존재 여부를 확인합니다. true면 경로가 존재하고/false면 없음
			System.out.println(file.getPath() + " : " + "경로가 존재 합니다.");
		}else {
			System.out.println("경로가 존재 하지 않습니다.");
		} 
		
		file = new File("D:\\Study_JAVA\\WorkSpace\\13_IOTEST2");
		if(file.exists()) {
			System.out.println(file.getPath() + " : " + "경로가 존재 합니다.");
		}else {
			System.out.println("경로가 존재 하지 않습니다.");
			file.mkdir(); //make directory 파일의 경로를 생성한다.
		} 
		
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		//D:D:\\Study_JAVA\\WorkSpace\하위에 자기 이니셜로 폴더 하나 생성해보기 -10:35
		//현재 클래스의 경로 구하기
		//System.out.println(Ex01_File.class.getResource("").getPath());
	}
}
