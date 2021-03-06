package pack02_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03_HashMap {
	public static void main(String[] args) {
		// Map 컬렉션
		// Key , Value
		// 구분자 , 값
		// int = Integer
		// Object형태의 클래스를 넣어줘야함
		// = DTO도 넣을수있음
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Java", 30000);
		map.put("Jsp/Servlet", 20000);
		map.put("Android", 30000);
		map.put("Java", 29000);
		System.out.println("Map의 총 Entry 수 : " + map.size());

		// 객체 찾기
		System.out.println("\t Java : " + map.get("Java"));
		System.out.println("=================");

		// 객체를 하나씩 처리하는 방법
		// 내가 만든 HashMap에는 keySet()이라는 객체가 내부에 존재함
		// Set이라는 상위 클래스 keySet을 만들고 내가만든 HashMap에있는 keySet()으로 초기화를함
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator(); // interator를 얻기 위해서 Keyset을 담은거임

		// 데이터의 건수를 알고있을때의 루프 for
		// 데이터의 건수를 모르고있을때의 루프 while
		while (keyInterator.hasNext()) { // 데이터의 건수가 다음 건수로 이동이 될수있을떄==모든데이터에 접근함
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t " + key + " : " + value);
		}

		// 객체를 하나씩 처리하는 방법 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 내가 만들어놓은 map에서 entrySet을 가져옴
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) { // hasNext Iterator map구조를 가지고와서 다음칸이 존재하는지
											// 데이터가 아닌부분에서 시작해서 다음 데이터가 있는지의 체크
			Map.Entry<String, Integer> entry = entryIterator.next();
			// entry라는 객체에 key와 value를 담음
			System.out.println("Entry를 이용해서 출력 " + entry.getKey() + entry.getValue());

		}//while

		// foreach
		// 데이터를 기준으로 for문을 사용하는 방법
		for (Entry<String, Integer> elem : map.entrySet()) {
			System.out.println("키 : " + elem.getKey() + "값 : " + elem.getValue());
		}

	}
}
