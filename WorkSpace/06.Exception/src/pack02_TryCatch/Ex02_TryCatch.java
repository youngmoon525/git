package pack02_TryCatch;

public class Ex02_TryCatch {
	public static void main(String[] args) {
		//1.가스불을 켠다 . -> 요리시작 -> 요리끝 -> 가스불 잠근다 - >종료
		try {
			System.out.println("가스불을 켠다.");
			System.out.println("요리시작");
			Integer.parseInt("24141aaaaaa");//예외발생 
			System.out.println("요리끝");
//			System.out.println("가스불 잠근다.");
//			System.out.println("종료");
		}catch (Exception e) {
			System.out.println("119에 신고를 한다.");
			System.out.println("사고가 났다고 주변에 알림");
		}finally {
			//반드시 되어야 하는부분을 작성
			System.out.println("가스불 잠근다.");
			System.out.println("종료");
		}
	}
}
