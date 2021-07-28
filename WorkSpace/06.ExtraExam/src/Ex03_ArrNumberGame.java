import java.util.Random;
import java.util.Scanner;

public class Ex03_ArrNumberGame {
	public static void main(String[] args) {
		// 배열을 사용자가 입력한 크기만큼의 배열 생성
		// int형 배열
		// Random을 통해서 배열의 임의에 index에 1이라는 값을 넣음
		// 그리고 사용자(유저)는 임의에 값이 (index)가 무엇인지 맞추는 게임
		// [?] [?] [?] [?] [?] ,Random 1~5
		// 1 2
		// [0] [1]
		// x o
		Scanner sc = new Scanner(System.in);
		System.out.println("난이도를 입력해주세요. 1부터 아무숫자나 가능합니다.");
		String inputData = null; // Class타입 , 또는 여러가지 참조타입의 변수들은
									// 객체들은 null로 초기화
		int inputNum = 0; // 변수타입이 int일때는 0으로 초기화
		while (true) { // 반복문의 시작
			try {
				inputData = sc.nextLine();
				inputNum = Integer.parseInt(inputData);
				System.out.println("숫자 입력 완료");
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} // 사용자가 숫자를 입력하는 반복문 처리 끝
		System.out.println(inputNum);
		int[] arr1 = new int[inputNum];// 사용자가 입력한 데이터를 정수형으로
		// 변환을하고 그 값을 이용하여 배열의 크기를 할당
		Random random = new Random();
		int ranNum = random.nextInt(inputNum);// 0~ 0~ , ?
		arr1[ranNum] = 1; // [0] , [0] , [0] , ....[1]
		// 무한루프를 시작을 했는데 . for() {}
		while (true) {
			System.out.println("답을 맞춰주세요.");
			try {
				inputData = sc.nextLine();
				inputNum = Integer.parseInt(inputData);
				boolean result = false;
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[inputNum] == 1) {
						result = true;
						break;
					}
				}
				if (result) {
					System.out.println("정답입니다");
					break;
				} else {
					System.out.println("오답입니다.");
				}
				// 사용자의 숫자를 입력 받고
				// 그값이 배열의 index가 맞다면 정답 후 반복문 종료
				// 아니라면 오답후 계속 진행
			} catch (Exception e) {

			}
		}
	}
}
