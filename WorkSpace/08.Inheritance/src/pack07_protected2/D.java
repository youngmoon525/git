package pack07_protected2;

import pack07_Protected1.A;

public class D extends A{
	public D() {
		super();
		this.field = "value";//접근가능
		this.method(); //접근 가능
		
	}
}
