package car;

import Engine.Engine;
import hankook.SnowTire;
import hankook.Tire;
import kumho.BigWidthTire;

public class Car {
	public static void main(String[] args) {
		Engine engine = new Engine();//엔진이라는 패키지에서 차에 필요한 엔진을 객체로 만듬
		SnowTire snowTire = new SnowTire();//hankook이라는 패키지에서 차에 필요한 타이어를 객체로 만듬
		Tire tire = new Tire(); //hankook 패키지
		BigWidthTire bigWidthTire = new BigWidthTire();//Kumho패키지
		kumho.Tire tire4 = new kumho.Tire();
		//Car라는 기능을 완성하기 위해서 
		//엔진이라는 패키지로 객체를 나누고 
		//Tire별로 (기능별로) 패키지를 나누고 
		//이런식으로 기능별로 나누어서 어떤 처리들을 하는 프로그래밍 기법을 객체 지향 프로그래밍
	}
}
