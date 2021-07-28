
public class Ex02_for {
	public static void main(String[] args) {
		//순환문 , Loop 
		//{} == 지역을 가진다는 의미
		if(true) {
			int aa = 12;
		}
		//	조건이 true일동안 반복
		// 0 < 10 == true
		// 1 < 10 == true
		// 10 < 10 == false
		//for(초기값 ; 조건식 ; 증감식){
			//반복할 문장 --작성
		//}
		for(int i = 0 ; i<10 ; i++) { //
			if(i % 2 == 0) {
				System.out.println("i 의 값 : " + i);
			}else {
				System.out.println("i 의 값 : " + i);
			}
		}
		
	}//main
}//class
