package pack02_Field;

public class Ex03_FieldMain {
	public static void main(String[] args) {
		//Field라는 객체를 만들고 Field안에 iv (변수,데이터) 
		//를 만들고 불러와서 출력하기 
		//Claas이름 : Ex03_FieldValue
		//byte , short , int , long ,boolean , char , float , double , int[] , String
		//을 사용하는 field(iv)를 만들고 main에서 출력하세요
		//System.out.println(ex03.btyef); // 0
		//객체를 인스턴스화 할때는 new라는 키워드 
//		String aaa = new String();
//		aaa.
		Ex03_FieldValue ef = new Ex03_FieldValue();
		System.out.println(ef.boolF); // false
		System.out.println(ef.charF); // 빈값
		System.out.println(ef.doubleF); // 0.0
		System.out.println(ef.floatF); // 0.0
		System.out.println(ef.intF); // 0
		System.out.println(ef.longF); // 0
		System.out.println(ef.strF); // null  
		System.out.println(ef.arrF); // null
		System.out.println(ef.byteF); //0
		System.out.println(ef.shortF); //0
		//Object(객체)

	
	
	}
}
