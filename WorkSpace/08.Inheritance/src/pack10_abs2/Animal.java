package pack10_abs2;
//추상 클래스는 객체로 만들어서 사용하지 않음
public abstract class Animal {
//어떤 동물이든 가질 수 있는 속성들을 정의해서 사용할수있게함
	public String kind; //종류 -포유류 , 어류 .. 등등
	
	public void breathe() {
		System.out.println("동물이 호흡을 합니다.");
	}
	
	public abstract void sound(); // abstract가 들어간 메소드는 body{} 기능 구현부를
								  // 따로 만들지 않음
	public abstract void die();		//강제하는 메소드를 추가하게 되면 기존에 
									//이 클래스를 상속받았던 클래스들은 전부 오류
}
