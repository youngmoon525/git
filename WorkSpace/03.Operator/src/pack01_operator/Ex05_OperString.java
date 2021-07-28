package pack01_operator;

public class Ex05_OperString {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징(결합,연결)";
		System.out.println(str2);
		//결합
		
		String str3 = "JDK" + (3 + 3.0);//?
		String str4 = 3 + 3.0 + "JDK";//?
		System.out.println(str3);
		System.out.println(str4);
		
	}
}
