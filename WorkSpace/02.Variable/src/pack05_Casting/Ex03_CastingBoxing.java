package pack05_Casting;

import java.math.BigDecimal;

public class Ex03_CastingBoxing {
	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";
		System.out.println("str1 : " + str1 + "\tstr2 : " + str2);
		System.out.println("String에 +를 하면 연결이 된다." + str1+str2);
		//Parsing
		//WrapperClass , Class는 대문자로 시작함
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1 + num2);
		//numberFormatException 
		String str3 = "4564564";
		int num3 = Integer.parseInt(str3);
		//Boxing의 단점
		//String = 숫자형 데이터 , 문자열 데이터인지 
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		
		String str4 = "12.3";
		String str5 = "45.6";
		System.out.println(str4 + "   " +  str5);
		//syso를 통해서 str4 + str5 의 합을 출력해보세요.
		//boxing double -> Double
		System.out.println(Double.parseDouble(str4) + 
							Double.parseDouble(str5));
		//변수의 초기화는 값을 할당
		//클래스의 초기화는 new를 통한 초기화
		BigDecimal bNum1 = new BigDecimal(str4);
		BigDecimal bNum2 = new BigDecimal(str5);
		System.out.println(bNum1.add(bNum2));
		//대부분의 계산은 DB 
		//String , int , Scanner 
		//Class {} , method {} 
		
		
	}//main
}//class
