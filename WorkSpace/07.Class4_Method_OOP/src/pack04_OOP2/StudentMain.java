package pack04_OOP2;

public class StudentMain {
	public static void main(String[] args) {
		StudentDTO dto1 =
	new StudentDTO("홍길동",30,50,90,0,0);
		StudentDTO dto2 =
				new StudentDTO("임꺽정",35,50,95,0,0);
		StudentDTO dto3 =
				new StudentDTO("장길산",35,58,90,0,0);
		StudentDAO dao = new StudentDAO(); // 기능 > dao

		dao.display(dto1);
		dao.display(dto2);
		dao.display(dto3);
		
	}
}
