package pack05_imp;

public class ImplementAll implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("메소드 A가 실행이됨 (InterfaceA)");
	}

	@Override
	public void methodB() {
		System.out.println("메소드 B가 실행이됨 (InterfaceB)");
	}

	@Override
	public void methodC() {
		System.out.println("메소드 B가 실행이됨 (InterfaceC)");
		
	}

}
