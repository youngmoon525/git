package pack02_Member;

import java.util.Scanner;

//실제 프로그램이 구동 될 Main메소드가 있는부분
//DAO<-CRUD 
public class MemberMain {
	public static void menuDisplay() {
		System.out.println("======== 사용자 관리 ========");
		System.out.println("1.회원정보 가입 : I ※");
		System.out.println("2.회원정보 삭제 : D ※");
		System.out.println("3.회원정보 수정 : U ※");
		System.out.println("4.회원정보 검색 : S ※");
		System.out.println("5.회원주소 검색 : A ※");
		System.out.println("6.회원이름 검색 : N ※");
		System.out.println("7.전화번호 검색 : T ※");
		System.out.println("8.로그인 : L ※");
		System.out.println("9.비밀번호찾기 : F ※");
		System.out.println("10.프로그램 종료  : E ");
		System.out.println("=============================");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberSub sub = new MemberSub(sc);
		while (true) {
			menuDisplay();
			System.out.println("메뉴를 입력해 주세요. 알파벳 ▶: ");
			String menu = sc.nextLine();
			if (menu.equalsIgnoreCase("i")) {
				sub.insertMember();
			} else if (menu.equalsIgnoreCase("d")) {
				sub.deleteMember();
			} else if (menu.equalsIgnoreCase("u")) {
				sub.updateMember();
			} else if (menu.equalsIgnoreCase("s")) {
				sub.selectMember();
			} else if (menu.equalsIgnoreCase("a")) {
				sub.selectAddr();
			} else if (menu.equalsIgnoreCase("n")) {
				sub.selectName();
			} else if (menu.equalsIgnoreCase("t")) {
				sub.selectTel();
			} else if (menu.equalsIgnoreCase("e")) {
				System.out.println("8.프로그램 종료  : E ");
				break;
			}else {
				System.out.println("잘못된입력");
			}
		}
	}
}
