package pack05_OOP3;

public class PersonDAO {
	//인자값을 무엇을 받아야 할까?
	//
	public void display(PersonDTO[] person) {
		//이름부터 모든 속성이 출력되게끔 처리
		for (int i = 0; i < person.length; i++) {
			System.out.println("이름 : " + person[i].getName());
			System.out.println("나이 :" + person[i].getAge());
			System.out.println("키 : " + person[i].getHeight());
			System.out.println("몸무게 : " + person[i].getWeight());
			System.out.println("성별 : " + person[i].getGender());
			System.out.println("=========================");
		}
	}
}
