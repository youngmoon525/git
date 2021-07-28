package pack02_Field;

public class Ex03_FieldValue {
	//필드(Field)
	//중괄호 어디서든 존재가능
	//필드는 클래스 사이에 있는것 (변수 x)
	//변수와 선언 형태가 유사함 
	//일반적으로 생각하는 변수 (lv , 로컬변수 , 지역변수 )
	//일반적으로 생각하는 필드 (iv , 인스턴스 변수 , 전역변수 ) 
	//객체가 만들어질때 항상 존재하는것
	//2.필드의 사용
	//필드값에 바로 값을 주는경우(default값) 기본값을 바로 할당해놓은 경우
	//ex)String company = "현대자동차" , 객체이름.company 
	//클래스 외부에서 (객체 외부에서) 생성을 통해 접근을 한 후 값을 변경하여 사용 
	//ex)int speed ; , 객체이름.speed = 60 
	
	//필드 부분
	byte  byteF;
	short shortF;
	int intF = 100;
	long longF;
	float floatF;
	double doubleF;
	char charF = 'A';
	//숫자형 데이터
	
	boolean boolF;
	//논리형
	
	//참조형(ref)
	int[] arrF;
	String strF = "String";

	
	
}//class
