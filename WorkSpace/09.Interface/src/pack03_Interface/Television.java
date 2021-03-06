package pack03_Interface;
//인터페이스를 사용하려면  
public class Television implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv에 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv에 전원을 끕니다.");
		
	}
	public void turn() {
		System.out.println("임시로 추가한 메소드");
	}
	//volume은 그냥 접근해서 수정할수 없게 만들라.
	//setter를 사용하자 
	@Override
	public void setVolume(int volume) {
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; //10초과 조절이 안되게
		}else if(volume < RemoteControl.MIN_VOLUME) {//0미만로 조절이 안되게
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume; //0~10까지의 수가 입력이 되었을 경우에는 값을 바꾸는것을 허용한다.			
		}
		System.out.println("Tv에 소리를 조절 합니다.  " + this.volume);
		
	}

}
