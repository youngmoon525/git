package pack03_enum;

import java.util.Calendar;

public class EnumWeekMain {
	public static void main(String[] args) {
		Week today = null;
		//변수타입 Week 변수명 today 
		//참조타입의 초기값은 null 사용할수가있다.
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch (week) {
		case 1://일
			today = Week.SUNDAY ;break;
		case 2://월
			today = Week.MONDAY ;break;
		case 3://화
			today = Week.TUESDAY ;break;
		case 4://수
			today = Week.WEDNESDAY ;break;
		case 5://목
			today = Week.목요일 ;break;
		case 6://금
			today = Week.FRIDAY ;break;
		case 7://토
			today = Week.SATURDAY ;break;
		}
		
		System.out.println("오늘의 날짜 : " + today);
		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는날");
		}else {
			System.out.println("오늘은 안 쉬는날");
		}
		
		
	}
}
