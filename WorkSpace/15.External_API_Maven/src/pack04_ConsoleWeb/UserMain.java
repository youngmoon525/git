package pack04_ConsoleWeb;

import java.util.Scanner;

import pack02_Member.MemberDAO;

//실제 프로그램이 구동 될 Main메소드가 있는부분
//DAO<-CRUD 
public class UserMain {
	public static void menuDisplay() {
		System.out.println("1.관리자 모드");
		System.out.println("2.사용자 모드");
	}

	public static void adminMenu() {
		System.out.println("======== 관리자 모드 ========");
		System.out.println("1.회원정보 삭제 : 1 ※");
		System.out.println("2.회원정보 검색 : 2 ※");
		System.out.println("3.회원주소 검색 : 3 ※");
		System.out.println("4.회원이름 검색 : 4 ※");
		System.out.println("5.전화번호 검색 : 5 ※");
		System.out.println("6.프로그램 종료  : 6 ");
		System.out.println("=============================");
	}

	public static void userMenu() {
		System.out.println("======== 사용자 모드 ========");
		System.out.println("1.회원 가입 : 1 ");
		System.out.println("2.로그인 : 2 ");
		System.out.println("3.비밀번호찾기 : 3 ");
		System.out.println("4.회원정보 수정 : 4 ");
		System.out.println("5.프로그램 종료  : 5 ");
	}

	public static void main(String[] args) {
		// adminMenu();
		Scanner sc = new Scanner(System.in);
		MemberDAO memdao= new MemberDAO();
		UserDAO dao = new UserDAO(memdao);
		// DTO , DAO
		while (true) {
			userMenu();
			String menu = sc.nextLine();
			if(menu.equals( "1" )) {
				System.out.println("회원가입");
			}else if(menu.equals( "2" )) {
				System.out.println("아이디를 입력하세요.▶");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력하세요.▶");
				String pw = sc.nextLine();
				//System.out.println("id : " + id  + "pw : " + pw);
				dao.userLogin(id , pw);
			}else if(menu.equals( "3" )) {
				System.out.println("비밀번호 찾기");
			}else if(menu.equals( "4" )) {
				System.out.println("회원정보 수정");
			}else if(menu.equals( "5" )) {
				System.out.println("종료");
			}
		}

//		Scanner sc = new Scanner(System.in);
//		MemberSub sub = new MemberSub(sc);
//		while (true) {
//			menuDisplay();
//			System.out.println("메뉴를 입력해 주세요. 알파벳 ▶: ");
//			String menu = sc.nextLine();
//			if (menu.equalsIgnoreCase("i")) {
//				sub.insertMember();
//			} else if (menu.equalsIgnoreCase("d")) {
//				sub.deleteMember();
//			} else if (menu.equalsIgnoreCase("u")) {
//				sub.updateMember();
//			} else if (menu.equalsIgnoreCase("s")) {
//				sub.selectMember();
//			} else if (menu.equalsIgnoreCase("a")) {
//				sub.selectAddr();
//			} else if (menu.equalsIgnoreCase("n")) {
//				sub.selectName();
//			} else if (menu.equalsIgnoreCase("t")) {
//				sub.selectTel();
//			} else if (menu.equalsIgnoreCase("e")) {
//				System.out.println("8.프로그램 종료  : E ");
//				break;
//			}else {
//				System.out.println("잘못된입력");
//			}
//		}
	}
}
