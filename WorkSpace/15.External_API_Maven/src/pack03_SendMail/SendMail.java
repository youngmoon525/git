package pack03_SendMail;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {
	
	public static void main(String[] args) {
		SendMail sm = new SendMail();
		sm.sendSimple();
	}
	
	//1. Simple Email  , 나중에 Parametter 추가 보낼 내용 , 받는사람 Email............
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();

		mail.setHostName("smtp.naver.com");		//1.메일 서버 지정
		mail.setCharset("utf-8"); // 2.한글 사용을 위한 encoding
		mail.setDebug(true);	  //
		//					    3.로그인 하기 위한 아이디 / 비밀번호 지정
		mail.setAuthentication("youngmoon525@naver.com", "비밀번호");
		mail.setSSLOnConnect(true);
		//===========================기본 환경 설정 =====================================//
		

		try {
			//메일을 보낸 사람           메일주소 , 이름
			mail.setFrom("youngmoon525@naver.com" , "홍길동");
			//메일을 수신하는(받는) 사람의 정보
			mail.addTo("youngmoon525@naver.com", "받는사람 일므"); //여러사람에게 보낼때는 addTO를 여러번 쎄팅해주면됨
			
			mail.setSubject("회원가입 축하 메세지 빨리 확인해주세요."); //메일의 제목
			mail.setMsg("누구누구 님! 한울 입교를 진심으로 축하 드립니다."); //메일의 내용
			
			//메일전송버튼을 클릭
			mail.send();
			
		} catch (EmailException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
