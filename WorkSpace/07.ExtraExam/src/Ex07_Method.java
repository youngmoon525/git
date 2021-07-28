
public class Ex07_Method {
	//Method
	//접근제어자 , public =외부에서 접근이 가능 (이클래스를 벗어난곳), private (이클래스 내부에서만)
	//한정자 static 정적멤버 , 인스턴스 멤버인지의 판단을 해주는 키워드
	//static 있다 = 정적멤버 , static 없다 = 인스턴스 멤버
	//※리턴 타입 
	//리턴 타입이 없다. == void
	//리턴 타입이 있다. == return type (ex. int , String ,double , int[] , Button ,Class )
	//리턴 타입이 있는경우는 반드시 return 키워드를 사용하여 그 값을 반환 해줘야함.
	//인자값 . main (String[] args) 
	//인자값은 , 컴마로 구분하며 갯수의 제한이 없다. 타입의 제한도 없다.
	//ex) int ,String ,double , int[] , String[] , Button , Class , DTO , DAO?-X)
	public static void main(String[] args) {
		//getSum();
		Ex07_Method em = new Ex07_Method();//생성자 메소드를 별도로 만들면 따로 깡통메소드를 만들어줘야함
		em.getSum();
		em.getSum(99);
		em.getSum();
		em.getSum(99, 1);
		em.getMinus();// arr[0][0]  { {} } 
//		int result = em.getMinus(10, 5);
//		System.out.println(result);
		System.out.println(em.getMinus(10,5));
		//getMinus() 반드시 int를 리턴해주기 때문에 == int
		//getBoolean() == boolean 반드시 true,false 값을 리턴해주기 때문에
		//get[]arr() == int[] 
		//getProductDTO == ProductDTO
	}//main
	
	//인스턴스 메소드 
	//인스턴스 클래스의 내부영역에 존재하는 멤버
	//void ==? 리턴 받을게 없다.
	//메소드 오버로딩
	public void getSum() {
		System.out.println("getSum이라는 메소드가 호출됨");
	}
	public void getSum(int x) {
		System.out.println("getSum이라는 메소드가 호출됨" + x);
	}
	public void getSum(int x , int y) {
		System.out.println("getSum이라는 메소드가 호출됨" + "X값 :" + x +"y값 :" + y);
		System.out.println("x 와 y 의 합 : "  +(x+y));
	}
	//	? 결과를 받을 리턴타입을 뭘로 해야할까.
	// void == return타입이 없음
	public int getMinus() {
		System.out.println( "getMinus라는 메소드가 호출됨");
		return 0;//리턴타입이 있는경우 무조건 return int 를 해줘야 된다.
	}
	public double getMinus(int x , int y) {
//		int result = x - y;
		System.out.println("getMinus라는 메소드가 호출됨 " + "x값 : " + x + "y값 : " + y);
//		return result;// == return 0;
		return (x-y); // 10 , 5  = 50
	}
//	public boolean getBoolean() {
//		return false; //return true , false
//	}
//	public int[] getArr() {
//		int[] aar = new int[3];
//		return aar;
//	}
	public int[] getArr(int x) {
		int[] testArr = new int[x];
		return testArr;
	}
	
	
}//class
