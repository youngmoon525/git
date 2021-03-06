package pack04_Anonymous;

public class Anonymous {
	// 필드 초기값으로 InterFace를 대입
	RemoteControl field = new RemoteControl() {
	//tv의 채널을 바꾸는 기능을 넣고싶다.
		public void changeChc() {//<--- 
			System.out.println("tv의 채널을 바꿉니다.");
		}
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			//changeCh();//부모로 부터 물려받은 (재정의) 메소드에서 호출
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");

		}
		@Override
		public void changeCh() {
			//System.out.println("tv의 채널을 바꿉니다.");
			changeChc() ;
		}
	};//익명 객체의 끝
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");	
			}
			@Override
			public void changeCh() {
				System.out.println("Audio의 채널을 바꿉니다.");
			}
		};//localVar
		//익명 객체가 있는곳
		//로컬 변수를 사용해야함
//		int aa = 0 ;///???? //로컬변수의 출력 ( 로컬변수의 사용)
//		System.out.println(aa);
		localVar.turnOff();
	}
	
	void moethod2(RemoteControl rc) {
		rc.turnOn();
	}
}
