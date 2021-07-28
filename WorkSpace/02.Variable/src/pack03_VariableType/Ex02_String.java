package pack03_VariableType;

public class Ex02_String {
	public static void main(String[] args) {
		//1.클래쓰를 만든다.
		//2.mainMethod를 만든다.
		//character라는 변수 타입
		//integer = int
		//문자 데이터 타입 : char(2byte) ▶ 하나의 글자만 저장 : 유니코드
		//※값을 저장할때는 더블코테이션 " (쌍따옴표)가아니라 
		// 싱글 코테이션을 사용한다 . '(따옴표)
		char a = 'A';
		System.out.println("변수 a의 값 : " + a);
		char b = '가';
		System.out.println("변수 b의 값 : " + b);
		char c = '★';
		System.out.println("변수 c의 값 : " + c);
		
		//String : 문자 , 문자열을 저장할 수 있는 ※클래스
		//값을 할당(대입) 할때는 더블 코테이션을 사용
		//변수 method 기타등등 은 소문자로 시작
		//Class는 대문자 시작
		String str1 = "A";
		System.out.println("str1의 값 : " +str1);
		String str2 = "BCDEFT";
		System.out.println("str2의 값 : " + str2);
		//문자열 + 문자열은 = 문자열
		//String + int = String
		
		//문제 String 형 변수 타입으로 변수명은 name , job으로 선언
		//그리고 값을 각각 자신의 이름과 주니어개발자라고 할당한후에
		//syso를 하나만 이용해서 출력
		String name , job;
		name = "김영문";
		job = "주니어개발자";
		System.out.println("이름: 자신의이름 직업 : 주니어개발자");
	
		
	}
}
