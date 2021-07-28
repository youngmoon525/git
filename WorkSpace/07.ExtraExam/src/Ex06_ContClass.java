
public class Ex06_ContClass {
	//생성자는 iv에 접근해 사용하기 위함
	String field1 ; //객체의 상태 정보(객체를 사용하는 동안에는 계속 유지되는 변수임 iv)
	String field2 ;
	String field3 ;
	//iv
	//생성자 메소드 != 메소드 x
	//생성자 메소드는 클래스의 이름(설계도)을 똑같이 가짐
	//생성자 메소드를 필드를 이용하여 바로 초기화를 하는 방법으로 만들때
	//자동완성 - > 마우스 오른쪽 클릭 - >Source-> Constructor using field
	public Ex06_ContClass(String field1, String field2, String field3) {
		this.field1 = field1; //this 여기 여기에있는 field1에 넘겨준 인자값인 field1
		this.field2 = field2;
		this.field3 = field3;
	}
	public Ex06_ContClass(String field1) {
		this.field1 = field1;
	}

	public Ex06_ContClass(String field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	//빈깡통
	public Ex06_ContClass() {
		
	}
	
	
	public static void main(String[] args) {
		//1번 방법 객체의 필드를 초기화 하고 사용하는 방법
		//빈깡통 : 비어있는 객체를 만든후 직접 객체.field에 접근하여 값을 초기화 하는방법
		//인스턴스화 객체화 완료 된 객체는 객체 내부에 접근제어자가 특별히 존재하지 않으면
		//접근해서 사용할 준비가 완료 된 상태라고 보면 된다.
		Ex06_ContClass ec = new Ex06_ContClass();
		ec.field1 = "field1";
		ec.field2 = "field2";
		ec.field3 = "field3";
		System.out.println(ec.field1 + ec.field2 + ec.field3 );
		
		//2번.생성자 메소드를 이용하는 방법
		//필드에 바로 접근해서 값을 할당하는게 아니라 생성자 메소드를 통해서
		//인자값을 넘겨주고 넘겨준 인자값을 통해 필드의 값을 세팅하는 방법
		Ex06_ContClass ec2 = new Ex06_ContClass("ec2_fd1","ec2_fd2", "ec2_fd3");
		System.out.println(ec2.field1 + ec2.field2 + ec2.field3 );
		//생성자 메소드를 오버로딩해서 인자값을 하나만 입력받는 메소드를 호출해서 생성
		//2개 입력받는 메소드를 호출해 생성
		//값을 출력해 보시오.
		Ex06_ContClass ec3 = new Ex06_ContClass("ec3_fd1");
		System.out.println(ec3.field1 + ec3.field2 + ec3.field3 );
		//ec3
		
		Ex06_ContClass ec4 = new Ex06_ContClass("ec4_fd1", "ec4_fd2");
		System.out.println(ec4.field1 + ec4.field2 + ec4.field3 );
		//ec4
		
	}
	
}
