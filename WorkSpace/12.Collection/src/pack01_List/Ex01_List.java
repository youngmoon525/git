package pack01_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
		//배열의 단점 . 크기가 한정 되어있다.
		//정해진 크기로 사용을 해야하며 더 큰 크기를 사용하고 싶을때
		//더 큰 배열을 생성하고 Swap을 통해 데이터를 이동 시키고 사용해야함
		//int[] arr = new int[3]
		//int[] temparr = new int[arr.length+1];
		//for..............
		//List<String> <><---Collection자료 구조를 가지는 형태는 모두 이렇게 만들어짐
		//List<DataType> ListName = new 초기화<DataType>();
		List<String> list = new ArrayList<>();

		//List 하위에 ArrayList가 있다. 
		//ArrayList 중요함.
		System.out.println(list);
		//list[0] = "String aaa"; // --x 배열의 데이터를 담을때 . index라는 방의 주소에 접근해서
		list.add("java1");
		list.add("java2");
		list.add("java3");
		list.add("java4");
		list.add("java5");
		list.add("java6");
		list.add("java7");
		list.add("java8");
		list.add(2,"JDBC");
		
		//length; size();<Method
		//배열과 구조는 다르지만 index에 접근하는 방식은 같다.
		//단 크기가 한정적으로 제한되어있지 않기때문에 불특정한 데이터를 얻어올때 효과적이다.
		//제일 많이 사용하는 자료구조형
		//DB < 데이터 조회 -> ?건 
		//
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
