package pack04_OOP2;

public class StudentDTO {
	//상태정보 = iv
	String name ;
	int kor ;
	int eng ;
	int mat ;
	int sum ;
	int avg ;
//	public StudentDTO() {
//		
//	}
	
	public StudentDTO(String name, int kor, int eng, int mat, int sum, int avg) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.avg = avg;
	}
	
}
