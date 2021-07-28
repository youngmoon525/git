import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		// Random이라는 클래스를 통해서 Random한 값을 임의의값을 생성하고
		// 그값을 유저가 맞추는 게임
		Random random = new Random(); // Class -> 객체 -> 인스턴스화
		int comNumber = random.nextInt(100) + 1;// 100까지만 0~99 100개 1~100
		System.out.println(comNumber);
		int userNumber = 0; // 사용자가 입력을 하는
		// 무한루프
		//사용자가 몇번의 시도를 통해서 정답을 맞췄는지를 알수있는
		//int cnt = 0; 
		//를 선언 초기화 후 몇번의 시도를 통해서 정답을 맞췄는지 출력
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			System.out.println("1부터 100 사이의 정수를 입력하세요 ▶");
			try {

				userNumber = Integer.parseInt(sc.nextLine());
				cnt ++ ;
				if (comNumber > userNumber) {
					System.out.println("더 큰수를 입력하세요!");
				}else if(comNumber < userNumber) {
					System.out.println("더 작은 수를 입력하세요!");
				}else {
					System.out.println("맞췄습니다.!");
					System.out.println("총" + cnt + "번의 시도를 했습니다");
					break;
				}
			} catch (Exception e) {
				System.err.println("정수를 입력하세요.");
			}finally {
				//무조건 실행하고 싶은 코드 
				
			}
			System.out.println(userNumber);
		}
	}// main
}// class
