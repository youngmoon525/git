package pack11_abs3;

//사원관리 프로그램 
//abstract - 어떤 기능들을 사용을 꼭 해야되는지를 강제 함
//사원 조회 , 사원 정보 수정 , 사원 정보 삭제 , 사원 정보 추가 
// CRUD -Oracle -Spring 
//PM , PL (Product Manager )  Leader 
//프로젝트의 관리를 맡은사람이 꼭 필요한 기능을 개발자들에게 강제함
//1.객체로 생성하지 못하는 클래스로 만듬 ex)abstract
public abstract class EmployeePG {
	public abstract void select();//사원 정보 조회
	public abstract void update();//사원 정보 수정
	public abstract void delete();//사원 정보 삭제
	public abstract void insert();//사원 정보 추가
}
