import java.util.Random;
import java.util.Scanner;

public class Ex02_DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받을 Scanner를 생성
		Random random = new Random();
		// 반복문을 시작
		while (true) {
			System.out.println("게임시작 : 1 , 게임 종료 -1을 입력하세요 ▶");
			try {
				int num = Integer.parseInt(sc.nextLine());
				// -1이 입력되면 반복문 종료 처리 추가
				if (num == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
					// ctrl + shift + f
				}
				if (num == 1) {// 사용자가 게임을 시작했을때
					System.out.println("게임을 시작합니다.");
					System.out.println("사용자가 주사위를 굴릴 차례입니다.");
					System.out.println("Enter Key를 입력하세요 ▶");
					sc.nextLine();
					int userNumber = random.nextInt(6) + 1;// 0~5 +1 = 1 ~ 6
					System.out.println("사용자의 숫자는" + userNumber + "입니다.");
					// 컴퓨터가 주사위를 굴립니다.
					System.out.println("컴퓨터가 주사위를 굴립니다.");
					System.out.println("Enter Key를 입력하세요 ▶");
					sc.nextLine();
					int comNumber = random.nextInt(6) + 1;
					System.out.println("컴퓨터의 숫자는" + comNumber + "입니다.");

					if (userNumber > comNumber) {
						System.out.println("사용자가 승리 하였습니다.");
					} else if (userNumber < comNumber) {
						System.out.println("사용자가 패배 하였습니다.");
					} else {
						System.out.println("무승부 입니다.");
					}
					// enter를 입력해주세요
					// sc.nextLine();
					// 컴퓨터의 숫자를 출력 한 후 user computer중 누구의 주사위
					// 눈금이 더 높은지 비교를 해서 승 패를 출력하고 반복문을
					// 종료하세요.
					//

				} // if 게임 시작에 대한 처리가 끝난 상태

			} catch (Exception e) {
				System.out.println("숫자값을 입력해주세요. 잘못된입력");

			}
		} // while
	}
}
