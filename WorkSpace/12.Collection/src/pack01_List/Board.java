package pack01_List;
//게시판에 관련 된 내용을 DB에서 가져와서 JAVA 프로그램에서 사용할 목적
//객체
public class Board {
	private String title; //글의 제목
	private String content;  // 글의 내용
	//외부에서 필드에 바로 접근을 허용을 안함
	//생성자 또는 getter&setter를 이용해야만 세팅할수잇게끔
	public Board(String title, String content) {
		//
//		if(title.length() < 1 ) {
//			this.title ="제목없음";
//		}
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		//if(this.title.length <1 ) { return "제목없음"} 
		return title;
	}

	public String getContent() {
		return content;
	}

	
	
	
}
