package pack04;

import pack03.*;

public class C {
	//pack03에 있는 A,B클래스에 접근을 해야되는데 
	//어떤 생성자 까지만 접근이 가능할까? 
	A a1 = new A(true);//public 
	//A a2 = new A(3); //default 접근 제한자로 인해 다른 패키지에서 사용 불가
	//A a3 = new A("문자열"); //private 접근 제한자로 인해 A클래스 내부에서만 사용이 가능
	B b = new B(); // public 
	pack01.B b2 = new pack01.B();//
	//B라는 클래스가 다른 패키지에 내에 같은 이름으로 존재하기 때문에
	//컴파일러가 구분할수있게 앞에 패키지명을 명시 해준다.
	
}

