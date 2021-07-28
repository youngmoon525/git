package pack01_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex03_Vector {
	public static void main(String[] args) {
		//사용 빈도 수가 낮은 Vector
	
//		List<String> list = new Vector<>();
//		list.add("제목1");
//		list.add("제목2");
//		list.add("제목3");
//		list.add("제목4");
//		list.add("제목5");
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		List<Ex03_Board> list = new Vector<>();
		Ex03_Vector ev = new Ex03_Vector();
		//인스턴스화
		list.add(ev.new Ex03_Board("a1", "b1", "c1"));
		list.add(ev.new Ex03_Board("a2", "b2", "c2"));
		list.add(ev.new Ex03_Board("a3", "b3", "c3"));
		list.add(ev.new Ex03_Board("a4", "b4", "c4"));
		list.add(ev.new Ex03_Board("a5", "b5", "c5"));
		//for문으로 list를 출력해보기 
		for (int i = 0; i < list.size(); i++) {
			//list index 0 ~ list크기만큼 모든 list의 아이템에 접근하는로직
			System.out.println(list.get(i).subject + list.get(i).content);
		}
		
	}//main
	//nastedClass == 중첩클래스 == 인스턴스 멤버
	public class Ex03_Board{
		String subject;
		String content;
		String writer;
		public Ex03_Board(String subject, String content, String writer) {
			this.subject = subject;
			this.content = content;
			this.writer = writer;
		}
		
	}//Ex03_Board
	//Vector 구조를 가지는 List를 만드는데 데이터 타입은 Ex03_Board 
	//list.add 3건정도 추가해서 출력해보기
	
}//Ex03Vector_class
