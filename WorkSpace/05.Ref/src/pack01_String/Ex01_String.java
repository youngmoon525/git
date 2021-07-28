package pack01_String;

public class Ex01_String {
	public static void main(String[] args) {
		String strVar1 = "김영문";
		String strVar2 = "김영문";
		String strVar3 = new String("김영문");
		String strVar4 = null; // null  != 0 , !=" " 
		System.out.println(strVar4);
//		System.out.println(strVar1 + strVar2 + strVar3);
//		if(strVar1 == strVar3) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
		//문자열의 비교는 == ,!= 가아니다. (== , !=) 
		//참조 비교 (heap영역의 어드레스를 비교)
		//문자열의 비교는 equls를 통해서 한다.
		if(strVar1.equals(strVar3)) {
			System.out.println("strVar1과 strVar3은 문자열이 같다.");
		}else {
			System.out.println("strVar1과 strVar3은 문자열이 다르다.");
		}
		
	}
}
