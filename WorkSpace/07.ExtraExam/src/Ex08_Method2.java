
public class Ex08_Method2 { //
	//인스턴스 멤버 , 정적 멤버
	//인스턴스 멤버 -> 정적멤버 사용 가능
	//정적 멤버 -> 인스턴스 멤버 사용 불가능(인스턴스화가 필요함)
	//인스턴스 멤버 , 정적멤버를 구분하는것 static 
	//static int aa = 10;
	public static void main(String[] args) {
		getSum();
		getSum(90);//90%
		//aa = 20;
		//System.out.println(aa);
		
		getMinus();
		getMinus(90);
		getMinus(90, 20);
	}
	//default static void getSum(){
	
	//}
//	public static void getSum() {
//		System.out.println("getSum 메소드에 접근함");
//	}
//	public static void getSum(int x) {
//		System.out.println("getSum 메소드에 접근함" + x);
//	}
//	public static void getSum(int x , int y) {
//		System.out.println("x 와 y의 합은 :" + (x+y));
//	}
	
	public static int getSum() {
		return 10 ; 
	}
	public static int getSum(int x) {
		return x ;
	}
	public static int getSum(int x , int y) {
		//int result = (x + y) ;
		
		return (x + y); // return result;
	}
	//public static을 이용해서 정적 멤버에 정적 메소드인 getMinus
	//메소드 오버로딩을 해서 인자값이 없을때는 syso를 이용하여 문구만 출력하고
	//인자값이 하나일때는 인자값과 syso를 이용하여 문구만 출력하고
	//인자값이 두개일때는 정상적인 minus 작업을 하는 메소드를 만들고 호출하시오.
	public static void getMinus() {
		System.out.println("getMinus 메소드에 접근함");
	}
	public static void getMinus(int x) {
		System.out.println("getMinus 메소드에 접근함" + x);
	}
	public static void getMinus(int x , int y) {
		System.out.println("x 와 y의 빼기 :" + (x - y) );
	}
	
}
