package pack05_Casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		//Number형 자료중에 제일 큰 데이터 타입
		//float 실수형 데이터 타입
		//double > float > int
		double sum = 3.5F + 12;
		//위에 sum은 어떤 형변환이 발생하며 몇번의 형변환이 일어났을까?
		//자동 형 변환
		//① 3.5F + 12.0F ▶int -> Float 
		//② double sum = 15.5f ▶ float -> double 
		System.out.println("sum의 값 : " + sum);
		
		char upper = 'A'; //oracle DB 대문자
		char lower = 'a'; //oracle DB 소문자
		System.out.println(upper);
		System.out.println(lower);
		//소문자 a가 되게 출력을 해보세요 캐스팅을 이용해서
		System.out.println(upper + 32); // char < int
		//97(int) -> (char) 
		System.out.println((char) (upper + 32)   );
		System.out.println((char) (lower - 32)   );
		//97 = a lower -> A 65
	/*	sum의 값 : 15.5
		A
		a
		97
		a
		A*/
		
		
		
	}//main
}//class
