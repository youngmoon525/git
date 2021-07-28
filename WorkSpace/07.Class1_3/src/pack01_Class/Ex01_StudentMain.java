package pack01_Class;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		Ex01_Student s1 = new Ex01_Student();
		//클래쓰이름 클래스명(개발자가 임의로) = new 키워드를 통해서 생성함 (메모리에 올란간다)
		System.out.println("s1이라는 변수(클래스,객체)가 참조를 합니다. " + s1);
		Ex01_Student s2 = new Ex01_Student();
		if(s1 == s2) { // 객체 간의 비교는 참조하는 영역이 같은지의 비교 
			System.out.println("s1과 s2는 같은 영역을 참조합니다.");
		}else {
			System.out.println("s1과 s2는 같은 영역을 참조하지 않습니다." + s2);
		}
		//String , 객체 , 클래쓰 대문자로 시작하는 것들 
		//참조타입의 변수들은 null로 초기화 한다.
		Ex01_Student s3 = null;
		Ex01_Student s4 = null;
		if (s3 == s4) {
			System.out.println("s3과 s4는 같은 영역을 참조합니다. null 메모리 " + s3);
			System.out.println(s4);
		}
		
		if(s3 == null) {
			System.out.println("메모리 참조 안함.");
		}
		
	}
}
