package pack05_imp;

public class ImpMain {
	public static void main(String[] args) {
		ImplementAll ia = new ImplementAll();
		ia.methodA();
		ia.methodB();
		ia.methodC();
		InterfaceA iaA = ia;
		iaA.methodA();      // 
		InterfaceB iaB = ia; 
		iaB.methodB();
	}
}
