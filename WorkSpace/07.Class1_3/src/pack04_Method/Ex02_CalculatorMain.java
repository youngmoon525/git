package pack04_Method;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		Ex02_Calculator ec = new Ex02_Calculator();
		//객체 생성
		ec.powerOn();
//		int x , y;
//		x= 3;
//		y= 5;
		//ec.plus == int
		int result = ec.plus(10, 50);
		//String + int = String
		System.out.println("Main - x 와 y의 합은 : " + ec.plus(50, 50));
		System.out.println("Main - x 와 y의 나눈값은 : " + ec.divide(10, 25));
	}
}
