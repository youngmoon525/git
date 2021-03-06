import java.util.Scanner;

public class TestMain {
	public static UserDTO loginInfo = null;

	public static void main(String[] args) {
		while (true) {
			UserDAO dao = new UserDAO();
			String menu = "";
			if (loginInfo == null) {

				System.out.println("상품 관리 프로그램 ▶");
				String id = Common.rtnString("아이디를 입력해주세요.");
				String pw = Common.rtnString("비밀번호를 입력해주세요.");
			
			

				loginInfo = dao.userLogin(id, pw);
			}
			if (loginInfo == null) {
				System.out.println("아이디와 비밀번호를 확인해주세요");
			} else {
				if (loginInfo.getAdmin().equalsIgnoreCase("Y")) {
					System.out.println("1.관리자 모드");
					System.out.println("2.사용자 모드");
					menu = Common.rtnString("메뉴를 입력해주세요.");
					if (menu.equalsIgnoreCase("1")) {
						MasterMode ms = new MasterMode();
						ms.masterStart();
					} else if (menu.equalsIgnoreCase("2")) {
						System.out.println("사용자 모드가 시작 됨");
						UserMode us = new UserMode();
						us.userStart();
					}
				} else {
					System.out.println("사용자 모드가 바로 시작 됨");
					UserMode us = new UserMode();
					us.userStart();
				}
			}
		}

	}// main
}
