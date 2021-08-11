package pack02_Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSub {
	private Scanner sc;

	public MemberSub(Scanner sc) {
		this.sc = sc;
	}

	public void insertMember() {
		System.out.println("회원 정보 입력");
		System.out.println("회원번호를 입력해주세요▶");
		int num = Integer.parseInt(sc.nextLine()); // Id
		MemberDAO dao = new MemberDAO();
		// ? num을 입력했을때 그값이 이미 Database에서 사용되는 값이면
		// 회원 정보 입력을 할수가없음(key)
		// 이미 사용중인 num인지를 체크할 필요가 있다.
		MemberDTO dto = dao.checkNum(num);// num => DB
		// null
		if (dto == null) {// 검색 결과가 없다 = 사용가능한 번호 = key값을 아직 사용안한상태
			System.out.println("이름을 입력하세요 ▶");
			String name = sc.nextLine();
			System.out.println("나이를 입력하세요 ▶");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("주소를 입력하세요 ▶");
			String addr = sc.nextLine();
			System.out.println("전화번호를 입력하세요 ▶");
			String tel = sc.nextLine();
			dto = new MemberDTO(num, name, age, addr, tel);
			int succ = dao.insertMember(dto);
			if (succ > 0) {
				System.out.println("회원 등록 성공");
			} else {
				System.out.println("등록 실패 ");
			}
		} else {
			System.out.println("다른 번호를 입력해주세요.");
			System.out.println(num + "번은 이미 사용중인 번호입니다 메인으로 돌아갑니다.");
		}
	}

	public void deleteMember() {
		System.out.println("회원 정보 삭제");
		MemberDAO dao = new MemberDAO();
		dao.display(dao.selectMember());
		System.out.println("회원번호를 입력해주세요▶");
		int num = Integer.parseInt(sc.nextLine()); // Id

		if (dao.deleteMember(num) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		dao.display(dao.selectMember());
	}

	public void updateMember() {
		System.out.println("회원 정보 수정 화면");
		System.out.println("수정할 회원번호를 입력하세요 ▶");
		MemberDAO dao = new MemberDAO();
		dao.display(dao.selectMember());
		int num = Integer.parseInt(sc.nextLine());
		MemberDTO dto = dao.checkNum(num);// dto != null 회원 정보가 있음 == 수정도 할수있음
		if (dto == null) {
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println("없는 회원 번호 입니다. 메뉴로 돌아갑니다.");
		} else {
			// key값은 데이터를 구별할수있는 유일한 값이기때문에 수정하면 안된다.
			// ex) 주민등록번호 , 지문 , dna
			// ex) id ,게시글의 번호
			System.out.println("수정할 회원의 이름을 입력하세요 ▶ 현재 값 : " + dto.getName());
			String name = sc.nextLine();
			if (name.trim().length() == 0) {
				name = dto.getName();
			}
			System.out.println("수정할 회원의 나이를 입력하세요 ▶ 현재 값 : " + dto.getAge());
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("수정할 회원의 주소를 입력하세요 ▶ 현재 값 : " + dto.getAddr());
			String addr = sc.nextLine();
			System.out.println("수정할 회원의 전화번호 입력하세요 ▶ 현재 값 : " + dto.getTel());
			String tel = sc.nextLine();
			dto = new MemberDTO(num, name, age, addr, tel);

			if (dao.updateMember(dto) > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}

			dao.display(dao.selectMember());
		}
	}

	public void selectMember() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();
		dao.display(list);
	}

	
	//3번 방법
	public void selectAddr() {
		System.out.println("회원 이름 검색");
		//1.검색할 주소를 입력 받는다.
		String inputData = sc.nextLine();
		String sql = "select * from tblmember where addr like ?";
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao. likeSelect2( sql , inputData);
		dao.display(list);
	}

	public void selectName() {
		System.out.println("회원 이름 검색");
		//1.검색할 주소를 입력 받는다.
		String inputData = sc.nextLine();
		String sql = "select * from tblmember where name like ?";
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao. likeSelect2( sql , inputData);
		dao.display(list);
	}

	public void selectTel() {
		System.out.println("회원 전화번호 검색");
		//1.검색할 주소를 입력 받는다.
		String inputData = sc.nextLine();
		String sql = "select * from tblmember where tel like ?";
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao. likeSelect2( sql , inputData);
		dao.display(list);
	}

	//2번 방법
//	public void selectLike(String colName) {
//		System.out.println("회원 주소 검색");
//		//1.검색할 값을 입력 받는다.
//		String inputData = sc.nextLine();
//		MemberDAO dao = new MemberDAO();
//		ArrayList<MemberDTO> list = dao.likeSelect(colName , inputData);
//		dao.display(list);
//	}

	// 1번 방법
	// public void selectAddr() {
	// System.out.println("회원 주소 검색");
//		//1.검색할 주소를 입력 받는다.
//		String addr = sc.nextLine();
//		MemberDAO dao = new MemberDAO();
//		ArrayList<MemberDTO> list = dao.addrSelect(addr);
//		dao.display(list);
//	}
//
//	public void selectName() {
//		System.out.println("회원 이름 검색");
//		//1.검색할 주소를 입력 받는다.
//		String name = sc.nextLine();
//		MemberDAO dao = new MemberDAO();
//		ArrayList<MemberDTO> list = dao.nameSelect(name);
//		dao.display(list);
//	}
//
//	public void selectTel() {
//		System.out.println("회원 전화번호 검색");
//		//1.검색할 주소를 입력 받는다.
//		String tel = sc.nextLine();
//		MemberDAO dao = new MemberDAO();
//		ArrayList<MemberDTO> list = dao.telSelect(tel);
//		dao.display(list);
//	}
}
