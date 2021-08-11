package pack03_SendSMS;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendMassage {
	public static void main(String[] args) {
		final String api_key = "";
		final String api_secret = "";
		Message coolsms = new Message(api_key, api_secret);
		
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01079972725");
		params.put("from", "01079972725");
		params.put("type", "SMS");   //Message Type (SMS,LMS,MMS,AT)
		params.put("text", "java시간에 문자 테스트 중입니다.");
		params.put("app_version", "JAVA SDK v1.2");
		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toJSONString());
		}catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
		
		
	}
}
