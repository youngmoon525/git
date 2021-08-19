package pack03_SendMail;

public class MailDTO {
	private String email;
	private String msg;
	public MailDTO(String email, String msg) {
		super();
		this.email = email;
		this.msg = msg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
