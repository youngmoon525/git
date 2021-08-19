package pack04_ConsoleWeb;

import pack02_Member.MemberDAO;

public class affa {
	public static void main(String[] args) {
		MemberDAO aa =  new MemberDAO();
		UserDAO dao = new UserDAO(aa);
		UserDTO dto = new UserDTO("32", "42", "4:4", "1234", "2512");
		dao.userJoin(dto);
	}
}
