import java.util.Scanner;

public class Test_Variable {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputData ; 
		inputData = scanner.nextLine();
		//1. 입력받은 데이터에  +10 된 결과를 출력하세요. 
		//단 숫자값 외에 다른 문자가 입력이 안된다는 가정하에.
		//scanner는 입력을 받기 전까지 프로그램이 scanner.nextline()에 멈춰있음
		//-1.String - > int Boxing 
		//-2.+10
		//첫글자가 대문자로 시작 = class , 소문자 = 변수,메소드 그외
		System.out.println(Integer.parseInt(inputData)+10);
		//2. int -> String 
		//int = 3 , String 
		//android String.valueOf();  String아님 toStrinig()
		System.out.println(3 + "");
	}
}
