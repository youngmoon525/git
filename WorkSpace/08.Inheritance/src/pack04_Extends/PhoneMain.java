package pack04_Extends;

public class PhoneMain {
	public static void main(String[] args) {
		//객체 생성 (SmartPhone)
		SmartPhone sp = new SmartPhone("5g", "갤럭시노트20", "블랙");
		//CellPhone으로부터 상속받은 필드
		System.out.println(sp.type + sp.model + sp.color);
		
		//CellPhone에서 상속받은 메소드들을 이용 (SuperClass에 이미 구현 된 기능을 상속받아 사용한것)
		sp.powerOn(); // 전화기의 전원을 킴(CellPhone에 있는 기능을 이용해서)
		sp.bell();//전화기를 키고 있더니 전화가 옴
		sp.sendVoice("여보세요~"); // sendVoice메소드를 이용해서 음성을 전송함
		sp.receiveVoice("안녕하세요! 한울직업전문학교 입니다. ");//receiveVoice를 이용하여 상대방의 메세지를 출력
		sp.sendVoice("끊겠습니다. 바쁩니다.");
		sp.hangUp();
		//자식클래스에서 구현한 기능들을 사용함(ChildClass자체에서 구현한 기능)
		sp.onInternet();//인터넷을 킴
		sp.onYoutube();//유튜브를 시청함.
		System.out.println("스마트폰 사용 끝----------------------------------");
		DmbPhone dm = new DmbPhone("DMB폰", "흰색");//CellPhone을 상속받은 DMB폰이라는 객체를 생성함
		System.out.println(dm.model + dm.color);
		dm.powerOn();
		dm.hangUp();
		//DMB폰이라는 객체는 전원을 켰을때 (dm.powerOn()) 문구가 전원을 켭니다가 아니라.(DMB폰의 전원) 이라는 문구가
		//나오게 출력
		//Override = 재정의
	}
}
