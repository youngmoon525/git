package pack01_Variable;

public class Ex01_Variable01 {
	public static void main(String[] args) {
		//변수 선언
		//타입 이름 ; 세미콜론으로 마무리
		//int(정수형 타입)
		//int형 (정수형) 변수를 선언
		//소스파일을 수정하고 저장할때는 ctrl + shift + s
		//java에서는 값을 대입할때 = 를 사용
		int a;
		int b;
		//변수 선언만 된 상태(값x)
		//변수에 값을 할당 (대입) 할때는 변수는 블럭킹내부에서 같은이름으로
		//사용할수가없다.
		a = 10 ;//변수 a 에 값을 대입
		b = 20 ;//변수 b 에 값을 대입
		//값을 할당이 된 상태에서는 이 변수를 활용할수가있다.
		System.out.println(a);
		System.out.println(b);
		
		//문제 int형 변수 c , d 를 선언하고 , 
		//값을 30 과 40으로 각각 할당(대입)
		//하고 출력하시오.
		int c ;
		int d ;
		c = 30;
		d = 40;
		System.out.println(c);
		System.out.println(d);
		//println메소드 안에는 변수가 하나만 들어가야 동작됨
		//리터럴 , 초기화 = 변수를 선언과 동시에 값을 할당
		int e = 50;
		System.out.println(e);
		//변수의 나열 (	변수를 여러개를 콤마(,)를 이용하여 나열할수있다)
		int f=10 , g=20 , h=30 ;
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		int j ;
		j = e ;
		System.out.println(j);
		//변수에 값을 변수를 이용해서 받는 방법
		int k = e + 50 ; // 원래있던 e값 50이 더해진 값이 k에 할당됨
		System.out.println(k);
		k = 1;//101
		

	}
}
