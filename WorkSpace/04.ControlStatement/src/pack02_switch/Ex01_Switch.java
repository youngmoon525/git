package pack02_switch;

public class Ex01_Switch {
	public static void main(String[] args) {
		// Switch==선택문
		// 다중 if문을 조금 보기편하게 간략하게 표현된형태
		// switch(기준값)
		// switch(기준값)
		// case 90 : 기준값 == case 값
		// break; //case가 끝나는 부분은 break로 끝냄
		int score = 5;
		switch (score / 10) { //기준값
		case 10: //if ( score/10 == 10 )
			System.out.println("A학점");
			break;
		case 9://else if 
			System.out.println("A학점");
			break;
		case 8://else if
			System.out.println("B학점");
			break;
		case 7://else if case{
			System.out.println("C학점");
			break;//}break
		default://else 
			System.out.println("F학점");
			break;
		}
		// 기준값 비교값에 정수형 데이터를 보통 많이 사용함
		// 실행문 뒤에는 반드시 break;를 입력
		// 제한 사항으로 인해 실무에서는 거의 사용을 안함(메뉴)
		
		// 어떤값 a가 짝수인지 홀수인지 판별하는 프로그램을 swtich문을
		// 통해서 작성해보세요
		//String id = < inputtext 
		//if(id == "aaa" ) {
		//	System.out.println("로그인이 되었습니다");
		//}else {
		// 	System.out.println("로그인이 실패했습니다.");	
		//}

	}// main
}// class
