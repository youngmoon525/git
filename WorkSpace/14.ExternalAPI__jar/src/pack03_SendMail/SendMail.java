package pack03_SendMail;

import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {
	
	
	//1. Simple Email  , 나중에 Parametter 추가 보낼 내용 , 받는사람 Email............
	public void sendSimple(ArrayList<MailDTO> mailList) {
		SimpleEmail mail = new SimpleEmail();

		mail.setHostName("smtp.naver.com");		//1.메일 서버 지정
		mail.setCharset("utf-8"); // 2.한글 사용을 위한 encoding
		mail.setDebug(true);	  //
		//					    3.로그인 하기 위한 아이디 / 비밀번호 지정
		mail.setAuthentication("로그인아이디", "비밀번호");
		mail.setSSLOnConnect(true);
		//===========================기본 환경 설정 =====================================//
		

		try {
			//메일을 보낸 사람           메일주소 , 이름
			mail.setFrom("보내는 사람이메일", "홍길동");
			//메일을 수신하는(받는) 사람의 정보
		
			
			
			mail.addTo("이메일", "받는사람 일므"); //여러사람에게 보낼때는 addTO를 여러번 쎄팅해주면됨
			
			mail.setSubject("회원가입 축하 메세지 빨리 확인해주세요."); //메일의 제목
			mail.setMsg("누구누구 님! 한울 입교를 진심으로 축하 드립니다."); //메일의 내용
			
			//메일전송버튼을 클릭
			mail.send();
			
		} catch (EmailException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	//2. MultiPart 파일을 첨부하는 메일
	public void sendAttach() {
		MultiPartEmail mail = new MultiPartEmail();
		mail.setHostName("smtp.naver.com"); 
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setAuthentication("본인의이메일주소@naver.com", "본인의패스워드");
		mail.setSSLOnConnect(true);
		//====================기본 설정=============================//
		
		try {
			mail.setFrom("보내는 사람의 이메일" , "한울 관리자");
			mail.addTo("자신의 이메일" , "자신의 이름");
			mail.addTo("youngmoon525@naver.com" , "한울");
			
			mail.setSubject("회원가입 축하 메시지 - 첨부파일 확인 요망!!!");
			mail.setMsg("회원 가입을 축하 합니다 . 첨부 된 파일을 확인 !");
			
			//파일 첨부하기
			EmailAttachment file = new EmailAttachment();//파일을 첨부하기 위한 객체 생성
			file.setPath("‪D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg_5.jpg");
			mail.attach(file);//메일에 파일이 첨부가 됨
			
			file = new EmailAttachment();
			file.setPath("‪D:\\Study_JAVA\\WorkSpace\\13_IOTEST\\IOimg_5.jpg");
			mail.attach(file);//두번째 파일이 첨부가 됨
			
			file = new EmailAttachment();
			file.setURL( new URL("http://www.imageclick.com/imgs/main_intro.jpg") );
			mail.attach(file);
			
			mail.send();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//3. HtmlMail 
	public void sendHtmlMail() {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName("smtp.naver.com"); 
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setAuthentication("본인의이메일주소@naver.com", "본인의패스워드");
		mail.setSSLOnConnect(true);
		//============기본 환경 설정 =====================//  
	
		try {
			mail.setFrom("보내는 사람의 이메일" , "한울 관리자");
			mail.addTo("자신의 이메일" , "자신의 이름");
			mail.addTo("youngmoon525@naver.com" , "한울");
			
			mail.setSubject("회원가입 축하 - HTML 형식의 메일을 테스트중");
			StringBuffer msg = new StringBuffer();//
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<a href='http://hanuledu.co.kr/'> 한울 주소 바로 가기 </a>");
			msg.append("<hr>");
			msg.append("<h2> 한울 개발자 과정 가입 축하 </h2>");
			msg.append("<p> 회원 가입을 축하 드립니다. </p>");
			msg.append("<h1> 첨부 된 파일을 꼭 확인해 주시고 </h1>");
			msg.append("<h3> 프로젝트까지 잘 마무리해서  </h3>");
			msg.append("<p> 취업에 성공하길 기원 합니다.  </p>");
			msg.append("<table>");
			msg.append("<tr>");
			msg.append("<td> </td>");
			msg.append("</tr>");
			msg.append("</table>");
			
			
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			
			//파일 첨부 1.
			//
			
			mail.send();
			
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
