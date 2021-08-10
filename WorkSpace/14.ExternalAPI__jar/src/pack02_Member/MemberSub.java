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
		System.out.println("회원번호를 입력해주세요▶");
		int num = Integer.parseInt(sc.nextLine()); //Id 
		MemberDAO dao = new MemberDAO();
		//? num을 입력했을때 그값이 이미 Database에서 사용되는 값이면
		// 회원 정보 입력을 할수가없음(key)
		// 이미 사용중인 num인지를 체크할 필요가 있다.
		MemberDTO dto =  dao.checkNum(num);//num => DB  
		//null 
		if(dto == null) {//검색 결과가 없다 = 사용가능한 번호 = key값을 아직 사용안한상태
			System.out.println("이름을 입력하세요 ▶");
			String name = sc.nextLine(); 
			System.out.println("나이를 입력하세요 ▶");
			int age = Integer.parseInt( sc.nextLine() );
			System.out.println("주소를 입력하세요 ▶");
			String addr = sc.nextLine(); 
			System.out.println("전화번호를 입력하세요 ▶");
			String tel = sc.nextLine(); 
			dto = new MemberDTO(num, name, age, addr, tel);
			dao.insertMember(dto);
		
		}else {
			System.out.println("다른 번호를 입력해주세요.");
			System.out.println(num + "번은 이미 사용중인 번호입니다 메인으로 돌아갑니다.");
		}
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
