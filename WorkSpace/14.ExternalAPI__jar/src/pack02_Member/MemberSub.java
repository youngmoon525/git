package pack02_Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSub {
	private Scanner sc;

	public MemberSub(Scanner sc) {
		this.sc = sc;
	}

	// 회원 정보 입력
	public void insertMember() {
		System.out.println("회원 정보 입력");
	}

	public void deleteMember() {
		System.out.println("회원 정보 삭제");
	}

	public void updateMember() {
		System.out.println("회원 정보 수정");
	}

	public void selectMember() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list =  dao.selectMember();
		dao.display(list);
	}

	public void selectAddr() {
		System.out.println("회원 주소 검색");
	}

	public void selectName() {
		System.out.println("회원 이름 검색");
	}

	public void selectTel() {
		System.out.println("회원 전화번호 검색");
	}
}
