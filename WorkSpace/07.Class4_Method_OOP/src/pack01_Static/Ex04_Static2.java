package pack01_Static;

import java.util.Arrays;

public class Ex04_Static2 {
	public static void main(String[] args) {
		//String <
		//String Class : 문자열을 조작하기 위한 기능을 담고 있는 static 클래스
		//SumMicroSystem(Oracle) 업체에서 미리 제작하여 개발자에게 제공 ▶ API , Library
		//JRE System Lib > rt.jar > java.lang > String.class
		String str1 = "apple"; //apple 문자열을 str1 변수에 할당
		String str2 = new String("APPLE"); //str2라는 String 객체를 다시 만들어서 할당
		System.out.println(str1 + " : " + str2);
		
		//length() : 문자열의 길이
		//int aa = str1.length();
		System.out.println("str1의 길이 : " +  str1.length());
		
		//toUpperCase() : 대문자로 변경 
		System.out.println("str1을 대문자로 변경 : " + str1.toUpperCase());
		
		//toLowerCase() : 소문자로 변경
		System.out.println("str2를 소문자로 변경 : " + str2.toLowerCase());
		
		//subString() : 특정 문자 추출
		System.out.println(str1.substring(0)); // index 1 부터 끝까지 추출
		System.out.println(str1.substring(3, 5 ));//index의 시작부터 end까지 추출
		System.out.println(str1.substring(3, str1.length() ));//index의 시작부터 end까지 추출
	
		//charAt() : 문자열에서 특정 문자 한 글자만 추출 (char = ' ' ) 
		System.out.println(str2.charAt(3)); // Index 3의 글자를 추출
		
		//indexOf() : 특정 문자의 존재여부 ▶ 존재 : index 반환 , 실패 : -1
		System.out.println(str1.toUpperCase().indexOf("l".toUpperCase() ));// 소문자 -1  // 50
	
		//split() : 문자열 분리 ▶ 결과는 String[] 리턴 (배열 구조로 리턴)
		String[] sp1 = str2.split("");
		System.out.println(Arrays.toString(sp1));
//		for (int i = 0; i < sp1.length; i++) {
//			System.out.println(sp1[i]);
//		}
		String str3 = "가나@다라@마바";
		String[] sp2 = str3.split("@");
		System.out.println(Arrays.toString(sp2));
		
		//replace : 문자열 치환(찾아서 바꾸기)
		System.out.println(str2.replaceAll("PP", "@@")); 
		System.out.println(str2.replaceAll("P", "@@"));
		
		//trim() : 좌우 공백 제거 ※
		String str4 = "   abc   def    ";
		String str5 = "abcdef";
		System.out.println(str4.length());
		System.out.println(str4.trim().length());
		System.out.println(str4.trim());
		//1. str4 = str4.replaceAll(" ", "");
		String[] sp3 = str4.split("");
		for (int i = 0; i < sp3.length; i++) {
			if (sp3[i] != "") {
				str4 += sp3[i];
			}
		}
		if (str4.equals(str5)) {
			System.out.println("문자열의 내용이 같음");
		}else {
			System.out.println("같지 않음");
		}
	
	}
	
	
}
