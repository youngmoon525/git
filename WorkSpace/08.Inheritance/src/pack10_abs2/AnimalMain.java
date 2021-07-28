package pack10_abs2;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound(); //
		cat.breathe();
		cat.die();
		
		Dog dog = new Dog();
		dog.die();
		//Animal이라는 SuperClass(설계만가능한)
		//die라는 메소드를 강제하고 
		//기능은 "모든 동물은 죽는다."
		//cat . dog 출력
	}
}
