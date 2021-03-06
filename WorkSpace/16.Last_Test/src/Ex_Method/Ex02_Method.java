package Ex_Method;

public class Ex02_Method {
	public static void main(String[] args) {
//		String userName = "자기이름";
//		String id = "id";
//		String pw = "pw";
//		int age = 100;
		
//		UserDTO dto = new UserDTO(userName, id, pw, age);
		//변수를 만들어서 UserDTO를 객체화 시키는 방법
		
		//변수를 사용하지 않고(안만들고) UserDTO를 객체화 시키는 방법
		UserDTO dto = new UserDTO("자기이름", "id", "pw", 100);
		System.out.println(dto.getUserName());
		//String userName = "바뀐이름";
		dto.setUserName("바뀐이름");
		System.out.println(dto.getUserName());
		
		Ex02_Method em = new Ex02_Method();//em이라는 이름으로 객체화
		dto = em.rtnDTO(); //메소드의 호출
		System.out.println(dto.getUserName());
		//rtnDTO메소드를 호출해서 우리가 방금까지 사용했었던 dto객체에 결과를 담고
		//syso + dto.getUserName()으로 값을 출력하세요.
		
		UserDTO dto2 = em.rtnDTO();
		System.out.println(dto2.getUserName());
		
		dto = em.rtnDTO("a", "b", "c");
		System.out.println(dto.getUserName());
				
	}
	//static 있는 경우 == 인스턴스화 하지않아도 사용할수있구나 
	//static 없는 경우 ==   인스턴스화를 해야지 사용할수있구나
	public UserDTO rtnDTO() {
		//dto 또는 레퍼런스타입의 기본형태 null
		//DataBase에 접근했다고 생각했을때 조회 된 내용이나 결과가 없다는 뜻<
		UserDTO dto = null;
		dto = new UserDTO("rtnDTO를 통해 만든 이름", "id1", "pw", 30);
		return dto;
	}
	//userName,id,pw 입력 받는 , 입력을 받으려면 받을수있는 통을 준비한다.
	public UserDTO rtnDTO(String userName , String id , String pw) {
		UserDTO dto = null;
		dto = new UserDTO(userName, id, pw, 0);
		return dto; //null == dto에 null을 담아서 return 
	}
	//return타입이 UserDTO인 메소드를 만드는데 파라메타로 UserName과 id , pw를 입력받는 메소드를 만드시오.
	//그리고 그결과를 우리가 만들었던 dto에 담아서 출력해보세요. 
	
	
	
}
