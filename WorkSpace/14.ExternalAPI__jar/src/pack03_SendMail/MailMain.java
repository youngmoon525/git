package pack03_SendMail;

import java.util.ArrayList;

public class MailMain {
	public static void main(String[] args) {
		ArrayList<MailDTO> mailList = new ArrayList<>();
		mailList.add(new MailDTO("youngmoon525@naver.com", "보낼말"));
		SendMail sm = new SendMail();
		sm.sendSimple(mailList);
		//sm.sendSimple();
		//sm.sendAttach();
		
	}
}
