import java.util.Arrays;
import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		//1.금액 입력 (- 반드시 정수형이어야함)
		//2.음료 선택 (-음료의 가격 입력 된 금액이랑 같거나 작은 값을 가져야함)
		//3.음료 배출(잔돈계산) - 금액 - 음료값 = 남은돈
		//4.종료
		//-----------1차 완료
		//1.기능 분리 (로직을 어떻게 할건지 ex.금액 입력을 계속해서 루프를 돌면서 받을건지? , 한번만 입력을 받을건지?)
		//2.기능 분리 (음료라는 배열? ) 금액 , 음료명이 따로 분리 됨
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력");
		int inputNum = Integer.parseInt( sc.nextLine() ); //1번완료 (루프를 돌릴건지 아니면 그냥 사용할건지)
		
		System.out.println("음료를 선택해 주세요. ");
//		System.out.println("1번.콜라(800) 2번.쥬스(600) 3.포카리(1000)");=>하드코딩 한 경우
//		String[] drinkName = {"콜라" , "쥬스"  , "포카리"};
//		int[] drinkPrice = {800 , 600 ,1000};				=>객체로 만들어야 되는 부분(음료-음료수번호,음료명,가격)
		//DrinkDTO dto = new DrinkDTO(); //생성자 메소드를 따로 만들지 않으면 빈 깡통을 이클립스(jvm,컴파일러)에서 지원해줌
		//dto.num = 1;
		//dto.name = "콜라";
		//dto.price = 800 ; 
		//dto객체를 배열 구조로 사용하는게 아니라 하나씩 선언해서 사용하는 경우
		
		//객체를 배열로 사용하는 경우 (반복문과 함께 사용 - 코드가 간결해짐)
		//배열의타입 [](대괄호) 배열의 이름 = new 배열의타입[사이즈int];
		DrinkDTO[] dtos = new DrinkDTO[3];
		dtos[0] = new DrinkDTO(1, "콜라", 800);
		dtos[1] = new DrinkDTO(2, "쥬스", 600);
		dtos[2] = new DrinkDTO(3, "포카리", 1000);
		for (int i = 0; i < dtos.length; i++) { //0~1~2 
			System.out.println(dtos[i].num + "번." + dtos[i].name + "(" + dtos[i].price + ")");
		}
		int ichoose = Integer.parseInt( sc.nextLine() ); //2번완료
		for (int i = 0; i < dtos.length; i++) {
			if(dtos[i].num == ichoose) {
				System.out.println(inputNum - dtos[i].price);
				break;//정확한 음료 선택 시 브레이크(반복문을 종료)
			}
		}
		//if(dto==1) {
			//System.out.println( inputNum - 800 ); 하드코딩 한 경우 
			//System.out.println(inputNum - dto.price);
		//}///else if
		
	}
}
