package pack06_OOP4;

public class BookDTO {
	private String title ; //제목
	private int price ; //가격
	private String name ; //저자
	private String comp ; //출판사
	int cnt ; //수량
	//private (외부로부터 접근 제한 ) 
	//ex BookDTO 내부에서만 사용이 가능한 iv(field,인스턴스 변수)
	//생성자 메소드 규칙은 클래스의 이름과 생성자 메소드의 이름이 같음
	public BookDTO() {} 
	//① 기본 생성자 메소드 : Default Constuctor Method
	//클래스의 이름과 메소드의 이름이 동일 , 리턴타입이 존재 하지 않음
	//전달 되는 매개변수와 구현부(body{})에 코드가 없다 : 빈깡통
	//생략하면 JVM(cmp)에서 자동으로 생성됨 
	//단, 기본 생성자 메소드가 아닌 생성자 메소드를 만들면 자동으로 생성이 안됨
	//ex) public BookDTO(String title ){} 작성하게 되면 기본 생성자 메소드를 자동으로 생성안해줌
	public BookDTO(String title, int price, String name, String comp) {
		super(); //상위 클래스 : JAVA의 모든 클래스는 Object Class 무조건 상속,08.상속에서 배울거니
		//그냥 무시해도됨
		this.title = title;//매개변수(인자)와 iv(인스턴스변수)를 구분하기위해
		this.price = price;//this라는 키워드를 사용함 (iv앞에 this가 들어감)
		this.name = name;
		this.comp = comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	//② 생성자 메소드를 자동으로 만드는 방법
	//마우스 오른쪽 클릭 -> Souce -> Generate Constructor using field 
	//iv를 이용해서 생성자 메소드를 자동으로 만드는 방법임
	
	//③ getter & setter
	//정보가 외부로부터 보호받는 private 상황이면
	//iv에 바로 접근을 할수가 없기때문에 setter라는 메소드를 이용해서 상태정보를 최신화(세팅)
	//getter를 이용해서 iv의 값을 받아와서 사용이 가능하다.
	//getter == return타입이 있고  ex)int , String 데이터타입과 일치한다/
	//setter == return타입이 없다. void
	//getter&setter는 외부에서 접근이 가능하게 public으로 만들어준다.
	//ex)임시로 만든 getter&setter
	//	public void setTt(String data) {
	//		this.title = data;
	//	}
	//	public String getTt() {
	//		return this.title;
	//	}
	
	
}
