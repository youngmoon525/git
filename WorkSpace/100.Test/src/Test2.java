
public class Test2 {
	public static void main(String[] args) {
		methodVoid();
		methodSelect();
		int aa = methodSelect2();
		String aaa = methodSelect3("스트링값1" , "스트링값2");
		
	}
	
	
	public static void methodVoid() {
		//리턴이 없는
		System.out.println("여기서 실행만 하고 끝나는 메소드 입니다.");
	}
	
	public static void methodSelect() {
		System.out.println("조회를 하고 결과를 받아야 합니다.");
	}
	
	public static int methodSelect2() {
		System.out.println("int형 자료를 검색하고 그결과를 int로 리턴합니다.");
		return 0 ;
	}
	public static String methodSelect3(String string, String string2) {
		System.out.println(string + string2);
		return "44444";
	}
	public static int[] methodArr() {
		int[] arr = new int[3];
		return arr;
	}
	public static DrinkDTO[] methodDtos(String name , int price) {
		DrinkDTO[] dtos = new DrinkDTO[3];
		dtos[0] = new DrinkDTO(price, name);
		return dtos;
		
	}
}
