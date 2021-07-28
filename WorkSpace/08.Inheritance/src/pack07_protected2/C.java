package pack07_protected2;

import pack07_Protected1.A;
import pack07_Protected1.B;

public class C {
	public void method() {
		A a = new A();//생성자 메소드를 protected로 막아 놨기 때문에
					  // iv에 접근도 할수가없음(멤버에 접근 불가)
		
		B b = new B(); //public으로 만들어놓은 B는 생성 가능
	}
}
