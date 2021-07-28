package pack03_Constructor;

public class Ex01_Korean {
	//필드 
	String nation = "대한민국";
	String name ;   //이름
	String ssn ; 	// 주민등록번호 
	
	//생성자 메소드 
	//메소드는 메소드이름 () { } 
	//클래스(객체) 메소드 = 기능
	//필드를 초기화 하는 기능을 한다.
	public Ex01_Korean() {
		//메소드 실행 블록
	}
	//매개변수를 받는다.
	//Parameter 
	//	public Ex01_Korean(매개변수 ) 
	public Ex01_Korean(String bbbb) {
		nation = bbbb ;
		//Ex01_Koeran 개발자임의이름 ek = new Ex01_Korean("");
		//매개변수 String n =  생성자 메서드를 호출할때 우리가 넘겨줘야할 값
	}
	//매개변수의 갯수는 제한이 없음 ,컴마로 구분해서 사용 
	//메소드의 이름과 매개변수가 매개변수 타입 똑같으면 사용 불가
	//메소드의 이름은 같으나 매개변수의 갯수만 바꿔서 동일한 이름으로 사용이 가능한
	//메소드 오버 로딩
	public Ex01_Korean(String sName , String sNation) {
		name = sName;
		nation = sNation;
	}
	public Ex01_Korean(String nation, String name, String ssn) {
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}

//	public Ex01_Korean(String sName , String sNation , String sSsn ) {
//		name = sName;
//		nation = sNation;
//		ssn = sSsn;
//	}
	//this 키워드
//	public Ex01_Korean(String nation , String name , String ssn) {
//		//어떤 변수인지 모호 하다.
//		//String nation = Striong nation
//		//this 현재 객체에 있는 iv를 뜻함.
//		this.nation = nation;
//		this.name = name;
//		this.ssn = ssn;
//	}
	
	
}
