package pack02_Member;
//실제 이용할 Table을 참조해서 만들어야함
public class MemberDTO {
	private int num ;
	private String name;
	private int age ;
	private String addr;
	private String tel;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		//유효성 체크 , 중복성 체크 
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	//생성자 메소드 
	public MemberDTO(int num, String name, int age, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
}
