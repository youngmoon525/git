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

	public static void userMenu(int flag) {

		System.out.println("======== 사용자 모드 ========");
		if (flag == 0) {
			System.out.println("1.회원 가입 : 1 ");
			System.out.println("2.로그인 : 2 ");
			System.out.println("3.비밀번호찾기 : 3 ");
			System.out.println("5.프로그램 종료  : 5 ");
		} else if (flag == 1) {
			System.out.println("1.로그아웃 : 1");
			System.out.println("2.회원정보 수정 : 2 ");
			System.out.println("5.프로그램 종료  : 5 ");
		}

	}

	public static void main(String[] args) {
		// adminMenu();
		Scanner sc = new Scanner(System.in);

		MemberDAO memdao = new MemberDAO();// pack02_MemberDAO getConn사용하려고 인스턴스화
		UserDAO dao = new UserDAO(memdao);// DAO
		UserDTO dto = null;
		// DTO , DAO
		String menu = "";
		while (true) {

			if (dto == null) {
				userMenu(0);
				menu = sc.nextLine();
				if (menu.equals("1")) {
					System.out.println("회원가입");
					// 1.아이디는 반드시 입력하되 중복되는 아이디인지 먼저 체크

					String id = sc.nextLine();
					String pw = "";
					int idCnt = dao.idCheck(id);
					if (idCnt != 0) {
						System.out.println("사용중인 아이디 입니다.");
					} else {
						pw = sc.nextLine();
						if (pw.length() < 4) {
							System.out.println("패스워드를 길게 입력해야 됩니다.");
						}
					}
					
					// 2.아이디와 패스워드는 반드시 4글자 이상 공백을 허용안함.
					UserDTO joinDTO = new UserDTO(id, pw, sc.nextLine(), sc.nextLine(), sc.nextLine())	;
					dao.userJoin(joinDTO) ;//<

				} else if (menu.equals("2")) {
					System.out.println("아이디를 입력하세요.▶");
					String id = sc.nextLine();
					System.out.println("비밀번호를 입력하세요.▶");
					String pw = sc.nextLine();
					dto = dao.userLogin(id, pw);
					if (dto == null) {
						System.out.println("아이디 비밀번호를 잘못입력함!!!!!");
					}
					System.out.println("==");
				} else if (menu.equals("3")) {
					System.out.println("비밀번호 찾기");
				} else if (menu.equals("5")) {
					System.out.println("종료");
					break;
				}
			} else {
				System.out.println("로그인 되었습니다.");
				userMenu(1);
				menu = sc.nextLine();
				if (menu.equals("1")) {
					System.out.println("로그아웃");
					System.out.println(dto.getName() + "님이 로그아웃 되었습니다.");
					dto = null;
				} else if (menu.equals("2")) {
					System.out.println("회원정보 수정");
				} else if (menu.equals("5")) {
					System.out.println("종료");
					break;
				}

			}
		} // while

	}
}
