package pack01_Thread1;

//자바는 다중상속이 불가능하다.
//이미 다른 클래스를 상속받은 상태에서 Thread를 상속 받을수가없다.▶ 문제 발생
//extend Japangi , Thread -x
//이러한 문제점을 해결하기 위해 Runnable Interface를 제공함.
//Runnable이라는 Interface가 별도로 있음

//interface에서는 별도로 메소드를 수정하지 않으면 메소드를 강제함(abstract)
public class MyThread04 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {
			System.out.print(i +  ", ");
		}
	}

}   /// != Thread 
class MyThread05 implements Runnable{

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i +  ", ");
		}
	}
	
}
//MyThread04.java 파일 내부에  MyThread05를 OuterClass로 중첩시키고 
//MyThread04Main에서 MyThread04,05를 동작 시킨다.
//MyThread04-> 0~30까지 출력
//MyThread05-> a-z까지 출력