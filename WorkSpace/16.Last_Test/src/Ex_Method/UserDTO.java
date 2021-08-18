package Ex_Method;

public class UserDTO {
	private String userName;//사용자의 이름
	private String id; //사용자의 아이디
	private String pw; //사용자의 비밀번호
	private int age;   //사용자의 나이
	
	public UserDTO(String userName, String id, String pw, int age) {
		this.userName = userName;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
