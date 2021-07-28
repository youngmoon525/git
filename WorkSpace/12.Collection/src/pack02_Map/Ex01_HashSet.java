package pack02_Map;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//	데이터타입(엘리먼트) 
		//A부모클래스는 A로 생성도 되지만
		//A를 물려받은 B로도 생성을 할수가있다.
		
		set.add("Java"); //자바라는 책을 입력함 
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Android");
		set.add("Java"); //데이터 중복의 허용을 하지 않음
		set.add("Android");
		set.remove("Java");
		System.out.println("총 입력 된 객체 수 : " + set.size());
		
		
		
	}
}
