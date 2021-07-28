package pack04_Anonymous;

public class Amain {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		//익명 객체 필드 사용
		anonymous.field.turnOn();
		anonymous.field.turnOff();
		anonymous.method1();
		//익명 객체 매개값 사용 (매개변수로 넘겨서 사용)
		anonymous.moethod2(new RemoteControl() {
			void turn() {
				System.out.println("익명 객체 내부의 메소드 입니다.");
			}
			@Override
			public void turnOn() {
				System.out.println("어떤 물체의 전원 킵니다.");
				turn();
			}
			
			@Override
			public void turnOff() {
				System.out.println("어떤 물체의 전원 끕니다.");
				
			}
			
			@Override
			public void changeCh() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
