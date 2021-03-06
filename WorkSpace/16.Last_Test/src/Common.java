import java.util.Scanner;

public class Common {
	// 공통으로 사용 될 기능들을 정의함
	// 1.메세지를 보여주고 String값을 리턴하는데 1글자 이상인지는 체크하게끔
	public static String rtnString(String msg) {
		String rtnData = null;
		while (true) {
			System.out.println(msg);// 어떤것을 입력해주세요.
			Scanner sc = new Scanner(System.in);
			rtnData = sc.nextLine();
			if (rtnData.trim().length() > 0) {
				return rtnData;
			} else {
				System.out.println("적어도 한글자 이상을 입력해주세요.");
			}
		}
	}// rtnString

	public static int rtnInt(String msg) {
		int rtnInt = 0;
		while (true) {
			System.out.println(msg);
			Scanner sc = new Scanner(System.in);
			try {
				rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			} catch (Exception e) {
				System.out.println("숫자를 입력 해주세요.");
			}
		}
	}

//	public static void main(String[] args) {
//		System.out.println(rtnString("아이디를 입력해주세요. "));
//	}
}
