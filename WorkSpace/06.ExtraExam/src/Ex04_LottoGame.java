import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_LottoGame {
	public static int[] arrrrrr() {
		int [] userLotto = new int[6];
		return userLotto;
	}
	
	public static void main(String[] args) {
		// 사용자가 6개의 로또 번호를 입력함.
		// 입력한 값은 배열에 들어감 ( 1~ 45 )까지의 값만 사용가능하며
		// 중복된 값은 입력이 불가하다.
		
		int tempInt = 0; // 배열의 인덱스 제어용
		System.out.println("로또 프로그램 동작 시작");
		
		Scanner sc = new Scanner(System.in);
//		while (true) {
//			try {
//
//				System.out.println("번호를 입력해주세요" + Arrays.toString(userLotto));
//				String inputData = sc.nextLine();
//				int inputNum = Integer.parseInt(inputData);
//				if (inputNum == -1) {
//					break;
//				}
//				if(inputNum > 45 || inputNum < 1) {
//					System.out.println("숫자의 범위를 넘어섰습니다.(1~45)");
//					continue;//continue 반복문의 조건절로 가서 다시 시작함.
//				}else {
//					for (int i = 0; i < userLotto.length; i++) {
//						if(inputNum == userLotto[i]) {
//							throw new Exception();
//						}
//					}
//					//[1] , [2] , [0] , [0] , [0] , [0]
//					//tempInt == 0
//					userLotto[tempInt] = inputNum;
//					tempInt ++ ;
//					
//					if(tempInt == userLotto.length) {       
//						System.out.println("숫자 입력이 완료 되었습니다.");
//						System.out.println(Arrays.toString(userLotto));
//						break;
//					}
//					//break문을 통해서 지금 루핑중인 반복문을 종료해야하는데
//					//어떤 조건을 통해서 break를 써야할지 작성을 해보세요.
//				}
//				// 입력받은값이 1~45 까지가 맞는지 체크하는 if문을 작성
//				// 
//				// ctrl + shift + f
//			} catch (Exception e) {
//				System.out.println("잘못된입력입니다.");
//			}
//			// 예외 처리 ( 문자열이 입력이 안되게끔 try catch를 통해서)
//		}//while 사용자 번호 선택 완료
		
		int[] lotto = new int[6];
		Random random = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1 ; //0이 안나오게 +1
			for (int j = 0; j < i; j++) { // 처음 i값 0 
				//로또 번호에 중복값이 절대 들어올수없게 처리
				
				if(lotto[i] == lotto[j]) {
					i = i - 1;
					break;
				}
				
			}
			System.out.println(Arrays.toString(lotto));
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		int cnt = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < userLotto.length; j++) {
				if(lotto[i] == userLotto[j]) {
					cnt ++ ;
				}
			}
		}
		System.out.println(cnt + "개 맞았음");
	}// main
}// class
