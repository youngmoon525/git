package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex03_InputMulti {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("영문자 여러 글자를 입력해주세요 : ");
		
//		while(true) { //입력받은 글자가 몇 글자인지 정확히 판단하기가 
						//while문 만으로는 힘듬

//			int data = is.read();
//			System.out.println("입력하신 영문자는 " + (char)data + "입니다.");
//			if(data == -1) {
//				System.out.println("종료 되었습니다.");
//				break;
//			}
//		}
		int data;
		//While 몇번을 반복해야되는지 정확히 모를때 
		while((data = is.read()) != -1   ) {
			System.out.println("입력하신 영문자는 " + (char) data + "입니다.");
		}
		System.out.println("종료되었습니다.");
		
	}
}
