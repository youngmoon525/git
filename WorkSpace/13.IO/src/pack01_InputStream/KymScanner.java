package pack01_InputStream;

import java.io.InputStream;
import java.io.InputStreamReader;

public class KymScanner {
	//객체화(인스턴스화) < 생성자 메소드 사용
	//Scanner 이름 = new Scanner(System.in) InputStream을 변수로 받음
	InputStreamReader isr; //iv < null 
	//InputStream is = System.in ;//키보드 입력값을 받는 inputStream
	//InputStreamReader = new InputStreamReader(is)
	public KymScanner(InputStream in) {
		this.isr = new InputStreamReader(in);
	}
	public KymScanner() {
		this.isr = new InputStreamReader(System.in);
	}
	
	
	//Scanner.nextLine()을 사용하면 String이 return되었었음.
	public String nextLine() {
		int data;//lv
		String rtnData = ""; //값을 계속해서 누적시킨다음 리턴할 변수lv
		try {
			while( (data = isr.read()  )    != -1        ) {
				if(data == 13) {//enter키를 눌렀는지 
					break;
				}
				rtnData = rtnData + ((char)data );
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rtnData;
	}
	
	public int nextInt() {
		int data;//lv
		String rtnData = ""; //값을 계속해서 누적시킨다음 리턴할 변수lv
		try {
			while( (data = isr.read()  )    != -1        ) {
				if(data == 13) {//enter키를 눌렀는지 
					break;
				}
				
				rtnData = rtnData + ((char)data );
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//LineFeed(공백문자)
		System.out.println(rtnData.length());
		return Integer.parseInt(rtnData.trim());
	}
	
}
