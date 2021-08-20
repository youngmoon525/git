package pack02_OutputStream;

public class Ex01_SystemOut {
	public static void main(String[] args) {
		System.out.write(65); // 데이터가 콘솔에 출력이 안됨.
		System.out.flush();//강제출력  
		//스트림 버퍼에 저장되어 있는 데이터를 강제적으로 출력을 해줘야함. 
		//기본적인 출력 스트림은 버퍼에 데이터가 가득 차면 그때 데이터를 출력시킴.
		//File InputStream OutputStream
	}
}
