package pack01_if1;

import java.util.Scanner;

public class Ex04_testIf {
	public static void main(String[] args) {
		//어떤 값을 Scanner를 통해서 입력을 받는다.
		//입력된 값이 100을 초과하면 오류라고 출력을 함. 조건식 A
		//입력 된 값이 90이상이면 A라고 출력 90이상이면서 100과같다면 A+라고 출력
		//그외에 90미만이면 B라고 출력 90미만이면서 80이하면 C라고 출력
		//if else 중첩 if문 사용해서 작성
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); //sc.nextLine() 스캐너를 통해서 값을 입력받음
		//String sc.nextLine 
		int score = Integer.parseInt(inputData);
		if(score > 100) {
			System.out.println("오류");
		}else {
			//score값이 100이하로 들어옴
			//입력 된 값이 90이상이면 A라고 출력
			if(score >= 90) {//조건식 B
				
				//100과같다면 A+라고 출력
				if (score == 100) {//조건식C (조건식B를 만족한 상태)
					System.out.println("A+");
				}else {
					System.out.println("A");
				}
			}else {
				
				if(score <= 80) {
					System.out.println("C");
				}else {
					System.out.println("B");
				}
				// 90미만이면 B라고 출력 90미만이면서 80이하면 C라고 출력
			}
		}
		//스캐너에서 어떤값을 입력받음
		//1.inputData -> Casting(Boxing) 을 통해 int로 변경
		//2.if(조건식 A) {}  else{ 중첩 if문 부분}
	/*	if(true) {
			syso("출력");
		}else {
			syso("출력");
			if(true) {
				if(true) {
					
				}
			}
		}*/
	
	
	
	}
}//class
