package pack10_abs2;

public class Cat extends Animal{

	
	//Animal이라는 부모클래스에서 강제해놓은 메소드를 일단은 재정의 해놓아야함
	//Super라는 키워드가 없는이유는 메소드를 강제 해놓기만했지 실제로 구현을
	//어떻게 하고 어떤 기능을 하는지에 대한 코딩은 없기 때문
	@Override
	public void sound() {
		System.out.println("고양이가 웁니다.");
	}
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void die() {
		System.out.println("동물은 죽습니다.");
		
	}
	
}
