package pack08_ChangeTP2;

public class ChangeMain {
	public static void main(String[] args) {
		//Child 는 Parent + Child 
		Child ch = new Child();
		ch.method1();
		ch.method2();
		ch.method3();
		ch.method4();
		//상속의 일반적인 사용방법
		
		Prent prent = ch; // 자식 클래스를 부모 클래스에 넣어 놨기 때문에 override된 부분들을
						  // 그대로 가져와서 사용이 가능하다.
		prent.method1();
		prent.method2();
		
		Child aaa = (Child) prent;  // downCasting 캐스팅은 많이 사용안함 
		
		//객체의 타입 비교
		if(ch instanceof Child) {
			System.out.println("child 입니다.");
		}
		if(prent instanceof Prent) {
			System.out.println("Parent 입니다");
		}else {
			System.out.println("아닙니다.");
		}
		
		//file Stream 
		//더 큰 범위의 부모 클래스가 자식클래스로 변환되서 사용되는 경우가 많이 생김
		//다형성 
	}
}
