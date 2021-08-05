package pack01_InputStream;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_SystemIn {
	public static void main(String[] args) {
		//IO란 , Input ,Output 즉 입력과 출력 이라고 한다.
		//자바에서의 모든 입출력은 Stream이라는 것을 통해 하는데
		//이건 데이터를 운반하는데 사용되는 연결 통로이다.
		//Stream = 연결 통로
		// Stream(Input)							 Stream(Ouput)
		//키보드 , 프로그램 ,파일 -> java Program -> 다른 프로그램
		//Stream 이란 자료의 흐름이 물의 흐름과 같다는 의미에서 사용되기시작함
		//Stream은 한쪽 방향으로 흐름.
		//물이 한쪽 방향으로 흐르듯이 데이터도 한쪽 방향으로만 흐른다.
		//(단방향 통신)
		//기본적으로 Java에서는 입출력 관련 된 모든 것들을 대부분
		//java.io패키지에서 사용함(제공함)
		//File 시스템의 정보를 얻기위한 File클래스와 데이터를 입출력
		//하기위한 다양한 입출력 스트림 클래스를 사용할수있다.
		//io패키지의 기능들을 이용하기 위해서는 try{}catct{}를 이용한
		//예외처리를 반드시 해야한다.(강제한다)
		try {
			int data = System.in.read();//대기상태(Block state)
			System.out.println(data);
			//System.in==InputStream < 노드 스트림 : 가장 먼저 연결되는 스트림
			//
			//inputStream을 이용해서 데이터를 입력받으면 Ascii코드
			InputStream is = System.in;//<-InputStream
			int bb = is.read(); //Casting Byte=>int 자동 형 변환
			System.out.println(bb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
