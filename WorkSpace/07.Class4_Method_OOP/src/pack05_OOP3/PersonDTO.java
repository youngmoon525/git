package pack05_OOP3;

public class PersonDTO {
	// iv에 바로 접근을 막는 방법
	// 접근제어자 : public <-어디서든 접근 가능, private <- 클래스 내부에서만 접근가능
	//멤버변수를 선언 ▶ 접근제어자 : private(외부로부터 접근을 제한)
	//정보 은닉(Information Hiding) , 캡슐화(encapsulation)
	//정보의 신뢰성과 정합성을 높이기 위해서 정보은닉,캡슐화 개념이 들어감
	//getter & setter 이용해서 수정 / 접근
	//마우스 오른쪽 클릭 -> source -> getter and setter 이용 
	private String name; // 이름
	private int age; // 나이
	private float height; // 키
	private float weight; // 몸무게
	private char gender; // 성별

	public PersonDTO() {

	}

	public PersonDTO(String name, int age, float height, float weight, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
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
		if(age > 1) {
		this.age = age;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

	// getter & setter 메소드
	// 메소드를 통해서만 iv에 접근을 허용하기 위해서 private
	// -1 , -1 , -1

//	public PersonDTO(String name, int age, float height, float weight, char gender) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//		this.gender = gender;
//	}

}
