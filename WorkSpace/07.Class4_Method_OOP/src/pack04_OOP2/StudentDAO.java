package pack04_OOP2;

public class StudentDAO {
	public void display(StudentDTO dto) {
		//StudentDTO == 인자값
//		방법1)StudentDAO dao  = new StudentDAO(); static을 사용하지 않고 인스턴스화를 통한 접근
//		dto.sum = dao.getSum(dto.kor , dto.eng , dto.mat );
//		dto.avg = dao.Avg(dto.sum );
		dto.sum = getSum(dto.kor , dto.eng , dto.mat );
		dto.avg = getAvg(dto.sum);
		System.out.println("이름 : " + dto.name);
		System.out.println("국어 : " + dto.kor);
		System.out.println("영어 : " + dto.eng);
		System.out.println("수학 : " + dto.mat);
		System.out.println("총점 : " + dto.sum);
		System.out.println("평균 : " + dto.avg);
		System.out.println("===============================");
	}
//방법1)	public int getSum(int kor , int eng , int mat) {
//		return kor + eng + mat ;
//	}
//	public int getAvg(int sum) {
//		return sum / 3 ;
//	}//방법2)
	public static int getSum(int kor , int eng ) {
		return kor + eng  ;
	}
	public static int getSum(int kor , int eng , int mat) {
		return kor + eng + mat ;
	}
	public static int getAvg(int sum) {
		return sum / 3 ;
	}
}
