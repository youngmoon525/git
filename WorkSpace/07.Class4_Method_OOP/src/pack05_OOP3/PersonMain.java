package pack05_OOP3;

public class PersonMain {
	public static void main(String[] args) {

//		dto.setAge(-1);
//		dto.setGender('남');
//		dto.setAge(-1);
//		dto.setAge(-1);
//		dto.setAge(-1); setter사용
//		System.out.println("나이 : " + dto.getAge()); //getter사용
		PersonDTO[] person = new PersonDTO[3];//데이터타입 [ ] 배열이름 = new 데이터타입 [배열크기]
		//배열의 index(주소부) 는 0부터 시작 
		//배열의 크기가 3이라고 했을때 배열의 총 접근가능한 인덱스는 0~ 3-1 > 배열의크기n = n-1
		
		//Object[]형태의 배열에 데이터를 넣는 첫번째 방식 
		//PersonDTO dto = new PersonDTO("홍길동", 33 , 175.5f , 70f , 'M');
		//person[0] = dto;
		//방법 2
		person[0] = new PersonDTO("홍길동", 33 , 175.5f , 70f , 'M');
		person[1] = new PersonDTO("박문수", 30 , 178.5f , 75f , 'M');
		person[2] = new PersonDTO("성춘향", 28 , 179.5f , 71f , 'W');
		person[0].setAge(2);
		PersonDAO dao = new PersonDAO();
		dao.display(person);
		
		//DAO에서 처리를 해야겠다.
//		for (int i = 0; i < person.length; i++) {
//			System.out.println("이름 : " + person[i].getName() );
//		}
	}
}
