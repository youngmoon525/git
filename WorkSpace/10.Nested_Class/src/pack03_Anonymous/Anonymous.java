package pack03_Anonymous;

public class Anonymous {
	ParentClass pc = new ParentClass() {
		int pcField1;
		String pcField2;
		void childMethod() {
			System.out.println("익명 객체(자식) 의 메소드 입니다.");
			System.out.println(pcField1 + pcField2);
		}
		//재정의를 해서 원래 부모클래스의 메소드 입니다.
		// = > childMethod() 
		@Override
		void pMethod() {
			//System.out.println("부모 클래스의 메소드 ");
			childMethod();
		}

		
	};//익명객체의 끝
	
	//익명 객체의 생성 
}
