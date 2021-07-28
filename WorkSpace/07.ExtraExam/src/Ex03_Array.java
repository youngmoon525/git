
public class Ex03_Array {
	public static void main(String[] args) {
		//데이터타입[]<배열이라는 표시 대괄호 
		//배열의 이름
		//new 라는 키워드를 통한 초기화(크기할당)
		int[] intarr = new int[5];
		String[] StrArr = new String[5];
		//Ex03_Array[] ea = new Ex03_Array[5];
		//배열은 크기에 따라 index라는 주소부를 가짐
		//배열의 크기가 n이면 index는 n-1까지 사용이 가능하다.
		//ex)intarr.length==5 , 5=n , index = n-1 , 0~4 
		intarr[0] = 1; 
		intarr[1] = 2; 
		intarr[2] = 3; 
		intarr[3] = 4; 
		intarr[4] = 5;
		StrArr[0] = "A";
		StrArr[1] = "B";
		StrArr[2] = "C";
		StrArr[3] = "D";
		StrArr[4] = "E";
		System.out.println(StrArr[0].toLowerCase());
		//ctrl + alt + 화살표 
//		try {//오류가 날수도 있는 코드를 try블럭 안에 넣어둠 오류가 안난다면 try블럭은 정상적으로
//			//종료가 된다.(메모리에서 삭제)
//			
//			intarr[5] = 5;
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("인덱스 부분에 접근을 잘못함");
//		}
		int[] intArr2 = { 1 , 2 , 3 , 4 , 5 };
		//String[] strArr2 = { 1,2,3,4,5 }; //배열을 만들때 선언해둔 타입과 배열의 원자값
		//배열의 실제값은 타입이 같아야 한다.
		//xxxDTO[] dtoArr = xxxDTO;
//		System.out.println(intarr[0]);
//		System.out.println(intarr[1]);
//		System.out.println(intarr[2]);
//		System.out.println(intarr[3]);
//		System.out.println(intarr[4]);
		System.out.println("intArr2의 크기 " + intArr2.length);
		for(int i=0; i<intArr2.length; i++) {
			System.out.println(intArr2[i]);
		}
		
	}//
}//
