package pack10_abs2;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("강아지가 웁니다.");
	}
	@Override
	public void die() {
		System.out.println("강아지는 언제가 죽습니다.");
	}

}
