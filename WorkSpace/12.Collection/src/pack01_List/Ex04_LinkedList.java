package pack01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_LinkedList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		//변수 선언 
		//ArrayList vs LinkedList 속도의 차이를 비교
		
		startTime = System.nanoTime();//System에서 지원해주는 변수 메소드를 통해서
									  //리턴을 받는다 long
		for (int i = 0; i < 10000; i++) {
			list.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + "ns");
		
	}
}
