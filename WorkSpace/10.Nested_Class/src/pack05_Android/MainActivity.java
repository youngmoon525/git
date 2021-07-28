package pack05_Android;

public class MainActivity extends AppComatActivity{

	@Override
	protected void onCreate() {
		Button btn_send = new Button(); //객체 생성은 정상적으로 됨
		btn_send.setOnclickListener(new Button.OnClickListner() {
		
			
			@Override
			public void onClick() {
				System.out.println("메세지를 전송하거나 어떤 버튼을 클릭했을때의 처리");
			}
		});
		
		Button btn_msg = new Button();
		btn_msg.setOnclickListener(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				for(int i = 1 ; i <= 10 ; i++) {
					System.out.println(i);
				}
				
			}//onClick의 내용부 
		});
		//Button btn_msg 라는 객체를 생성하고 onClick했을때
		//for문을 이용하여 1~10까지 출력되게 만들어보세요.
		
		btn_send.click();///실제 클릭을 했다고 가정했을때
		btn_msg.click();
	}
	
	public static void main(String[] args) {
		MainActivity main = new MainActivity();
		main.onCreate();
		//실제 안드로이드 화면이 보였을때 
	}
}
