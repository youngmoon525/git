package pack02_Member;

//실제 프로그램이 구동 될 Main메소드가 있는부분
//DAO<-CRUD 
public class MemberMain {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		dao.selectMember();
	}
}
