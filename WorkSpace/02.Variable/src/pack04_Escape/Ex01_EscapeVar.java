package pack04_Escape;

public class Ex01_EscapeVar {
	public static void main(String[] args) {
		//Escape 탈출문.
		//\t tab 들여쓰기
		//\n 줄바꿈  
		//문자열 안에 코테이션 값이나 여러가지 값을
		//문자열로 인식하게끔 함 \
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\\\여름\\가을\\겨울");
		//어떤 값을 출력하는 형태를 포맷이라고하는데 포맷이 있는경우의
		//출력은 printf를 사용 ( 주로 콘솔 프로그램에서 많이 사용함)
		int value = 123;
		System.out.printf("상품의 가격:%d원\n" , value);
		System.out.printf("상품의 가격:%6d원\n" , value);
		System.out.printf("상품의 가격:%-6d원\n" , value);
		System.out.printf("상품의 가격:%06d원\n" , value);
		//int , String 중요도 5중에 4
		//0.2
	
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
}
