
public class Amain {
	public static void main(String[] args) {
		A a = new A();// a를 객체 화함
		a.a1 = 1;
		a.a2 = 2; 
		System.out.println(a.a1);
		System.out.println(a.a2);
		
		A.a3 = 3;
		System.out.println(A.a3);
		
		a.voidmethod();
		
//		String aa = a.rtnStr();// aa라는 변수에 값을 담아야함 
//		System.out.println(aa);
		//boolean bool = a.boolMethod(10);
		//if( boolean  )
		//System.out.println( a.insertCoin() );
		if( a.insertCoin()  ) {
			//자판기가 종료 됨 
			//return == true if(){여기 부분을 실행합니다. } else { return false 일때 여기 부분} 
		}else {
			//자판기 다음 로직을 구현 
			System.out.println("자판기 다음 로직이 있는 부분");
		}
		
	}
}
