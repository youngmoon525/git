
public class Child_Class extends Prent_Class {
	public static void main(String[] args) {
		Child_Class cc= new Child_Class();
		cc.prent_method();
	}
	@Override //재정의 
	public void prent_method() {
		System.out.println("자식 메소드");
	}
}
