
public class UserDTO {
	private String id ;
	private String pw ;
	private String name ;
	private String admin ;
	private String email ;
	private int money  ;
	
	
	
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



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdmin() {
		return admin;
	}



	public void setAdmin(String admin) {
		this.admin = admin;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public UserDTO(String id, String pw, String name, String admin, String email, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.admin = admin;
		this.email = email;
		this.money = money;
		
	}
	
	
}
