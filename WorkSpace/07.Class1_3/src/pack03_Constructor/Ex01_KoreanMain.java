package pack03_Constructor;

public class Ex01_KoreanMain {
	public static void main(String[] args) {
	
		Ex01_Korean ek = new Ex01_Korean();//파라메터(인자) 가 없는
		System.out.println(ek.nation);
		Ex01_Korean ek2 = new Ex01_Korean("String"); // String 
		System.out.println(ek2.nation);
		System.out.println("================");
		Ex01_Korean ek3 = new Ex01_Korean("테스트1 파라메타 1", "테스트2 파라메타 2");
		System.out.println(ek3.name);
		System.out.println(ek3.nation);

		Ex01_Korean ek4 = new Ex01_Korean();
		ek4.name = "김영문";
		ek4.ssn = "000000-0000000";
		System.out.println(ek4.name);
		System.out.println(ek4.nation);
		System.out.println(ek4.ssn);
		//ssn에 자기년생 두자리 000000 - 0000000 가 나오게 출력하세요 
		//1.생성자 메서드를 이용한 방법
		//2.객체의 field에 바로접근해서 수정해서 출력하는 방법
		//System.out.println(ek3.ssn);
	}
}
