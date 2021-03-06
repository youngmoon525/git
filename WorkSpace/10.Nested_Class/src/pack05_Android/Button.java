package pack05_Android;

public class Button {
	//nested Interface
	public OnClickListner listener;//인터페이스를 null인 상태로 선언만 해놓음(인스턴스멤버)
	
	//Button과 연결될 setOnclickListner라는 메소드를 만듬
	void setOnclickListener(OnClickListner listner) {
		this.listener = listner;
	}
	
	void click() {
		listener.onClick();
	}
	
	
	//중첩 인터페이스를 사용
	//interface가 최상위가 아니라 클래스 내부에 interface를 구현해놓음
	static interface OnClickListner {
		void onClick();
	}
}
