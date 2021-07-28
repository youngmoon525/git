package pack02_Map;

import java.util.HashSet;
import java.util.Set;

public class Ex02_HashSet {
	public static void main(String[] args) {
		//Member의 상태 정보를 객체화 시킨 MemberDTO를 Set담음
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		MemberDTO member = new MemberDTO("홍길동" , 30 ); //객체를 생성함
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(new MemberDTO("홍길동", 30));
		set.add(member);
		set.add(member);
		set.add(member);
		set.add(member);
		set.add(member);
		set.add(member);
		set.add(member);
		set.add(member);
		// 총 객체의 수는 몇개 일까요?
		//syso 객체수를 출력하시오
		System.out.println("set의 총 객체수 size :" + set.size());
	}
}
