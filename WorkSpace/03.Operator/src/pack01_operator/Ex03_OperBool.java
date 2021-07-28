package pack01_operator;

public class Ex03_OperBool {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);//true = 참 , false = 거짓 
		//참 = (1+1) != 2 : flase 
		//참 = (1+1) != 3 : true
		play = !play; // 정수형 , != Not , and , or 
		//!1 = 0 , !0 = 1;
		System.out.println(play);
		play = !play;
		System.out.println(play);
	}
}
