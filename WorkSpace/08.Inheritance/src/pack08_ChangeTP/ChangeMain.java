package pack08_ChangeTP;

public class ChangeMain {
	public static void main(String[] args) {
		//다형성
		//( 캐스팅 ) int => String => int => double => int UpCastring , DownCasting
		//A a = new A();
		//B b = new B();
		//C c = new C();
		///D d = new D();
		//E e = new E();
		//부모 클래스 라는 SuperClass는 자식클래스를 담을수있는 그릇이 된다.
		//A a = b; // b는 a를 상속 받았기 때문에 
		//A a1 = c; // c는 a..
		//A a2 = d;
		//A a3 = e;	//upcasting 
		//B b2 = (B) a;//down
		//C c2 = (C) new A();//?
		C c = new C();
		c = new E(); //Up캐스팅을 한번 발생시킴
		E e = (E) c;
		//c = e;
		//e = (E) c;
		//e = (E) c; //down Casting을 통해서
		// b = c(extend b)
		//D b1 = d;
		//Child ch = new Child();
//		Parent pt = new Child();
//		Child ch2 =(Child) pt;
//		
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		E e = new E();
//		
//		a = new E(); // up A라는 superClass를 업캐스팅을 이용해서 타입을 맞춰라
//		e =(E) a; // down
//		
//		C c1 = e;//up
//		c = new E();
//		e = (E) c;
		//java version up -chg
		//1.8.26
		//1.8.29
	}
}
