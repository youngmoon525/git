
public class Method02 {
	public static void main(String[] args) {
		DrinkDTO[] arr = new DrinkDTO[3];
		method2(arr);
		
		DrinkDTO dto = new DrinkDTO(1, "2", 3);
		method3(dto);//?
		int a = 0;
		method00(a);
	}
	//리턴이 없다.
	public static void method1() {
		
	}
	public static void method00(int a) {
		System.out.println("method00");
	}
	//인자로는 뭐든 받을 수 있다.
	public static void method2(DrinkDTO[] arr) {
		System.out.println("method2");
	}
	public static void method3(DrinkDTO dto) {
		System.out.println("mothod3");	
	}
	public static void method4(String[] dto) {
		System.out.println("mothod4");
	}
	public static DrinkDTO[] arr() {
		DrinkDTO[] arr2 = new DrinkDTO[3]; 
		return arr2;
	}
	
}
